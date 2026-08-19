package p672c3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p417R2.C6790b;
import p417R2.C6795g;
import p571X9.AbstractC9233X;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.C17691y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.P */
/* JADX INFO: loaded from: classes.dex */
public final class C11583P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f35028Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f35029Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f35030o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11583P(String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35029Z = str;
        this.f35030o0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11583P c11583p = new C11583P(this.f35029Z, this.f35030o0, interfaceC18770c);
        c11583p.f35028Y = obj;
        return c11583p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11583P) create((C6790b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6790b c6790b = (C6790b) this.f35028Y;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(c6790b.f21795a);
        AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(mapUnmodifiableMap);
        C6790b c6790b2 = new C6790b(linkedHashMapM19256r, false);
        C6795g key = C11584Q.f35034g;
        AbstractC16544l.m18094g(key, "key");
        Set set = (Set) c6790b.f21795a.get(key);
        if (set == null) {
            set = C17691y.f56482Y;
        }
        String str = this.f35029Z;
        c6790b2.m7234b(key, AbstractC17665J.m19267g(set, str));
        C11584Q.f35031d.getClass();
        String name = "provider:".concat(str);
        AbstractC16544l.m18094g(name, "name");
        c6790b2.m7234b(new C6795g(name), this.f35030o0);
        Map mapUnmodifiableMap2 = DesugarCollections.unmodifiableMap(linkedHashMapM19256r);
        AbstractC16544l.m18093f(mapUnmodifiableMap2, "unmodifiableMap(preferencesMap)");
        return new C6790b(AbstractC17659D.m19256r(mapUnmodifiableMap2), true);
    }
}
