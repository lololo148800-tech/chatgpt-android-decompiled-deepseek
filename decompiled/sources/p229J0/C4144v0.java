package p229J0;

import android.content.Context;
import android.graphics.Path;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputConfirmationCodeComponent;
import ge.AbstractC14068c;
import ge.C14054U;
import ge.C14063Z;
import ge.C14111x0;
import hk.C14525c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import np.InterfaceC17710b;
import p002A0.C0146w;
import p003A1.C0155B1;
import p008A6.C0386f;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p050Bn.C1450d;
import p080D0.C1825q0;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p1113xn.AbstractC21322p;
import p124Ei.C2535p;
import p153Fn.C2925c;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p195Hh.C3430e;
import p225Im.InterfaceC3776x;
import p349O0.C5996c0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p364Oh.C6226E;
import p402Qc.C6593i;
import p409Qk.C6754e;
import p457Sh.C7136d;
import p457Sh.C7137e;
import p523V9.AbstractC7861C4;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p537W0.C8410b;
import p556Wk.AbstractC8910Y;
import p556Wk.AbstractC8927i;
import p556Wk.C8926h;
import p594Y9.AbstractC9930m3;
import p604Yk.AbstractC10084i;
import p628Zk.C10416o;
import p628Zk.InterfaceC10407f;
import p658b5.C11232c;
import p666bl.AbstractC11497m;
import p749fd.AbstractC13620e;
import p749fd.C13625j;
import p758g0.C13767i0;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.C14353i;
import p774h1.C14354j;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p775h2.AbstractC14376f;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p858ko.C16484C;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17792x;
import p911o0.C17782s;
import p936p0.C18265e;

