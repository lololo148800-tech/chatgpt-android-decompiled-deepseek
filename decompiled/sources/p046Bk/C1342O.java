package p046Bk;

import bo.AbstractC11516d;
import com.squareup.workflow1.p685ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.internal.InquiryField$BooleanField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$ChoicesField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$DateField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$DatetimeField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$FloatField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$IntegerField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$MultiChoicesField;
import com.withpersona.sdk2.inquiry.internal.InquiryField$StringField;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.p689ui.network.ComponentParam$Adapter;
import com.withpersona.sdk2.inquiry.steps.p688ui.network.NumberAdapter;
import fk.C13686g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import md.C17236j;
import p025An.AbstractC0593T;
import p050Bn.C1451e;
import p101Dl.C2100a;
import p101Dl.C2103d;
import p101Dl.C2117r;
import p1021t8.EnumC19815f;
import p1155zi.EnumC21895B;
import p148Fi.C2790T0;
import p151Fl.AbstractC2897c;
import p151Fl.C2898d;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p224Il.C3741a;
import p247Jj.AbstractC4385H;
import p247Jj.C4383G;
import p247Jj.C4387I;
import p247Jj.C4408T;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p273Kl.C4762b;
import p289Lc.C4996d;
import p342Nj.C5809c;
import p342Nj.EnumC5810d;
import p342Nj.EnumC5811e;
import p344Nl.C5827I;
import p344Nl.C5830b;
import p364Oh.AbstractC6241o;
import p366Oj.C6262d;
import p387Pl.C6471S;
import p387Pl.C6488h;
import p387Pl.C6502v;
import p387Pl.EnumC6458E;
import p387Pl.EnumC6481b;
import p408Qj.C6741g;
import p473T7.C7261b;
import p499U9.C7591u;
import p523V9.AbstractC8024X3;
import p525Vb.C8258a;
import p542W7.C8437a;
import p542W7.C8439c;
import p544W9.AbstractC8446A2;
import p544W9.AbstractC8639g4;
import p603Yj.C10069b;
import p603Yj.C10075h;
import p603Yj.EnumC10068a;
import p658b5.C11234e;
import p680cj.C11763d;
import p769gj.InterfaceC14147A;
import p814ik.AbstractC15032d;
import p814ik.C15031c;
import p814ik.C15034f;
import p856kk.C16433a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p909nm.C17691y;
import p931ok.C18230k;

