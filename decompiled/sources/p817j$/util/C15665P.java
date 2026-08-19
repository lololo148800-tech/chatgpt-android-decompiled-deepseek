package p817j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.P */
/* JADX INFO: loaded from: classes4.dex */
final class C15665P extends C15742q0 {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ SortedSet f48856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15665P(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f48856f = sortedSet;
    }

    @Override // p817j$.util.C15742q0, p817j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f48856f.comparator();
    }
}
