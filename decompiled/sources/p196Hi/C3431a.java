package p196Hi;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import com.openai.voice.assistant.AssistantActivity;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0130g;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3980S2;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8159o5;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17780r;
import ug.AbstractC20236s;
import ug.C20226i;
import ug.C20230m;

/* JADX INFO: renamed from: Hi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3431a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10447Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC20236s f10448Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AssistantActivity f10449o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3431a(AbstractC20236s abstractC20236s, AssistantActivity assistantActivity, int i10) {
        super(2);
        this.f10447Y = i10;
        this.f10448Z = abstractC20236s;
        this.f10449o0 = assistantActivity;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10447Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC20236s abstractC20236s = this.f10448Z;
                    boolean z6 = abstractC20236s instanceof C20226i;
                    AssistantActivity assistantActivity = this.f10449o0;
                    if (z6) {
                        c6021p.m6524S(-649162147);
                        if (((C20226i) abstractC20236s).f64019c) {
                            c6021p.m6524S(-649108610);
                            AssistantActivity.m14401s(assistantActivity, (C8870f) c6021p.m6548k(AbstractC8873i.f27157a));
                            c6021p.m6553p(false);
                        } else {
                            c6021p.m6524S(-648988175);
                            c6021p.m6524S(-575121249);
                            boolean zM6542f = c6021p.m6542f(assistantActivity);
                            Object objM6514H = c6021p.m6514H();
                            if (zM6542f || objM6514H == C6013l.f19514a) {
                                objM6514H = new C0130g(assistantActivity, 29);
                                c6021p.m6537c0(objM6514H);
                            }
                            c6021p.m6553p(false);
                            AbstractC3437g.m4190a((InterfaceC1426a) objM6514H, null, c6021p, 0);
                            c6021p.m6553p(false);
                        }
                        c6021p.m6553p(false);
                    } else if (abstractC20236s instanceof C20230m) {
                        c6021p.m6524S(-575115023);
                        C10456n c10456n = C10456n.f30959Y;
                        InterfaceC10459q interfaceC10459qM11206a = AbstractC10833a.m11206a(AbstractC10844c.m11243c(AbstractC10844c.m11244d(c10456n, 1.0f), 0.33f), AbstractC3437g.f10466a, null, 6);
                        InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                        int i10 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11206a);
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                        C21694h c21694h = C21698j.f68874g;
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                            AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                        AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(c10456n, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
                        c6021p.m6553p(true);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-575098948);
                        AssistantActivity.m14401s(assistantActivity, (C8870f) c6021p.m6548k(AbstractC8873i.f27157a));
                        c6021p.m6553p(false);
                    }
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC8159o5.m8721b(AbstractC8411c.m8969c(1365282485, c6021p2, new C3431a(this.f10448Z, this.f10449o0, 0)), c6021p2, 6);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
