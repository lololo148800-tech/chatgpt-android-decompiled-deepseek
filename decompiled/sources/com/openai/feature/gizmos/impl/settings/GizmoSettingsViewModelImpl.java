package com.openai.feature.gizmos.impl.settings;

import android.content.Intent;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2055d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p318Mh.C5375N;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p550We.C8826g;
import p550We.EnumC8830k;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p599Yf.C10056a;
import p599Yf.C10058c;
import p622Ze.C10294l;
import p622Ze.C10295m;
import p622Ze.C10296n;
import p622Ze.C10298p;
import p622Ze.InterfaceC10297o;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/settings/GizmoSettingsViewModelImpl;", "Lcom/openai/feature/gizmos/impl/settings/GizmoSettingsViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoSettingsViewModelImpl extends GizmoSettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final C9473F f38141i;

    /* JADX INFO: renamed from: j */
    public final C10058c f38142j;

    /* JADX INFO: renamed from: k */
    public final String f38143k;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl$1", m20656f = "GizmoSettingsViewModel.kt", m20657l = {75}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123591 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f38144Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ List f38145Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ GizmoSettingsViewModelImpl f38146o0;

        /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZe/p;", "invoke", "(LZe/p;)LZe/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f38147Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C10298p setState = (C10298p) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C10298p.m10880e(setState, null, null, null, 14);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123591(List list, GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f38145Z = list;
            this.f38146o0 = gizmoSettingsViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return new C123591(this.f38145Z, this.f38146o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123591) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38144Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                List list = this.f38145Z;
                this.f38144Y = 1;
                if (AbstractC0575H.m1154B(list, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            this.f38146o0.m14397m(AnonymousClass1.f38147Y);
            return C17296C.f55119a;
        }
    }

    public GizmoSettingsViewModelImpl(C11082S c11082s, C9473F c9473f, C10058c c10058c) {
        super(new C10298p(true, C17689w.f56480Y, null, null));
        this.f38141i = c9473f;
        this.f38142j = c10058c;
        this.f38143k = ((C21936L0) C5375N.f17626i.f17628g.m5892c(c11082s)).f69488a;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C123591(AbstractC17681o.m19382k(AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new GizmoSettingsViewModelImpl$jobs$1(this, null), 3), AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new GizmoSettingsViewModelImpl$jobs$2(this, null), 3)), this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14277n(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        GizmoSettingsViewModelImpl$logout$1 gizmoSettingsViewModelImpl$logout$1;
        GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl2;
        String str2;
        String str3;
        GizmoSettingsViewModelImpl$logout$3$1 gizmoSettingsViewModelImpl$logout$3$1;
        gizmoSettingsViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoSettingsViewModelImpl$logout$1) {
            gizmoSettingsViewModelImpl$logout$1 = (GizmoSettingsViewModelImpl$logout$1) abstractC19687c;
            int i10 = gizmoSettingsViewModelImpl$logout$1.f38157q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoSettingsViewModelImpl$logout$1.f38157q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoSettingsViewModelImpl$logout$1 = new GizmoSettingsViewModelImpl$logout$1(gizmoSettingsViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoSettingsViewModelImpl$logout$1 = new GizmoSettingsViewModelImpl$logout$1(gizmoSettingsViewModelImpl, abstractC19687c);
        }
        Object objM9690b = gizmoSettingsViewModelImpl$logout$1.f38155o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoSettingsViewModelImpl$logout$1.f38157q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$logout$2(str));
            gizmoSettingsViewModelImpl$logout$1.f38153Y = gizmoSettingsViewModelImpl;
            gizmoSettingsViewModelImpl$logout$1.f38154Z = str;
            gizmoSettingsViewModelImpl$logout$1.f38157q0 = 1;
            C10058c c10058c = gizmoSettingsViewModelImpl.f38142j;
            c10058c.getClass();
            InterfaceC3777y interfaceC3777yM18075c = null;
            C10056a c10056a = new C10056a(str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c10058c.f29782a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c10056a, gizmoSettingsViewModelImpl$logout$1);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    str3 = gizmoSettingsViewModelImpl$logout$1.f38154Z;
                    gizmoSettingsViewModelImpl2 = gizmoSettingsViewModelImpl$logout$1.f38153Y;
                    AbstractC9233X.m9807c(objM9690b);
                    gizmoSettingsViewModelImpl$logout$3$1 = new GizmoSettingsViewModelImpl$logout$3$1(str3);
                    gizmoSettingsViewModelImpl2.m14397m(gizmoSettingsViewModelImpl$logout$3$1);
                    return C17296C.f55119a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = gizmoSettingsViewModelImpl$logout$1.f38154Z;
                gizmoSettingsViewModelImpl2 = gizmoSettingsViewModelImpl$logout$1.f38153Y;
                AbstractC9233X.m9807c(objM9690b);
                gizmoSettingsViewModelImpl$logout$3$1 = new GizmoSettingsViewModelImpl$logout$3$1(str2);
                gizmoSettingsViewModelImpl2.m14397m(gizmoSettingsViewModelImpl$logout$3$1);
                return C17296C.f55119a;
            }
            str = gizmoSettingsViewModelImpl$logout$1.f38154Z;
            gizmoSettingsViewModelImpl = gizmoSettingsViewModelImpl$logout$1.f38153Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            gizmoSettingsViewModelImpl$logout$1.f38153Y = gizmoSettingsViewModelImpl;
            gizmoSettingsViewModelImpl$logout$1.f38154Z = str;
            gizmoSettingsViewModelImpl$logout$1.f38157q0 = 2;
            if (gizmoSettingsViewModelImpl.m14279p(gizmoSettingsViewModelImpl$logout$1) == enumC19250a) {
                return enumC19250a;
            }
            String str4 = str;
            gizmoSettingsViewModelImpl2 = gizmoSettingsViewModelImpl;
            str3 = str4;
            gizmoSettingsViewModelImpl$logout$3$1 = new GizmoSettingsViewModelImpl$logout$3$1(str3);
            gizmoSettingsViewModelImpl2.m14397m(gizmoSettingsViewModelImpl$logout$3$1);
        } else if (abstractC6224C instanceof AbstractC6249w) {
            gizmoSettingsViewModelImpl.m14393h(new C2059h(AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C)));
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$logout$4$1(str));
        } else {
            if (!(abstractC6224C instanceof C6248v)) {
                throw new C0644w();
            }
            gizmoSettingsViewModelImpl$logout$1.f38153Y = gizmoSettingsViewModelImpl;
            gizmoSettingsViewModelImpl$logout$1.f38154Z = str;
            gizmoSettingsViewModelImpl$logout$1.f38157q0 = 3;
            if (gizmoSettingsViewModelImpl.m14279p(gizmoSettingsViewModelImpl$logout$1) == enumC19250a) {
                return enumC19250a;
            }
            String str5 = str;
            gizmoSettingsViewModelImpl2 = gizmoSettingsViewModelImpl;
            str2 = str5;
            gizmoSettingsViewModelImpl$logout$3$1 = new GizmoSettingsViewModelImpl$logout$3$1(str2);
            gizmoSettingsViewModelImpl2.m14397m(gizmoSettingsViewModelImpl$logout$3$1);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: o */
    public static final Object m14278o(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, C10296n c10296n, AbstractC19687c abstractC19687c) {
        GizmoSettingsViewModelImpl$updateOperation$1 gizmoSettingsViewModelImpl$updateOperation$1;
        EnumC8830k enumC8830k;
        Object objM10022u;
        gizmoSettingsViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoSettingsViewModelImpl$updateOperation$1) {
            gizmoSettingsViewModelImpl$updateOperation$1 = (GizmoSettingsViewModelImpl$updateOperation$1) abstractC19687c;
            int i10 = gizmoSettingsViewModelImpl$updateOperation$1.f38172r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoSettingsViewModelImpl$updateOperation$1.f38172r0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoSettingsViewModelImpl$updateOperation$1 = new GizmoSettingsViewModelImpl$updateOperation$1(gizmoSettingsViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoSettingsViewModelImpl$updateOperation$1 = new GizmoSettingsViewModelImpl$updateOperation$1(gizmoSettingsViewModelImpl, abstractC19687c);
        }
        GizmoSettingsViewModelImpl$updateOperation$1 gizmoSettingsViewModelImpl$updateOperation$2 = gizmoSettingsViewModelImpl$updateOperation$1;
        Object obj = gizmoSettingsViewModelImpl$updateOperation$2.f38170p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoSettingsViewModelImpl$updateOperation$2.f38172r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = c10296n.f30579a;
            EnumC8830k enumC8830k2 = c10296n.f30581c;
            C16525B c16525b = new C16525B();
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$updateOperationStatus$1(str, c16525b, enumC8830k2));
            enumC8830k = (EnumC8830k) c16525b.f51262Y;
            gizmoSettingsViewModelImpl$updateOperation$2.f38167Y = gizmoSettingsViewModelImpl;
            gizmoSettingsViewModelImpl$updateOperation$2.f38168Z = c10296n;
            gizmoSettingsViewModelImpl$updateOperation$2.f38169o0 = enumC8830k;
            gizmoSettingsViewModelImpl$updateOperation$2.f38172r0 = 1;
            objM10022u = gizmoSettingsViewModelImpl.f38141i.m10022u(c10296n.f30579a, c10296n.f30580b, "all", enumC8830k2, gizmoSettingsViewModelImpl$updateOperation$2);
            if (objM10022u == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EnumC8830k enumC8830k3 = gizmoSettingsViewModelImpl$updateOperation$2.f38169o0;
            c10296n = gizmoSettingsViewModelImpl$updateOperation$2.f38168Z;
            GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl2 = gizmoSettingsViewModelImpl$updateOperation$2.f38167Y;
            AbstractC9233X.m9807c(obj);
            objM10022u = obj;
            enumC8830k = enumC8830k3;
            gizmoSettingsViewModelImpl = gizmoSettingsViewModelImpl2;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10022u;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            String str2 = c10296n.f30579a;
            if (enumC8830k == null) {
                enumC8830k = EnumC8830k.f27020Z;
            }
            gizmoSettingsViewModelImpl.getClass();
            C16525B c16525b2 = new C16525B();
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$updateOperationStatus$1(str2, c16525b2, enumC8830k));
            gizmoSettingsViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC10297o intent = (InterfaceC10297o) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C10294l) {
            m14394i(new GizmoSettingsViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C10295m) {
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, ((C10295m) intent).f30578a);
            m14393h(new C2055d(intent2));
        } else if (intent instanceof C10296n) {
            m14394i(new GizmoSettingsViewModelImpl$onIntent$2(this, intent, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m14279p(AbstractC19687c abstractC19687c) {
        GizmoSettingsViewModelImpl$updateSettings$1 gizmoSettingsViewModelImpl$updateSettings$1;
        GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl;
        if (abstractC19687c instanceof GizmoSettingsViewModelImpl$updateSettings$1) {
            gizmoSettingsViewModelImpl$updateSettings$1 = (GizmoSettingsViewModelImpl$updateSettings$1) abstractC19687c;
            int i10 = gizmoSettingsViewModelImpl$updateSettings$1.f38179p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoSettingsViewModelImpl$updateSettings$1.f38179p0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoSettingsViewModelImpl$updateSettings$1 = new GizmoSettingsViewModelImpl$updateSettings$1(this, abstractC19687c);
            }
        } else {
            gizmoSettingsViewModelImpl$updateSettings$1 = new GizmoSettingsViewModelImpl$updateSettings$1(this, abstractC19687c);
        }
        Object objM10008g = gizmoSettingsViewModelImpl$updateSettings$1.f38177Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoSettingsViewModelImpl$updateSettings$1.f38179p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10008g);
            gizmoSettingsViewModelImpl$updateSettings$1.f38176Y = this;
            gizmoSettingsViewModelImpl$updateSettings$1.f38179p0 = 1;
            objM10008g = this.f38141i.m10008g(this.f38143k, gizmoSettingsViewModelImpl$updateSettings$1);
            if (objM10008g == enumC19250a) {
                return enumC19250a;
            }
            gizmoSettingsViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gizmoSettingsViewModelImpl = gizmoSettingsViewModelImpl$updateSettings$1.f38176Y;
            AbstractC9233X.m9807c(objM10008g);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10008g;
        if (abstractC21955Q1 instanceof C21952P1) {
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$updateSettings$2$1((C8826g) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmoSettingsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$updateSettings$2$1(null));
        }
        return C17296C.f55119a;
    }
}
