package com.openai.feature.reporting.impl;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.openai.feature.reporting.ReportingViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13966n;
import gd.C13969n2;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p092Dc.C1991h;
import p098Di.C2055d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.C2153Q0;
import p1081wc.AbstractC20882b;
import p1081wc.C20888g;
import p1081wc.InterfaceC20904w;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9327m3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p996rm.EnumC19250a;
import sg.C19539C;
import sg.C19540D;
import sg.C19551O;
import sg.C19552P;
import sg.C19553Q;
import sg.C19554S;
import sg.C19555T;
import sg.C19556U;
import sg.C19557V;
import sg.C19569k;
import sg.C19570l;
import sg.C19571m;
import sg.C19575q;
import sg.C19581w;
import sg.C19584z;
import sg.EnumC19541E;
import sg.InterfaceC19558W;
import sm.AbstractC19687c;
import tg.C19942a;
import tg.C19944c;
import tg.C19945d;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/reporting/impl/ReportingViewModelImpl;", "Lcom/openai/feature/reporting/ReportingViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ReportingViewModelImpl extends ReportingViewModel {

    /* JADX INFO: renamed from: i */
    public final C19945d f39368i;

    /* JADX INFO: renamed from: j */
    public final C1991h f39369j;

    /* JADX INFO: renamed from: k */
    public final C13969n2 f39370k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f39371l;

    /* JADX INFO: renamed from: m */
    public final C3430e f39372m;

    public ReportingViewModelImpl(C19945d c19945d, C1991h c1991h, C13969n2 c13969n2, InterfaceC20904w interfaceC20904w) {
        super(new C19540D(null, 31));
        this.f39368i = c19945d;
        this.f39369j = c1991h;
        this.f39370k = c13969n2;
        this.f39371l = interfaceC20904w;
        this.f39372m = AbstractC8168p6.m8749b("ReportContentViewModel", null);
        interfaceC20904w.mo21447a(C20888g.f66541d, C17690x.f56481Y);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14339n(ReportingViewModelImpl reportingViewModelImpl, C19553Q c19553q, AbstractC19687c abstractC19687c) {
        ReportingViewModelImpl$loadContentReasons$1 reportingViewModelImpl$loadContentReasons$1;
        EnumC19541E enumC19541E;
        InterfaceC3777y interfaceC3777yM18075c;
        reportingViewModelImpl.getClass();
        if (abstractC19687c instanceof ReportingViewModelImpl$loadContentReasons$1) {
            reportingViewModelImpl$loadContentReasons$1 = (ReportingViewModelImpl$loadContentReasons$1) abstractC19687c;
            int i10 = reportingViewModelImpl$loadContentReasons$1.f39378p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                reportingViewModelImpl$loadContentReasons$1.f39378p0 = i10 - Integer.MIN_VALUE;
            } else {
                reportingViewModelImpl$loadContentReasons$1 = new ReportingViewModelImpl$loadContentReasons$1(reportingViewModelImpl, abstractC19687c);
            }
        } else {
            reportingViewModelImpl$loadContentReasons$1 = new ReportingViewModelImpl$loadContentReasons$1(reportingViewModelImpl, abstractC19687c);
        }
        Object objM9690b = reportingViewModelImpl$loadContentReasons$1.f39376Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = reportingViewModelImpl$loadContentReasons$1.f39378p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C19575q c19575q = c19553q.f62105a;
            String str = c19575q.f62164c;
            String str2 = c19575q.f62162a;
            String str3 = c19575q.f62163b;
            if (str3 != null && str2 != null && str == null) {
                enumC19541E = null;
            } else if (str != null) {
                enumC19541E = EnumC19541E.f62078Z;
            } else if (str3 != null) {
                enumC19541E = EnumC19541E.f62077Y;
            } else if (str2 != null) {
                enumC19541E = EnumC19541E.f62079o0;
            } else {
                enumC19541E = null;
            }
            reportingViewModelImpl.m14397m(new ReportingViewModelImpl$loadContentReasons$2(enumC19541E));
            if (enumC19541E != null) {
                reportingViewModelImpl$loadContentReasons$1.f39375Y = reportingViewModelImpl;
                reportingViewModelImpl$loadContentReasons$1.f39378p0 = 1;
                C19945d c19945d = reportingViewModelImpl.f39368i;
                c19945d.getClass();
                C19942a c19942a = new C19942a(c19945d, c19553q.f62105a, null);
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C19581w.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C19581w.class);
                } catch (Throwable unused) {
                    interfaceC3777yM18075c = null;
                }
                objM9690b = AbstractC9144I.m9690b(c19945d.f63217a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c19942a, reportingViewModelImpl$loadContentReasons$1);
                if (objM9690b == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        reportingViewModelImpl = reportingViewModelImpl$loadContentReasons$1.f39375Y;
        AbstractC9233X.m9807c(objM9690b);
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            reportingViewModelImpl.m14397m(new ReportingViewModelImpl$loadContentReasons$3$1((C19581w) ((C6223B) abstractC6224C).f20258a));
        } else if (abstractC6224C instanceof AbstractC6249w) {
            AbstractC6249w abstractC6249w = (AbstractC6249w) abstractC6224C;
            reportingViewModelImpl.m14393h(new C2059h(AbstractC6224C.m6734a(abstractC6249w)));
            AbstractC8160o6.m8731f(reportingViewModelImpl.f39372m, "Error fetching gizmo abuse report reasons", abstractC6249w.f20328a, null, 4);
        } else if (!(abstractC6224C instanceof C6248v)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0167 A[LOOP:1: B:52:0x0161->B:54:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0238  */
    /* JADX WARN: Code duplicated, block: B:88:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x025e  */
    /* JADX WARN: Code duplicated, block: B:93:0x026a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0270  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x023c, please report this as an issue */
    /* JADX INFO: renamed from: o */
    public static final Object m14340o(ReportingViewModelImpl reportingViewModelImpl, C19554S c19554s, AbstractC19687c abstractC19687c) {
        ReportingViewModelImpl$submitReport$1 reportingViewModelImpl$submitReport$1;
        C19575q c19575q;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC3777y interfaceC3777yM18075c;
        AbstractC6224C c6223b;
        AbstractC21955Q1 abstractC21955Q1M6735b;
        String str6;
        reportingViewModelImpl.getClass();
        if (abstractC19687c instanceof ReportingViewModelImpl$submitReport$1) {
            reportingViewModelImpl$submitReport$1 = (ReportingViewModelImpl$submitReport$1) abstractC19687c;
            int i10 = reportingViewModelImpl$submitReport$1.f39396q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                reportingViewModelImpl$submitReport$1.f39396q0 = i10 - Integer.MIN_VALUE;
            } else {
                reportingViewModelImpl$submitReport$1 = new ReportingViewModelImpl$submitReport$1(reportingViewModelImpl, abstractC19687c);
            }
        } else {
            reportingViewModelImpl$submitReport$1 = new ReportingViewModelImpl$submitReport$1(reportingViewModelImpl, abstractC19687c);
        }
        Object objM9690b = reportingViewModelImpl$submitReport$1.f39394o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = reportingViewModelImpl$submitReport$1.f39396q0;
        C17296C c17296c = C17296C.f55119a;
        Intent intent = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C2153Q0 c2153q0 = reportingViewModelImpl.f40343c;
            if (((C19540D) c2153q0.getValue()).f62076g) {
                reportingViewModelImpl.m14397m(ReportingViewModelImpl$submitReport$2.f39397Y);
                EnumC19541E enumC19541E = ((C19540D) c2153q0.getValue()).f62070a;
                EnumC19541E enumC19541E2 = EnumC19541E.f62080p0;
                C19945d c19945d = reportingViewModelImpl.f39368i;
                if (enumC19541E == enumC19541E2) {
                    C19575q c19575q2 = c19554s.f62106a;
                    Map map = c19554s.f62109d;
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList2.add(new C17309l(((C19569k) entry.getKey()).f62155a, entry.getValue()));
                    }
                    Map mapM19253o = AbstractC17659D.m19253o(arrayList2);
                    c19945d.getClass();
                    String requestId = c19554s.f62107b;
                    AbstractC16544l.m18094g(requestId, "requestId");
                    String str7 = c19575q2.f62162a;
                    if (str7 == null && (str7 = c19575q2.f62164c) == null && (str7 = c19575q2.f62163b) == null) {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = "";
                    }
                    C17309l c17309l = new C17309l("contentId", str7);
                    C17309l c17309l2 = new C17309l("requestId", requestId);
                    String str8 = c19554s.f62108c;
                    Map mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, new C17309l("description", str8 != null ? str8 : ""), new C17309l("additionalFields", mapM19253o));
                    AbstractC8160o6.m8728c(AbstractC8168p6.m8749b("android_bugs", null), "Reporting bug", null, mapM19244f, 2);
                    c19945d.f63218b.mo21448b(C20888g.f66540c, mapM19244f, C17690x.f56481Y);
                    c6223b = new C6223B(c17296c);
                } else {
                    C19575q c19575q3 = c19554s.f62106a;
                    EnumC19541E enumC19541E3 = ((C19540D) c2153q0.getValue()).f62070a;
                    int i12 = enumC19541E3 == null ? -1 : ReportingViewModelImplKt.WhenMappings.f39399a[enumC19541E3.ordinal()];
                    try {
                        if (i12 == 1) {
                            c19575q = new C19575q(c19575q3.f62162a, (String) null, (String) null, 6);
                        } else if (i12 != 2) {
                            if (i12 == 3) {
                                c19575q = new C19575q((String) null, (String) null, c19575q3.f62164c, 3);
                            }
                            Map map2 = c19554s.f62109d;
                            arrayList = new ArrayList(map2.size());
                            for (Map.Entry entry2 : map2.entrySet()) {
                                arrayList.add(new C17309l(((C19569k) entry2.getKey()).f62155a, entry2.getValue()));
                            }
                            Map mapM19253o2 = AbstractC17659D.m19253o(arrayList);
                            reportingViewModelImpl$submitReport$1.f39392Y = reportingViewModelImpl;
                            reportingViewModelImpl$submitReport$1.f39393Z = c19554s;
                            reportingViewModelImpl$submitReport$1.f39396q0 = 1;
                            c19945d.getClass();
                            C19539C c19539c = new C19539C(c19554s.f62107b, c19554s.f62108c);
                            str = c19575q3.f62163b;
                            str2 = c19575q3.f62164c;
                            str3 = c19575q3.f62162a;
                            if (str3 == null) {
                                str4 = str3;
                            } else if (str2 == null) {
                                str4 = str2;
                            } else if (str == null) {
                                str4 = null;
                            } else {
                                str4 = str;
                            }
                            if (str3 != null) {
                                str5 = "gizmo";
                            } else if (str2 != null) {
                                str5 = "share_link";
                            } else {
                                if (str != null) {
                                    throw new IllegalArgumentException("Invalid report content id");
                                }
                                str5 = "conversation";
                            }
                            C19944c c19944c = new C19944c(new C19584z(c19539c, str5, str4, mapM19253o2), null);
                            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                            objM9690b = AbstractC9144I.m9690b(c19945d.f63217a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c19944c, reportingViewModelImpl$submitReport$1);
                            if (objM9690b == enumC19250a) {
                                return enumC19250a;
                            }
                        } else {
                            c19575q = new C19575q((String) null, c19575q3.f62163b, (String) null, 5);
                        }
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                    } catch (Throwable unused) {
                        interfaceC3777yM18075c = null;
                    }
                    c19575q3 = c19575q;
                    Map map3 = c19554s.f62109d;
                    arrayList = new ArrayList(map3.size());
                    while (r0.hasNext()) {
                        arrayList.add(new C17309l(((C19569k) entry2.getKey()).f62155a, entry2.getValue()));
                    }
                    Map mapM19253o3 = AbstractC17659D.m19253o(arrayList);
                    reportingViewModelImpl$submitReport$1.f39392Y = reportingViewModelImpl;
                    reportingViewModelImpl$submitReport$1.f39393Z = c19554s;
                    reportingViewModelImpl$submitReport$1.f39396q0 = 1;
                    c19945d.getClass();
                    C19539C c19539c2 = new C19539C(c19554s.f62107b, c19554s.f62108c);
                    str = c19575q3.f62163b;
                    str2 = c19575q3.f62164c;
                    str3 = c19575q3.f62162a;
                    if (str3 == null) {
                        str4 = str3;
                    } else if (str2 == null) {
                        str4 = str2;
                    } else if (str == null) {
                        str4 = null;
                    } else {
                        str4 = str;
                    }
                    if (str3 != null) {
                        str5 = "gizmo";
                    } else if (str2 != null) {
                        str5 = "share_link";
                    } else {
                        if (str != null) {
                            throw new IllegalArgumentException("Invalid report content id");
                        }
                        str5 = "conversation";
                    }
                    C19944c c19944c2 = new C19944c(new C19584z(c19539c2, str5, str4, mapM19253o3), null);
                    InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                    objM9690b = AbstractC9144I.m9690b(c19945d.f63217a, new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c), c19944c2, reportingViewModelImpl$submitReport$1);
                    if (objM9690b == enumC19250a) {
                        return enumC19250a;
                    }
                }
                abstractC21955Q1M6735b = c6223b.m6735b();
                if (abstractC21955Q1M6735b instanceof C21952P1) {
                    reportingViewModelImpl.m14341p();
                    str6 = (String) reportingViewModelImpl.f39370k.m15477a(C13966n.f44022d);
                    if (!AbstractC21322p.m21681O(str6) && ((C19540D) reportingViewModelImpl.f40343c.getValue()).f62070a == EnumC19541E.f62080p0) {
                        intent = new Intent();
                        StringBuilder sbM9896o = AbstractC9306j0.m9896o("mailto:", str6, "?subject=", c19554s.f62107b, "&body=");
                        sbM9896o.append(c19554s.f62108c);
                        AbstractC9186P.m9748b(intent, sbM9896o.toString());
                    }
                    reportingViewModelImpl.m14392g(new C19571m(intent));
                } else if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
                    AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6735b;
                    reportingViewModelImpl.m14393h(new C2059h(abstractC21933K1));
                    AbstractC8160o6.m8731f(reportingViewModelImpl.f39372m, "Error reporting " + c19554s.f62106a, abstractC21933K1.f69485a, null, 4);
                } else if (!(abstractC21955Q1M6735b instanceof C21929J1)) {
                    throw new C0644w();
                }
                reportingViewModelImpl.m14397m(ReportingViewModelImpl$submitReport$7.f39398Y);
            } else {
                reportingViewModelImpl.m14393h(new C2059h(new C21941M1(new Exception("Please fill out all required fields"))));
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c19554s = reportingViewModelImpl$submitReport$1.f39393Z;
        reportingViewModelImpl = reportingViewModelImpl$submitReport$1.f39392Y;
        AbstractC9233X.m9807c(objM9690b);
        c6223b = (AbstractC6224C) objM9690b;
        abstractC21955Q1M6735b = c6223b.m6735b();
        if (abstractC21955Q1M6735b instanceof C21952P1) {
            reportingViewModelImpl.m14341p();
            str6 = (String) reportingViewModelImpl.f39370k.m15477a(C13966n.f44022d);
            if (!AbstractC21322p.m21681O(str6)) {
                intent = new Intent();
                StringBuilder sbM9896o2 = AbstractC9306j0.m9896o("mailto:", str6, "?subject=", c19554s.f62107b, "&body=");
                sbM9896o2.append(c19554s.f62108c);
                AbstractC9186P.m9748b(intent, sbM9896o2.toString());
            }
            reportingViewModelImpl.m14392g(new C19571m(intent));
        } else if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K2 = (AbstractC21933K1) abstractC21955Q1M6735b;
            reportingViewModelImpl.m14393h(new C2059h(abstractC21933K2));
            AbstractC8160o6.m8731f(reportingViewModelImpl.f39372m, "Error reporting " + c19554s.f62106a, abstractC21933K2.f69485a, null, 4);
        } else if (!(abstractC21955Q1M6735b instanceof C21929J1)) {
            throw new C0644w();
        }
        reportingViewModelImpl.m14397m(ReportingViewModelImpl$submitReport$7.f39398Y);
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC19558W intent = (InterfaceC19558W) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C19554S) {
            m14394i(new ReportingViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        if (intent instanceof C19556U) {
            m14397m(new ReportingViewModelImpl$onIntent$2(this, intent));
            return;
        }
        if (intent instanceof C19557V) {
            m14397m(new ReportingViewModelImpl$onIntent$3(intent));
            return;
        }
        if (intent.equals(C19551O.f62103a)) {
            if (((C19540D) this.f40343c.getValue()).f62072c.isEmpty()) {
                m14341p();
                m14392g(C19570l.f62159a);
            }
            m14397m(ReportingViewModelImpl$goBack$1.f39373Y);
            return;
        }
        if (!(intent instanceof C19555T)) {
            if (intent instanceof C19553Q) {
                m14394i(new ReportingViewModelImpl$onIntent$4(this, intent, null));
                return;
            } else {
                if (intent instanceof C19552P) {
                    m14394i(new ReportingViewModelImpl$onIntent$5(this, null));
                    return;
                }
                return;
            }
        }
        C20888g c20888g = C20888g.f66542e;
        String str = ((C19555T) intent).f62110a;
        m14342q(c20888g, AbstractC17660E.m19258c(new C17309l("link_url", str == null ? "" : str)));
        if (str == null) {
            return;
        }
        Intent intent2 = new Intent();
        AbstractC9186P.m9748b(intent2, str);
        m14393h(new C2055d(intent2));
    }

    /* JADX INFO: renamed from: p */
    public final void m14341p() {
        m14397m(ReportingViewModelImpl$reset$1.f39391Y);
    }

    /* JADX INFO: renamed from: q */
    public final void m14342q(AbstractC20882b abstractC20882b, Map map) {
        EnumC19541E enumC19541E = ((C19540D) m14391f()).f62070a;
        String strName = enumC19541E != null ? enumC19541E.name() : null;
        if (strName == null) {
            strName = "";
        }
        this.f39371l.mo21447a(abstractC20882b, AbstractC17659D.m19248j(AbstractC17660E.m19258c(new C17309l("content_type", strName)), map));
    }
}
