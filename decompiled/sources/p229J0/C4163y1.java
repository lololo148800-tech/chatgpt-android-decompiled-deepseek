package p229J0;

import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import com.openai.voice.settings.VoiceModeSettingsViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1000s0.C19408d;
import p294Li.AbstractC5094p;
import p324Mn.C5551u;
import p349O0.C5997d;
import p349O0.C6021p;
import p365Oi.InterfaceC6255c;
import p505Uf.C7638A;
import p537W0.C8410b;
import p544W9.AbstractC8572V3;
import p571X9.AbstractC9168M;
import p571X9.AbstractC9274d4;
import p635a1.InterfaceC10459q;
import p842k0.C16305n;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4163y1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13510Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f13511Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f13512o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f13513p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f13514q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f13515r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f13516s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f13517t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f13518u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4163y1(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, boolean z6, C4151w1 c4151w1, InterfaceC17406l interfaceC17406l, InterfaceC1439n interfaceC1439n, int i10, int i11) {
        super(2);
        this.f13515r0 = interfaceC1426a;
        this.f13512o0 = interfaceC10459q;
        this.f13511Z = z6;
        this.f13516s0 = c4151w1;
        this.f13517t0 = interfaceC17406l;
        this.f13518u0 = interfaceC1439n;
        this.f13513p0 = i10;
        this.f13514q0 = i11;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13510Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f13513p0 | 1);
                C4151w1 c4151w1 = (C4151w1) this.f13516s0;
                AbstractC3984T1.m4693l((InterfaceC1426a) this.f13515r0, this.f13512o0, this.f13511Z, c4151w1, (InterfaceC17406l) this.f13517t0, (InterfaceC1439n) this.f13518u0, (C6021p) obj, iM6447d0, this.f13514q0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f13513p0 | 1);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f13517t0;
                AbstractC5094p.m5660b((InterfaceC6255c) this.f13515r0, this.f13511Z, (C19408d) this.f13516s0, interfaceC1436k, this.f13512o0, (VoiceModeSettingsViewModel) this.f13518u0, (C6021p) obj, iM6447d1, this.f13514q0);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f13513p0 | 1);
                C8410b c8410b = (C8410b) this.f13515r0;
                InterfaceC1440o interfaceC1440o = (InterfaceC1440o) this.f13516s0;
                AbstractC9274d4.m9842a(c8410b, this.f13512o0, (InterfaceC1439n) this.f13518u0, interfaceC1440o, this.f13511Z, (C3911F4) this.f13517t0, (C6021p) obj, iM6447d2, this.f13514q0);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iM6447d3 = C5997d.m6447d0(this.f13513p0 | 1);
                C8410b c8410b2 = (C8410b) this.f13518u0;
                ?? r6 = (AbstractC16546n) this.f13517t0;
                InterfaceC10459q interfaceC10459q = this.f13512o0;
                AbstractC8572V3.m9237b((C16305n) this.f13516s0, (InterfaceC1426a) this.f13515r0, r6, interfaceC10459q, this.f13511Z, c8410b2, (C6021p) obj, iM6447d3, this.f13514q0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d4 = C5997d.m6447d0(this.f13513p0 | 1);
                C7638A c7638a = (C7638A) this.f13516s0;
                AbstractC9168M.m9719a((String) this.f13515r0, this.f13511Z, this.f13512o0, c7638a, (C5551u) this.f13517t0, (JawboneToolViewModel) this.f13518u0, (C6021p) obj, iM6447d4, this.f13514q0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4163y1(InterfaceC6255c interfaceC6255c, boolean z6, C19408d c19408d, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, VoiceModeSettingsViewModel voiceModeSettingsViewModel, int i10, int i11) {
        super(2);
        this.f13515r0 = interfaceC6255c;
        this.f13511Z = z6;
        this.f13516s0 = c19408d;
        this.f13517t0 = interfaceC1436k;
        this.f13512o0 = interfaceC10459q;
        this.f13518u0 = voiceModeSettingsViewModel;
        this.f13513p0 = i10;
        this.f13514q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4163y1(C8410b c8410b, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC1440o interfaceC1440o, boolean z6, C3911F4 c3911f4, int i10, int i11) {
        super(2);
        this.f13515r0 = c8410b;
        this.f13512o0 = interfaceC10459q;
        this.f13518u0 = interfaceC1439n;
        this.f13516s0 = interfaceC1440o;
        this.f13511Z = z6;
        this.f13517t0 = c3911f4;
        this.f13513p0 = i10;
        this.f13514q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4163y1(String str, boolean z6, InterfaceC10459q interfaceC10459q, C7638A c7638a, C5551u c5551u, JawboneToolViewModel jawboneToolViewModel, int i10, int i11) {
        super(2);
        this.f13515r0 = str;
        this.f13511Z = z6;
        this.f13512o0 = interfaceC10459q;
        this.f13516s0 = c7638a;
        this.f13517t0 = c5551u;
        this.f13518u0 = jawboneToolViewModel;
        this.f13513p0 = i10;
        this.f13514q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4163y1(C16305n c16305n, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z6, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f13516s0 = c16305n;
        this.f13515r0 = interfaceC1426a;
        this.f13517t0 = (AbstractC16546n) interfaceC1436k;
        this.f13512o0 = interfaceC10459q;
        this.f13511Z = z6;
        this.f13518u0 = c8410b;
        this.f13513p0 = i10;
        this.f13514q0 = i11;
    }
}
