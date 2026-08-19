package p632Zo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.HashSet;
import java.util.Set;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Zo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10431b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30904a;

    public /* synthetic */ C10431b(int i10) {
        this.f30904a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Set m10915a() {
        switch (this.f30904a) {
            case 0:
                HashSet hashSet = new HashSet(1);
                Object obj = new Object[]{'<'}[0];
                Objects.requireNonNull(obj);
                if (hashSet.add(obj)) {
                    return DesugarCollections.unmodifiableSet(hashSet);
                }
                throw new IllegalArgumentException(AbstractC10763a.m11051i(obj, "duplicate element: "));
            case 1:
                HashSet hashSet2 = new HashSet(1);
                Object obj2 = new Object[]{'\\'}[0];
                Objects.requireNonNull(obj2);
                if (hashSet2.add(obj2)) {
                    return DesugarCollections.unmodifiableSet(hashSet2);
                }
                throw new IllegalArgumentException(AbstractC10763a.m11051i(obj2, "duplicate element: "));
            case 2:
                HashSet hashSet3 = new HashSet(1);
                Object obj3 = new Object[]{'`'}[0];
                Objects.requireNonNull(obj3);
                if (hashSet3.add(obj3)) {
                    return DesugarCollections.unmodifiableSet(hashSet3);
                }
                throw new IllegalArgumentException(AbstractC10763a.m11051i(obj3, "duplicate element: "));
            case 3:
                HashSet hashSet4 = new HashSet(1);
                Object obj4 = new Object[]{'&'}[0];
                Objects.requireNonNull(obj4);
                if (hashSet4.add(obj4)) {
                    return DesugarCollections.unmodifiableSet(hashSet4);
                }
                throw new IllegalArgumentException(AbstractC10763a.m11051i(obj4, "duplicate element: "));
            default:
                HashSet hashSet5 = new HashSet(1);
                Object obj5 = new Object[]{'<'}[0];
                Objects.requireNonNull(obj5);
                if (hashSet5.add(obj5)) {
                    return DesugarCollections.unmodifiableSet(hashSet5);
                }
                throw new IllegalArgumentException(AbstractC10763a.m11051i(obj5, "duplicate element: "));
        }
    }
}