/* JADX INFO: renamed from: Bk.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C1342O implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3542a;

    public /* synthetic */ C1342O(int i10) {
        this.f3542a = i10;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        EnumC19815f enumC19815f = EnumC19815f.f62867p0;
        EnumC19815f enumC19815f2 = EnumC19815f.f62864Y;
        int i10 = 18;
        int i11 = 19;
        switch (this.f3542a) {
            case 0:
                return AbstractC17665J.m19268h(C1375d0.f3647k);
            case 1:
                return EnumC21895B.f69419Z;
            case 2:
                return new C2117r((C1451e) AbstractC2897c.f8709b.get());
            case 3:
                return new C2790T0();
            case 4:
                C3516e c3516e = AbstractC0593T.f1824a;
                ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
                AbstractC8446A2.m9048a(executorC3515d);
                return executorC3515d;
            case 5:
                C3516e c3516e2 = AbstractC0593T.f1824a;
                C1451e c1451e = AbstractC2935m.f8797a;
                AbstractC8446A2.m9048a(c1451e);
                return c1451e;
            case 6:
                return AbstractC8024X3.m8363a(AbstractC11516d.f34842d, C2898d.f8714Y);
            case 7:
                return new C3741a();
            case 8:
                return new C2100a();
            case 9:
                return new C2103d();
            case 10:
                C4762b c4762b = new C4762b();
                c4762b.f15538a = new C6488h();
                c4762b.f15539b = new C5830b();
                c4762b.f15540c = new C6502v(false, (EnumC6481b) null, (C6471S) null, 15);
                c4762b.f15541d = new C5827I(null, null, 63);
                EnumC6458E enumC6458E = EnumC6458E.ORIGINAL;
                c4762b.f15542e = new C6502v(true, (EnumC6481b) null, enumC6458E.f20956Y, 6);
                c4762b.f15543f = new C5827I(enumC6458E.f20957Z, null, 62);
                return c4762b;
            case 11:
                return new C4996d();
            case 12:
                EnumC21895B enumC21895B = EnumC21895B.f69419Z;
                List tracedHosts = AbstractC6241o.f20323e;
                AbstractC16544l.m18094g(tracedHosts, "tracedHosts");
                List list = tracedHosts;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b >= 16 ? iM19257b : 16);
                for (Object obj : list) {
                    linkedHashMap.put(obj, AbstractC17678l.m19293P(new EnumC19815f[]{enumC19815f2, enumC19815f}));
                }
                C7591u c7591u = new C7591u(i11);
                new C11234e(20.0f);
                return new C7261b(linkedHashMap, c7591u, new C7591u(i10), new C11234e(AbstractC8639g4.m9297a(enumC21895B)), 1, C8437a.f26261Y);
            case 13:
                EnumC21895B enumC21895B2 = EnumC21895B.f69419Z;
                List tracedHosts2 = AbstractC6241o.f20323e;
                AbstractC16544l.m18094g(tracedHosts2, "tracedHosts");
                List list2 = tracedHosts2;
                int iM19257b2 = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b2 >= 16 ? iM19257b2 : 16);
                for (Object obj2 : list2) {
                    linkedHashMap2.put(obj2, AbstractC17678l.m19293P(new EnumC19815f[]{enumC19815f2, enumC19815f}));
                }
                C7591u c7591u2 = new C7591u(i11);
                new C11234e(20.0f);
                return new C8439c(linkedHashMap2, c7591u2, null, new C11234e(AbstractC8639g4.m9297a(enumC21895B2)), 1, C8437a.f26261Y);
            case 14:
                return "Persona/1.0 (Android) Inquiry/2.12.10";
            case 15:
                return C17691y.f56482Y;
            case 16:
                return AbstractC17678l.m19293P(new Object[]{C5809c.f18966b, EnumC5810d.Companion, EnumC5811e.Companion, ComponentParam$Adapter.f41015a, C4387I.f14255b, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, UiComponentConfig.Button.ButtonType.INSTANCE, UiComponentConfig.InputText.InputType.INSTANCE, UiComponentConfig.InputText.AutofillHint.INSTANCE, UiComponentConfig.RemoteImage.ContentType.INSTANCE, UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.INSTANCE, UiComponentError.INSTANCE, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.f40992a, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE});
            case 17:
                return AbstractC17665J.m19268h(new C11763d(AbstractC4385H.class, "type", Collections.emptyList(), Collections.emptyList(), C4383G.f14251a).m13056b(InquiryField$StringField.class, "string").m13056b(InquiryField$IntegerField.class, "integer").m13056b(InquiryField$BooleanField.class, "boolean").m13056b(InquiryField$FloatField.class, "float").m13056b(InquiryField$FloatField.class, "number").m13056b(InquiryField$DateField.class, "date").m13056b(InquiryField$DatetimeField.class, "datetime").m13056b(InquiryField$ChoicesField.class, "choices").m13056b(InquiryField$MultiChoicesField.class, "multi_choices"));
            case 18:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C4408T.f14303e, BackStackContainer.f40528q0, C6262d.f20351q0, C18230k.f58081p0});
            case 19:
                return new C8258a();
            case 20:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C6741g.f21643s0, BackStackContainer.f40528q0});
            case 21:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C6741g.f21643s0, BackStackContainer.f40528q0});
            case 22:
                C10069b c10069b = new C10069b();
                c10069b.f29817b = EnumC10068a.f29814Z;
                return c10069b;
            case 23:
                return AbstractC17665J.m19268h(C10075h.f29827b);
            case 24:
                return (C15031c) AbstractC15032d.f46729a.get();
            case 25:
                return new C15034f();
            case 26:
                return new C13686g();
            case 27:
                return new C16433a();
            case 28:
                C15031c c15031c = new C15031c();
                c15031c.f46728a = "";
                return c15031c;
            default:
                return new C17236j();
        }
    }

    public /* synthetic */ C1342O(Object obj, int i10) {
        this.f3542a = i10;
    }

    public /* synthetic */ C1342O(Object obj, InterfaceC4478i interfaceC4478i, int i10) {
        this.f3542a = i10;
    }
}
