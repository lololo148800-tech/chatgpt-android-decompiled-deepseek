package p197Hj;

import android.content.Context;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModel;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import fo.C13711h;
import gd.C13934f;
import io.livekit.android.room.C15102a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.VideoSink;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.InterfaceC0620k;
import p049Bm.InterfaceC1426a;
import p1140z1.AbstractC21690f;
import p1155zi.EnumC21895B;
import p203I0.C3544a;
import p203I0.C3545b;
import p216Id.C3694b;
import p219Ig.C3712a;
import p229J0.C3935J4;
import p229J0.C4036d0;
import p229J0.InterfaceC3923H4;
import p233J4.C4259e;
import p233J4.C4260f;
import p247Jj.C4390J0;
import p247Jj.C4391K;
import p247Jj.C4449p0;
import p254K0.C4516m;
import p254K0.C4525v;
import p268Kf.C4666u;
import p273Kl.C4716E;
import p273Kl.C4724I;
import p284L7.C4957b;
import p291Lf.C5020q;
import p316Mf.C5341h;
import p332N8.C5678b;
import p336Nc.C5706b;
import p341Ni.C5769a;
import p341Ni.C5784h0;
import p341Ni.C5785i;
import p349O0.C5964M;
import p349O0.C5966N;
import p349O0.C5983W;
import p349O0.C5994b0;
import p349O0.C6006h0;
import p349O0.C6032u0;
import p349O0.EnumC6020o0;
import p350O1.C6048F;
import p351O2.C6084G;
import p376P7.C6374a;
import p387Pl.AbstractC6482b0;
import p387Pl.C6494n;
import p408Qj.C6739e;
import p477Tb.C7296c;
import p492U1.InterfaceC7537b;
import p530Vi.AbstractC8301I;
import p692d0.C12951D;
import p909nm.AbstractC17681o;
import p972qm.C18777j;

