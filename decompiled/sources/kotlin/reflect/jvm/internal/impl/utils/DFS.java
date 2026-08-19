package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void afterChildren(N n10) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n10) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public C result() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler", "result"));
        }
    }

    public interface Neighbors<N> {
        Iterable<? extends N> getNeighbors(N n10);
    }

    public interface NodeHandler<N, R> {
        void afterChildren(N n10);

        boolean beforeChildren(N n10);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
    }

    public interface Visited<N> {
        boolean checkAndMarkVisited(N n10);
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a */
        public final Set f53309a;

        public VisitedWithSet() {
            this(new HashSet());
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean checkAndMarkVisited(N n10) {
            return this.f53309a.add(n10);
        }

        public VisitedWithSet(Set<N> set) {
            if (set == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'visited' of kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet.<init> must not be null");
            }
            this.f53309a = set;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18447a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dfs(Collection<N> collection, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m18447a(0);
            throw null;
        }
        if (neighbors == null) {
            m18447a(1);
            throw null;
        }
        if (visited == null) {
            m18447a(2);
            throw null;
        }
        if (nodeHandler == null) {
            m18447a(3);
            throw null;
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            doDfs(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    public static <N> void doDfs(N n10, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, ?> nodeHandler) {
        if (n10 == null) {
            m18447a(22);
            throw null;
        }
        if (neighbors == null) {
            m18447a(23);
            throw null;
        }
        if (visited == null) {
            m18447a(24);
            throw null;
        }
        if (nodeHandler == null) {
            m18447a(25);
            throw null;
        }
        if (visited.checkAndMarkVisited(n10) && nodeHandler.beforeChildren(n10)) {
            Iterator<? extends N> it = neighbors.getNeighbors(n10).iterator();
            while (it.hasNext()) {
                doDfs(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.afterChildren(n10);
        }
    }

    public static <N> Boolean ifAny(Collection<N> collection, Neighbors<N> neighbors, InterfaceC1436k interfaceC1436k) {
        if (collection == null) {
            m18447a(7);
            throw null;
        }
        if (neighbors == null) {
            m18447a(8);
            throw null;
        }
        if (interfaceC1436k != null) {
            return (Boolean) dfs(collection, neighbors, new C16641a(interfaceC1436k, new boolean[1]));
        }
        m18447a(9);
        throw null;
    }

    public static <N, R> R dfs(Collection<N> collection, Neighbors<N> neighbors, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m18447a(4);
            throw null;
        }
        if (neighbors == null) {
            m18447a(5);
            throw null;
        }
        if (nodeHandler != null) {
            return (R) dfs(collection, neighbors, new VisitedWithSet(), nodeHandler);
        }
        m18447a(6);
        throw null;
    }
}
