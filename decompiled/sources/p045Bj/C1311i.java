package p045Bj;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.C1825q0;
import p1156zj.C22109L0;
import p1156zj.C22111M0;
import p1156zj.C22113N0;
import p1156zj.C22115O0;
import p1156zj.C22119Q0;
import p1156zj.C22177n0;
import p173Gj.EnumC3098e;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p647ak.C10671U0;
import p647ak.C10699f1;
import p647ak.C10702g1;
import p647ak.C10705h1;
import p647ak.C10727s;
import p647ak.EnumC10721p;
import p729ej.C13421l;
import p729ej.C13430u;
import p729ej.InterfaceC13410a;
import p838jj.AbstractC16228i;
import p949pj.AbstractC18485q;
import p949pj.C18444Q;
import p949pj.C18445S;
import p949pj.C18450X;
import p949pj.C18451Y;
import p949pj.C18484p0;

/* JADX INFO: renamed from: Bj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1311i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3462Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f3463Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1311i(C13421l c13421l, int i10) {
        super(1);
        this.f3462Y = i10;
        this.f3463Z = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3462Y) {
            case 0:
                AbstractC16544l.m18094g((AbstractC16228i) obj, "it");
                this.f3463Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C1305c.f3445p0));
                return C17296C.f55119a;
            case 1:
                Throwable error = (Throwable) obj;
                AbstractC16544l.m18094g(error, "error");
                this.f3463Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1312j(0, error)));
                return C17296C.f55119a;
            case 2:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C22177n0 c22177n0 = obj2 instanceof C22177n0 ? (C22177n0) obj2 : null;
                if (c22177n0 != null) {
                    if (c22177n0.f70239u0 != EnumC3098e.f9321Y) {
                        this.f3463Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1305c(1, 3)));
                    }
                }
                return C17296C.f55119a;
            case 3:
                Throwable cameraError = (Throwable) obj;
                AbstractC16544l.m18094g(cameraError, "cameraError");
                boolean z6 = cameraError instanceof AbstractC18485q;
                C13421l c13421l = this.f3463Z;
                if (z6) {
                    AbstractC18485q abstractC18485q = (AbstractC18485q) cameraError;
                    if (!(abstractC18485q instanceof C18444Q)) {
                        if (abstractC18485q instanceof C18445S) {
                            c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C10702g1.f31806Y));
                        } else if (abstractC18485q instanceof C18451Y) {
                            c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C10671U0.f31679p0));
                        } else if (abstractC18485q instanceof C18484p0) {
                            c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C10705h1.f31815Y));
                        } else if (abstractC18485q instanceof C18450X) {
                            c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C10671U0.f31680q0));
                        }
                    }
                } else {
                    c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C10699f1(cameraError)));
                }
                return C17296C.f55119a;
            case 4:
                File it = (File) obj;
                AbstractC16544l.m18094g(it, "it");
                ArrayList arrayList = new ArrayList();
                String absolutePath = it.getAbsolutePath();
                AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
                arrayList.add(new C10727s(absolutePath, EnumC10721p.MANUAL));
                this.f3463Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1825q0(6, arrayList)));
                return C17296C.f55119a;
            case 5:
                Throwable cameraError2 = (Throwable) obj;
                AbstractC16544l.m18094g(cameraError2, "cameraError");
                boolean z10 = cameraError2 instanceof AbstractC18485q;
                InterfaceC13410a interfaceC13410a = this.f3463Z.f42503Y;
                if (z10) {
                    AbstractC18485q abstractC18485q2 = (AbstractC18485q) cameraError2;
                    if (!(abstractC18485q2 instanceof C18444Q)) {
                        if (abstractC18485q2 instanceof C18445S) {
                            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22113N0.f69900Y));
                        } else if (abstractC18485q2 instanceof C18451Y) {
                            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69890o0));
                        } else if (abstractC18485q2 instanceof C18484p0) {
                            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22115O0.f69903Y));
                        } else if (abstractC18485q2 instanceof C18450X) {
                            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69891p0));
                        }
                    }
                } else {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C22111M0(cameraError2)));
                }
                return C17296C.f55119a;
            case 6:
                C8340J it2 = (C8340J) obj;
                AbstractC16544l.m18094g(it2, "it");
                return AbstractC8215v5.m8840b(new C22119Q0(it2, this.f3463Z, 0));
            default:
                C8340J it3 = (C8340J) obj;
                AbstractC16544l.m18094g(it3, "it");
                return AbstractC8215v5.m8840b(new C22119Q0(it3, this.f3463Z, 1));
        }
    }
}
