package puzzle;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by heroix on 2016-01-28.
 */
public class SkynetTheVirus {
    Set<Link> links = new HashSet<Link>();
    Set<Integer> gateways = new HashSet<Integer>();

    public static void main(String args[]) {
        new SkynetTheVirus().init();
    }

    private void init() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways


        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            links.add(new Link(N1, N2));
        }

        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            gateways.add(EI);
        }

        // game loop
        while (true) {
            int SI = in.nextInt(); // The index of the node on which the Skynet agent is positioned this turn

            Link link = getCriticalLink(SI);
            links.remove(link);
            System.out.println(link);
        }
    }

    private Link getCriticalLink(int node) {
        Set<Link> nodeLinks = getNodeLinks(node);

        for (Link link : nodeLinks) {
            for (int gateway : gateways) {
                if (link.n1 == gateway || link.n2 == gateway) {
                    return link;
                }
            }
        }
        return nodeLinks.iterator().next();
    }

    private Set<Link> getNodeLinks(int node) {
        Set<Link> result = new HashSet<Link>();
        for (Link link : links) {
            if (link.n1 == node || link.n2 == node) {
                result.add(link);
            }
        }
        return result;
    }

    class Link {
        public int n1;
        public int n2;

        Link(int n1, int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }

        @Override
        public String toString() {
            return n1 + " " + n2;
        }
    }
}