/* JADX INFO: renamed from: J0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4144v0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13422Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f13423Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f13424o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f13425p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f13426q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f13427r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f13428s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4144v0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(1);
        this.f13422Y = i10;
        this.f13423Z = obj;
        this.f13424o0 = obj2;
        this.f13425p0 = obj3;
        this.f13426q0 = obj4;
        this.f13427r0 = obj5;
        this.f13428s0 = obj6;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v31, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Path path;
        Context context;
        EditText editText;
        EditText editText2;
        int i10 = 9;
        int i11 = 8;
        int i12 = 2;
        int i13 = 0;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f13428s0;
        Object obj3 = this.f13427r0;
        Object obj4 = this.f13426q0;
        Object obj5 = this.f13425p0;
        Object obj6 = this.f13424o0;
        Object obj7 = this.f13423Z;
        switch (this.f13422Y) {
            case 0:
                InterfaceC16039d interfaceC16039d = (InterfaceC16039d) obj;
                float fFloor = (float) Math.floor(interfaceC16039d.mo7864b0(AbstractC4150w0.f13445c));
                long j10 = ((C14365u) ((InterfaceC5982V0) obj7).getValue()).f45062a;
                long j11 = ((C14365u) ((InterfaceC5982V0) obj6).getValue()).f45062a;
                float fMo7864b0 = interfaceC16039d.mo7864b0(AbstractC4150w0.f13446d);
                float f10 = fFloor / 2.0f;
                C16043h c16043h = new C16043h(fFloor, 0.0f, 0, 0, 30);
                float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i());
                boolean zM15775c = C14365u.m15775c(j10, j11);
                C16042g c16042g = C16042g.f49483a;
                if (zM15775c) {
                    AbstractC14376f.m15852r(interfaceC16039d, j10, 0L, AbstractC8112i6.m8603a(fM15333e, fM15333e), AbstractC8072d6.m8484a(fMo7864b0, fMo7864b0), c16042g, 226);
                } else {
                    long jM8536b = AbstractC8088f6.m8536b(fFloor, fFloor);
                    float f11 = fM15333e - (2 * fFloor);
                    long jM8603a = AbstractC8112i6.m8603a(f11, f11);
                    float fMax = Math.max(0.0f, fMo7864b0 - fFloor);
                    AbstractC14376f.m15852r(interfaceC16039d, j10, jM8536b, jM8603a, AbstractC8072d6.m8484a(fMax, fMax), c16042g, 224);
                    float f12 = fM15333e - fFloor;
                    float f13 = fMo7864b0 - f10;
                    AbstractC14376f.m15852r(interfaceC16039d, j11, AbstractC8088f6.m8536b(f10, f10), AbstractC8112i6.m8603a(f12, f12), AbstractC8072d6.m8484a(f13, f13), c16043h, 224);
                }
                long j12 = ((C14365u) ((InterfaceC5982V0) obj5).getValue()).f45062a;
                float fFloatValue = ((Number) ((C13767i0) obj4).f43468t0.getValue()).floatValue();
                float fFloatValue2 = ((Number) ((C13767i0) obj3).f43468t0.getValue()).floatValue();
                C16043h c16043h2 = new C16043h(fFloor, 0.0f, 2, 0, 26);
                float fM15333e2 = C13803e.m15333e(interfaceC16039d.mo17602i());
                float fM10589c = AbstractC9930m3.m10589c(0.4f, 0.5f, fFloatValue2);
                float fM10589c2 = AbstractC9930m3.m10589c(0.7f, 0.5f, fFloatValue2);
                float fM10589c3 = AbstractC9930m3.m10589c(0.5f, 0.5f, fFloatValue2);
                float fM10589c4 = AbstractC9930m3.m10589c(0.3f, 0.5f, fFloatValue2);
                C4126s0 c4126s0 = (C4126s0) obj2;
                ((C14353i) c4126s0.f13313a).m15733e();
                InterfaceC14333K interfaceC14333K = c4126s0.f13313a;
                C14353i c14353i = (C14353i) interfaceC14333K;
                c14353i.m15731c(0.2f * fM15333e2, fM10589c3 * fM15333e2);
                c14353i.m15730b(fM10589c * fM15333e2, fM10589c2 * fM15333e2);
                c14353i.m15730b(0.8f * fM15333e2, fM15333e2 * fM10589c4);
                C14354j c14354j = c4126s0.f13314b;
                if (interfaceC14333K != null) {
                    c14354j.getClass();
                    if (!(interfaceC14333K instanceof C14353i)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    path = ((C14353i) interfaceC14333K).f45039a;
                } else {
                    path = null;
                }
                c14354j.f45043a.setPath(path, false);
                InterfaceC14333K interfaceC14333K2 = c4126s0.f13315c;
                ((C14353i) interfaceC14333K2).m15733e();
                c14354j.m15736a(0.0f, c14354j.f45043a.getLength() * fFloatValue, interfaceC14333K2);
                AbstractC14376f.m15848n(interfaceC16039d, c4126s0.f13315c, j12, 0.0f, c16043h2, 52);
                return c17296c;
            case 1:
                C2963j c2963j = (C2963j) obj;
                C2535p c2535p = new C2535p(5, (InterfaceC1426a) obj3);
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                c2963j.m3787m(AbstractC2962i.f8873t, new C2954a((String) obj6, c2535p));
                C3880A3 c3880a3 = (C3880A3) obj7;
                EnumC3886B3 enumC3886B3M4602b = c3880a3.m4602b();
                EnumC3886B3 enumC3886B3 = EnumC3886B3.f11779o0;
                C2925c c2925c = (C2925c) obj2;
                if (enumC3886B3M4602b == enumC3886B3) {
                    c2963j.m3787m(AbstractC2962i.f8871r, new C2954a((String) obj5, new C0155B1(c3880a3, c2925c, c3880a3, 20)));
                } else if (c3880a3.f11737c.m12638h().f15815a.containsKey(enumC3886B3)) {
                    c2963j.m3787m(AbstractC2962i.f8872s, new C2954a((String) obj4, new C4002X(c3880a3, c2925c)));
                }
                return c17296c;
            case 2:
                C6754e HttpClient = (C6754e) obj;
                AbstractC16544l.m18094g(HttpClient, "$this$HttpClient");
                HttpClient.f21684d = new C1450d(HttpClient.f21684d, i12, new C0146w((Set) obj7, (Set) obj6, (Set) obj5, 29));
                HttpClient.m7190a(C10416o.f30876p0, new C6593i((InterfaceC10407f) obj4, i11));
                HttpClient.m7190a(AbstractC10084i.f29863c, C7136d.f22699Z);
                HttpClient.m7190a(AbstractC11497m.f34802c, new C7137e((C3430e) obj3, i13));
                HttpClient.m7190a(AbstractC8910Y.f27267b, C7136d.f22701p0);
                C6593i c6593i = new C6593i((C6226E) obj2, i10);
                InterfaceC17710b interfaceC17710b = AbstractC8927i.f27300a;
                HttpClient.m7190a(C8926h.f27297b, new C0386f(c6593i));
                HttpClient.f21687g = true;
                return c17296c;
            case 3:
                long j13 = ((C13800b) obj).f43584a;
                int i14 = AbstractC13620e.f43030c;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj3;
                C16484C c16484c = (C16484C) obj7;
                if (AbstractC13620e.m15144d(j13, (C13801c) interfaceC5985X.getValue(), c16484c)) {
                    ((C13625j) obj6).m15146a(AbstractC13620e.m15143c(j13, (C13801c) interfaceC5985X.getValue(), c16484c), (InterfaceC20904w) obj5);
                    Boolean bool = Boolean.TRUE;
                    ((InterfaceC5985X) obj2).setValue(bool);
                    ((InterfaceC1436k) obj4).invoke(bool);
                }
                return c17296c;
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C14111x0 c14111x0 = (C14111x0) obj7;
                ArrayList arrayListM15498l = c14111x0.m15498l();
                LazyColumn.m19803p(arrayListM15498l.size(), new C1825q0(8, arrayListM15498l), new C1825q0(9, arrayListM15498l), new C8410b(new C14063Z(arrayListM15498l, c14111x0, (C14054U) obj6, (InterfaceC1436k) obj5, (InterfaceC1436k) obj4, (C5996c0) obj3, (C5996c0) obj2), true, -632812321));
                if (c14111x0.f44388S != null) {
                    AbstractC17792x.m19528k(LazyColumn, "editing", AbstractC14068c.f44258b, 2);
                }
                return c17296c;
            case 5:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                AbstractC21069X[] abstractC21069XArr = (AbstractC21069X[]) obj7;
                int length = abstractC21069XArr.length;
                int i15 = 0;
                while (i13 < length) {
                    AbstractC21069X abstractC21069X = abstractC21069XArr[i13];
                    AbstractC16544l.m18092e(abstractC21069X, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC17780r.m19508b(abstractC21068W, abstractC21069X, (InterfaceC21056J) ((List) obj6).get(i15), ((InterfaceC21059M) obj5).getLayoutDirection(), ((C16558z) obj4).f51287Y, ((C16558z) obj3).f51287Y, ((C17782s) obj2).f56759a);
                    i13++;
                    i15++;
                }
                return c17296c;
            default:
                String newText = (String) obj;
                AbstractC16544l.m18094g(newText, "newText");
                InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) obj7;
                C11232c c11232c = inputConfirmationCodeComponent.textController;
                C14525c c14525c = (C14525c) obj6;
                ConstraintLayout constraintLayout = (ConstraintLayout) c14525c.f45777b;
                AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
                c11232c.m12493q(AbstractC7861C4.m8133a(constraintLayout));
                List list = (List) obj5;
                if (newText.length() >= list.size()) {
                    if (newText.length() >= list.size()) {
                        int size = list.size();
                        while (i13 < size) {
                            int length2 = (newText.length() - list.size()) + i13;
                            EditText editText3 = (EditText) list.get(i13);
                            if (editText3 != null) {
                                editText3.setText(String.valueOf(newText.charAt(length2)));
                            }
                            i13++;
                        }
                    }
                } else if (newText.length() > 1) {
                    EditText editText4 = (EditText) obj4;
                    if (editText4.getSelectionStart() == 1) {
                        editText4.setText(String.valueOf(AbstractC21322p.m21673G(newText)));
                    } else {
                        editText4.setText(String.valueOf(AbstractC21322p.m21682P(newText)));
                    }
                } else if (AbstractC21322p.m21681O(newText) && (editText2 = (EditText) obj3) != null) {
                    editText2.requestFocus();
                } else if (!AbstractC21322p.m21681O(newText) && (editText = (EditText) obj2) != null) {
                    editText.requestFocus();
                } else if (!AbstractC21322p.m21681O(newText)) {
                    ((AbstractC16546n) inputConfirmationCodeComponent.f40953q0.f45414Y).invoke();
                    TextInputLayout textInputLayout = (TextInputLayout) c14525c.f45778c;
                    EditText editText5 = textInputLayout.getEditText();
                    if (editText5 != null && (context = editText5.getContext()) != null) {
                        AbstractC8012V5.m8331d(context);
                    }
                    EditText editText6 = textInputLayout.getEditText();
                    if (editText6 != null) {
                        editText6.clearFocus();
                    }
                }
                return c17296c;
        }
    }
}
