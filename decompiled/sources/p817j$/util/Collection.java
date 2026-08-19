package p817j$.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p817j$.lang.InterfaceC15531a;
import p817j$.util.stream.AbstractC16012y0;
import p817j$.util.stream.Stream;

/* JADX INFO: loaded from: classes4.dex */
public interface Collection<E> extends InterfaceC15531a {
    @Override // p817j$.util.Collection, p817j$.lang.InterfaceC15531a
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Stream m17239b(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }

        /* JADX INFO: renamed from: c */
        public static Spliterator m17240c(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (collection instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) collection;
                return new C15665P(sortedSet, sortedSet);
            }
            if (collection instanceof Set) {
                return Spliterators.spliterator((Set) collection, 1);
            }
            return collection instanceof List ? List.CC.$default$spliterator((List) collection) : CC.$default$spliterator(collection);
        }

        /* JADX INFO: renamed from: a */
        public static void m17238a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.m17405p(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return Spliterators.spliterator(collection, 0);
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return AbstractC16012y0.m17556f0(EL.m17240c(collection), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            return AbstractC16012y0.m17556f0(EL.m17240c(collection), true);
        }
    }
}
