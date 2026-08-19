package p124Ei;

import android.content.Context;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1143z4.C21795y;
import p1155zi.EnumC21896B0;
import p152Fm.AbstractC2922d;
import p179H0.C3196n;
import p195Hh.C3430e;
import p229J0.C4171z3;
import p318Mh.AbstractC5364G0;
import p318Mh.C5365H;
import p341Ni.EnumC5802v;
import p349O0.InterfaceC5985X;
import p544W9.AbstractC8663k4;
import p553Wh.C8870f;
import p620Zc.InterfaceC10277b;
import p795i.C14889c;

/* JADX INFO: renamed from: Ei.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2550w0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7962Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f7963Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7964o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2550w0(Object obj, boolean z6, int i10) {
        super(0);
        this.f7962Y = i10;
        this.f7964o0 = obj;
        this.f7963Z = z6;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        boolean z6 = true;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f7964o0;
        boolean z10 = this.f7963Z;
        switch (this.f7962Y) {
            case 0:
                if (z10) {
                    C3430e c3430e = VoiceModeForegroundService.f40396o0;
                    AbstractC8663k4.m9357c((Context) obj, EnumC5802v.f18949Y);
                }
                return c17296c;
            case 1:
                if (!z10 && ((C3196n) obj).f9642e.m6409g() <= 0.5f) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 2:
                if (z10) {
                    ((InterfaceC5985X) obj).setValue(Boolean.TRUE);
                }
                return c17296c;
            case 3:
                C21795y c21795y = ((C8870f) obj).f27149b;
                C5365H c5365h = C5365H.f17604g;
                EnumC21896B0 enumC21896B0 = z10 ? EnumC21896B0.TemporaryConversation : EnumC21896B0.NoMemoryTemporaryConversation;
                c5365h.getClass();
                AbstractC5364G0.m5889d(c21795y, c5365h.m5885a(new C4171z3(enumC21896B0, 13)), true);
                return c17296c;
            case 4:
                ((C14889c) obj).m15541c(z10);
                return c17296c;
            case 5:
                if (z10) {
                    ((AbstractC16546n) obj).invoke();
                }
                return c17296c;
            default:
                if (z10) {
                    AbstractC2922d.f8758Y.getClass();
                    ((InterfaceC10277b) obj).mo10875e(AbstractC2922d.f8759Z.mo3725f().nextFloat() / 2.0f);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2550w0(boolean z6, InterfaceC1426a interfaceC1426a) {
        super(0);
        this.f7962Y = 5;
        this.f7963Z = z6;
        this.f7964o0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2550w0(boolean z6, Object obj, int i10) {
        super(0);
        this.f7962Y = i10;
        this.f7963Z = z6;
        this.f7964o0 = obj;
    }
}
