package p045Bj;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22177n0;
import p1156zj.EnumC22169k1;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1312j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3464Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Throwable f3465Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1312j(int i10, Throwable th2) {
        super(1);
        this.f3464Y = i10;
        this.f3465Z = th2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3464Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22177n0 c22177n0 = obj2 instanceof C22177n0 ? (C22177n0) obj2 : null;
                if (c22177n0 != null) {
                    action.f42521b = C22177n0.m22397i(c22177n0, EnumC22169k1.f70147Z, null, this.f3465Z, false, false, null, 15863);
                }
                break;
            default:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                Throwable th2 = this.f3465Z;
                it.put("error", th2.toString());
                it.put("message", "Exception in Analytics Scope");
                String string = th2.getStackTrace()[0].toString();
                AbstractC16544l.m18093f(string, "t.stackTrace[0].toString()");
                it.put("caller", string);
                break;
        }
        return C17296C.f55119a;
    }
}
