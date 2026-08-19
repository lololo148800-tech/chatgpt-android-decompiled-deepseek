package p593Y8;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import p140Fa.C2685e;
import p277L.ExecutorC4834g;
import p522V8.EnumC7837d;
import p643a9.InterfaceC10527b;
import p723e9.C13343a;
import p723e9.C13344b;
import p723e9.EnumC13346d;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Y8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9687n implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29201a;

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f29201a) {
            case 0:
                return new ExecutorC4834g(Executors.newSingleThreadExecutor());
            default:
                C2685e c2685e = new C2685e();
                HashMap map = new HashMap();
                EnumC7837d enumC7837d = EnumC7837d.f24731Y;
                Set setEmptySet = Collections.emptySet();
                String str = qffLJgOYizGmMj.DQcCUlxiZa;
                if (setEmptySet == null) {
                    throw new NullPointerException(str);
                }
                map.put(enumC7837d, new C13344b(setEmptySet, 30000L, 86400000L));
                EnumC7837d enumC7837d2 = EnumC7837d.f24733o0;
                Set setEmptySet2 = Collections.emptySet();
                if (setEmptySet2 == null) {
                    throw new NullPointerException(str);
                }
                map.put(enumC7837d2, new C13344b(setEmptySet2, 1000L, 86400000L));
                EnumC7837d enumC7837d3 = EnumC7837d.f24732Z;
                if (Collections.emptySet() == null) {
                    throw new NullPointerException(str);
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(EnumC13346d.f42337Z)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException(str);
                }
                map.put(enumC7837d3, new C13344b(setUnmodifiableSet, 86400000L, 86400000L));
                if (map.keySet().size() < EnumC7837d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C13343a(c2685e, map);
        }
    }
}
