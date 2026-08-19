package io.sentry.android.replay;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.chatgpt.R;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.openai.feature.reporting.ReportingViewModel;
import gf.C14127l;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15112C;
import io.sentry.EnumC15359h;
import io.sentry.android.replay.capture.C15287r;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1106xf.C21202j;
import p1149zc.AbstractC21834C;
import p1149zc.C21855q;
import p1155zi.C21917G1;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4141u3;
import p302M0.AbstractC5253e;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8238y4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p593Y8.C9683j;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.AbstractC11235f;
import p842k0.AbstractC16306o;
import p842k0.C16293b;
import p858ko.C16482A;
import p860l0.C16748i1;
import p860l0.C16757l1;
import p871lf.C16934r;
import p891mf.C17247h;
import p891mf.C17248i;
import p893n.AbstractActivityC17375g;
import p928oh.C18194a;
import p946pc.AbstractC18322G;
import p946pc.C18321F;
import ph.C18416d;
import sg.C19575q;
import td.C19849l;

/* JADX INFO: renamed from: io.sentry.android.replay.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15298l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47786Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f47787Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f47788o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f47789p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15298l(Object obj, Object obj2, Object obj3, int i10) {
        super(2);
        this.f47786Y = i10;
        this.f47787Z = obj;
        this.f47788o0 = obj2;
        this.f47789p0 = obj3;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C15109B c15109b;
        C15109B c15109b2;
        C9683j c9683jMo16244f;
        C9683j c9683jMo16244f2;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f47789p0;
        Object obj4 = this.f47788o0;
        Object obj5 = this.f47787Z;
        switch (this.f47786Y) {
            case 0:
                C15294h onScreenshotRecorded = (C15294h) obj;
                long jLongValue = ((Number) obj2).longValue();
                AbstractC16544l.m18094g(onScreenshotRecorded, "$this$onScreenshotRecorded");
                String str = (String) ((C16525B) obj4).f51262Y;
                Bitmap bitmap = (Bitmap) obj5;
                if (onScreenshotRecorded.m16518k() != null && !bitmap.isRecycled()) {
                    File fileM16518k = onScreenshotRecorded.m16518k();
                    if (fileM16518k != null) {
                        fileM16518k.mkdirs();
                    }
                    File file = new File(onScreenshotRecorded.m16518k(), jLongValue + ".jpg");
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        fileOutputStream.flush();
                        AbstractC7942M5.m8232a(fileOutputStream, null);
                        onScreenshotRecorded.f47778s0.add(new C15295i(file, jLongValue, str));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                ReplayIntegration replayIntegration = (ReplayIntegration) obj3;
                if (replayIntegration.f47666x0 instanceof C15287r) {
                    C15524y1 c15524y1 = replayIntegration.f47657o0;
                    if (c15524y1 == null) {
                        AbstractC16544l.m18103p("options");
                        throw null;
                    }
                    if (c15524y1.getConnectionStatusProvider().mo12581z() == EnumC15112C.DISCONNECTED || (((c15109b = replayIntegration.f47658p0) != null && (c9683jMo16244f2 = c15109b.mo16244f()) != null && c9683jMo16244f2.m10272P(EnumC15359h.All)) || ((c15109b2 = replayIntegration.f47658p0) != null && (c9683jMo16244f = c15109b2.mo16244f()) != null && c9683jMo16244f.m10272P(EnumC15359h.Replay)))) {
                        replayIntegration.mo16265e();
                    }
                }
                return c17296c;
            case 1:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C16293b c16293b = (C16293b) obj5;
                    AbstractC16306o.m17827a(c16293b, (InterfaceC10459q) obj4, AbstractC8411c.m8969c(1156688164, c6021p, new C14127l((AbstractC16546n) obj3, c16293b)), c6021p, 384);
                }
                return c17296c;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C16557y c16557y = (C16557y) obj5;
                C16757l1 c16757l1 = (C16757l1) obj4;
                long jM18537g = c16757l1.m18537g(c16757l1.m18533c(fFloatValue - c16557y.f51286Y));
                C16757l1 c16757l2 = ((C16748i1) obj3).f53725a;
                c16557y.f51286Y += c16757l1.m18533c(c16757l1.m18536f(C16757l1.m18531a(c16757l2, c16757l2.f53764h, jM18537g, 1)));
                return c17296c;
            case 3:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else if (AbstractC16544l.m18089b(((C17247h) ((InterfaceC5985X) obj3).getValue()).f55027b.get(new C16934r((String) obj5)), C21917G1.f69468a)) {
                    c6021p2.m6524S(-593606324);
                    AbstractC3980S2.m4668b(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7313q.f23201f), 0L, AbstractC7313q.f23197b, 0L, 0, c6021p2, 0, 26);
                    c6021p2.m6553p(false);
                } else {
                    c6021p2.m6524S(-593342948);
                    C17309l c17309l = ((C17248i) obj4).f55031b ? new C17309l(Integer.valueOf(R.drawable.pause), Integer.valueOf(R.string.jawbone_disable_action_description)) : new C17309l(Integer.valueOf(R.drawable.play), Integer.valueOf(R.string.jawbone_enable_action_description));
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(((Number) c17309l.f55136Y).intValue(), c6021p2, 0), AbstractC8142m4.m8676d(((Number) c17309l.f55137Z).intValue(), c6021p2), null, 0L, c6021p2, 0, 12);
                    c6021p2.m6553p(false);
                }
                return c17296c;
            case 4:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC18322G.m19848a((C18321F) obj5, AbstractC8411c.m8968b(-180782811, c6021p3, new C14127l((InterfaceC10459q) obj4, 8, (InterfaceC1440o) obj3)), c6021p3, 384);
                }
                return c17296c;
            case 5:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC11235f.m12525a((InterfaceC10459q) obj5, (C18321F) obj4, (C8410b) obj3, c6021p4, 0, 0);
                }
                return c17296c;
            case 6:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d((InterfaceC10459q) obj5, 1.0f), AbstractC7313q.f23201f, 0.0f, 2);
                    float f10 = AbstractC4017a.f12601a;
                    AbstractC4034c4.m4725a(interfaceC10459qM11235m, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p5), 0L, 0L, AbstractC7306j.f23147e, 0.0f, null, AbstractC8411c.m8969c(1519442786, c6021p5, new C18416d((ReportingViewModel) obj4, 9, (C19575q) obj3)), c6021p5, 12582912, 108);
                }
                return c17296c;
            case 7:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj3;
                    if (((C19849l) interfaceC5985X.getValue()).f62940d || (((C19849l) interfaceC5985X.getValue()).f62937a && ((C19849l) interfaceC5985X.getValue()).f62938b.isEmpty())) {
                        c6021p6.m6524S(499363250);
                        AbstractC8238y4.m8880d(0, c6021p6);
                        c6021p6.m6553p(false);
                    } else {
                        c6021p6.m6524S(499433744);
                        C19849l c19849l = (C19849l) interfaceC5985X.getValue();
                        c6021p6.m6524S(154661155);
                        ConversationMoveViewModel conversationMoveViewModel = (ConversationMoveViewModel) obj5;
                        String str2 = (String) obj4;
                        boolean zM6542f = c6021p6.m6542f(conversationMoveViewModel) | c6021p6.m6542f(str2);
                        Object objM6514H = c6021p6.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C18194a(conversationMoveViewModel, 7, str2);
                            c6021p6.m6537c0(objM6514H);
                        }
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                        c6021p6.m6553p(false);
                        c6021p6.m6524S(154666621);
                        boolean zM6542f2 = c6021p6.m6542f(conversationMoveViewModel);
                        Object objM6514H2 = c6021p6.m6514H();
                        if (zM6542f2 || objM6514H2 == c5975s) {
                            objM6514H2 = new C16482A(conversationMoveViewModel, 27);
                            c6021p6.m6537c0(objM6514H2);
                        }
                        c6021p6.m6553p(false);
                        AbstractC8238y4.m8881e(c19849l, interfaceC1436k, (InterfaceC1436k) objM6514H2, c6021p6, 0);
                        c6021p6.m6553p(false);
                    }
                }
                return c17296c;
            default:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    c6021p7.m6524S(164004990);
                    SwitchAccountViewModel switchAccountViewModel = (SwitchAccountViewModel) obj5;
                    AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) obj4;
                    C21855q c21855q = (C21855q) obj3;
                    boolean zM6542f3 = c6021p7.m6542f(switchAccountViewModel) | c6021p7.m6545h(abstractActivityC17375g) | c6021p7.m6545h(c21855q);
                    Object objM6514H3 = c6021p7.m6514H();
                    if (zM6542f3 || objM6514H3 == c5975s) {
                        objM6514H3 = new C21202j(switchAccountViewModel, abstractActivityC17375g, c21855q, 5);
                        c6021p7.m6537c0(objM6514H3);
                    }
                    c6021p7.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H3, null, false, null, null, null, null, null, null, AbstractC21834C.f69294a, c6021p7, 805306368, 510);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15298l(C16293b c16293b, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        super(2);
        this.f47786Y = 1;
        this.f47787Z = c16293b;
        this.f47788o0 = interfaceC10459q;
        this.f47789p0 = (AbstractC16546n) interfaceC1436k;
    }
}