/* JADX INFO: renamed from: Hj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3457c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10511Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f10512Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3457c(Object obj, int i10) {
        super(0);
        this.f10511Y = i10;
        this.f10512Z = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    private final Object m4193a() {
        File file = (File) ((C6084G) this.f10512Z).f19811a.invoke();
        String it = file.getAbsolutePath();
        synchronized (C6084G.f19810k) {
            LinkedHashSet linkedHashSet = C6084G.f19809j;
            if (linkedHashSet.contains(it)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            AbstractC16544l.m18093f(it, "it");
            linkedHashSet.add(it);
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0282  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [O0.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object[]] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws Throwable {
        View viewFindViewById;
        float fM8920k;
        C3935J4 state;
        C4259e c4259e;
        InterfaceC1426a interfaceC1426a;
        InterfaceC0620k interfaceC0620kM6608x;
        int i10 = 0;
        switch (this.f10511Y) {
            case 0:
                SpotlightView spotlightView = (SpotlightView) this.f10512Z;
                Object parent = spotlightView.getParent();
                if ((parent instanceof View) && (viewFindViewById = ((View) parent).findViewById(spotlightView.f40654o0)) != null) {
                    viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3456b(spotlightView, i10));
                    int left = viewFindViewById.getLeft();
                    int top = viewFindViewById.getTop();
                    int right = viewFindViewById.getRight();
                    int bottom = viewFindViewById.getBottom();
                    Path path = new Path();
                    float f10 = spotlightView.radius;
                    path.addRoundRect(left, top, right, bottom, f10, f10, Path.Direction.CW);
                    spotlightView.f40656q0 = path;
                    spotlightView.invalidate();
                }
                return C17296C.f55119a;
            case 1:
                C3544a c3544a = (C3544a) this.f10512Z;
                c3544a.f10740v0.setValue(Boolean.valueOf(!((Boolean) c3544a.f10740v0.getValue()).booleanValue()));
                return C17296C.f55119a;
            case 2:
                AbstractC21690f.m22209n((C3545b) this.f10512Z);
                return C17296C.f55119a;
            case 3:
                C3694b c3694b = (C3694b) this.f10512Z;
                String str = c3694b.f11218c;
                if (str != null) {
                    return c3694b.m4408a(str);
                }
                return null;
            case 4:
                ((DeactivatedAccountViewModel) this.f10512Z).m14395k(C3712a.f11262a);
                return C17296C.f55119a;
            case 5:
                InterfaceC3923H4 interfaceC3923H4 = (InterfaceC3923H4) this.f10512Z;
                if (interfaceC3923H4 == null || (state = interfaceC3923H4.getState()) == null) {
                    fM8920k = 0.0f;
                } else {
                    C5994b0 c5994b0 = state.f12115a;
                    if (c5994b0.m6409g() == 0.0f) {
                        fM8920k = 0.0f;
                    } else {
                        fM8920k = 1 - (AbstractC8301I.m8920k(c5994b0.m6409g() - state.f12116b.m6409g(), c5994b0.m6409g(), 0.0f) / c5994b0.m6409g());
                    }
                }
                return Float.valueOf(fM8920k > 0.01f ? 1.0f : 0.0f);
            case 6:
                return Float.valueOf(((C4036d0) this.f10512Z).f12708a.f11737c.m12653w());
            case 7:
                return Float.valueOf(((InterfaceC7537b) this.f10512Z).mo7864b0(125));
            case 8:
                C4260f c4260f = (C4260f) this.f10512Z;
                if (c4260f.f13918Z == null || !c4260f.f13920p0) {
                    c4259e = new C4259e(c4260f.f13917Y, c4260f.f13918Z, new C7296c(15), c4260f.f13919o0, c4260f.f13921q0);
                } else {
                    Context context = c4260f.f13917Y;
                    AbstractC16544l.m18094g(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    AbstractC16544l.m18093f(noBackupFilesDir, "context.noBackupFilesDir");
                    c4259e = new C4259e(c4260f.f13917Y, new File(noBackupFilesDir, c4260f.f13918Z).getAbsolutePath(), new C7296c(15), c4260f.f13919o0, c4260f.f13921q0);
                }
                c4259e.setWriteAheadLoggingEnabled(c4260f.f13923s0);
                return c4259e;
            case 9:
                return (ViewModelStoreOwner) ((C4391K) this.f10512Z).invoke();
            case 10:
                ((C4449p0) this.f10512Z).f14488c.invoke();
                return C17296C.f55119a;
            case 11:
                return ((C4390J0) this.f10512Z).f14267i.f29817b;
            case 12:
                return (C4525v) ((C4516m) this.f10512Z).f14757d.getValue();
            case 13:
                return (String) ((C4666u) this.f10512Z).f15196b.m15477a(C13934f.f43984d);
            case 14:
                ((C4716E) this.f10512Z).f15339a.m16215g();
                return C17296C.f55119a;
            case 15:
                AbstractC0575H.m1161I(C18777j.f59682Y, new C4724I((C15102a) this.f10512Z, null));
                return C17296C.f55119a;
            case 16:
                return new C6374a(((C4957b) this.f10512Z).f16171Y.mo15463s());
            case 17:
                C5020q c5020q = (C5020q) this.f10512Z;
                if (c5020q != null && (interfaceC1426a = c5020q.f16383a) != null) {
                    interfaceC1426a.invoke();
                }
                return C17296C.f55119a;
            case 18:
                ((MessageFeedbackViewModel) this.f10512Z).m14395k(C5341h.f17560a);
                return C17296C.f55119a;
            case 19:
                return ((C5678b) this.f10512Z).m6111a();
            case 20:
                if (((C5706b) this.f10512Z).f18492Y != EnumC21895B.f69419Z) {
                    Log.i("DataDog", "DataDog backpressure threshold reached");
                }
                return C17296C.f55119a;
            case 21:
                C5784h0 c5784h0 = (C5784h0) this.f10512Z;
                return new C5785i(c5784h0.f18850b, c5784h0.f18849a, C5769a.f18789Y, true ^ c5784h0.f18868t);
            case 22:
                C6006h0 c6006h0 = (C6006h0) this.f10512Z;
                C12951D c12951d = new C12951D(c6006h0.f19502a.size());
                ArrayList arrayList = c6006h0.f19502a;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ?? M19384m = (C5966N) arrayList.get(i11);
                    Object obj = M19384m.f19421b;
                    int i12 = M19384m.f19420a;
                    Object c5964m = obj != null ? new C5964M(Integer.valueOf(i12), M19384m.f19421b) : Integer.valueOf(i12);
                    int iM14618d = c12951d.m14618d(c5964m);
                    boolean z6 = iM14618d < 0;
                    Object obj2 = z6 ? null : c12951d.f41125c[iM14618d];
                    if (obj2 != null) {
                        if (AbstractC16529F.m18083g(obj2)) {
                            List listM18078b = AbstractC16529F.m18078b(obj2);
                            listM18078b.add(M19384m);
                            M19384m = listM18078b;
                        } else {
                            M19384m = AbstractC17681o.m19384m(new Object[]{obj2, M19384m});
                        }
                    }
                    if (z6) {
                        int i13 = ~iM14618d;
                        c12951d.f41124b[i13] = c5964m;
                        c12951d.f41125c[i13] = M19384m;
                    } else {
                        c12951d.f41125c[iM14618d] = M19384m;
                    }
                }
                return new C5983W(c12951d);
            case 23:
                C6032u0 c6032u0 = (C6032u0) this.f10512Z;
                synchronized (c6032u0.f19647c) {
                    interfaceC0620kM6608x = c6032u0.m6608x();
                    if (((EnumC6020o0) c6032u0.f19663s.getValue()).compareTo(EnumC6020o0.f19543Z) <= 0) {
                        throw AbstractC0575H.m1172a("Recomposer shutdown; frame clock awaiter will never resume", c6032u0.f19649e);
                    }
                }
                if (interfaceC0620kM6608x != null) {
                    ((C0624m) interfaceC0620kM6608x).resumeWith(C17296C.f55119a);
                }
                return C17296C.f55119a;
            case 24:
                Object systemService = ((View) ((C13711h) this.f10512Z).f43259Z).getContext().getSystemService("input_method");
                AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 25:
                return new BaseInputConnection(((C6048F) this.f10512Z).f19692a, false);
            case 26:
                return m4193a();
            case 27:
                ((C6494n) this.f10512Z).mo7039f();
                return C17296C.f55119a;
            case 28:
                AbstractC6482b0 abstractC6482b0 = (AbstractC6482b0) this.f10512Z;
                boolean zM7052d = abstractC6482b0.m7052d();
                ArrayList arrayList2 = abstractC6482b0.f21038j;
                if (!zM7052d) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        abstractC6482b0.mo7051c().removeSink((VideoSink) it.next());
                    }
                }
                arrayList2.clear();
                return C17296C.f55119a;
            default:
                ((C6739e) this.f10512Z).f21640t0.invoke();
                return C17296C.f55119a;
        }
    }
}
