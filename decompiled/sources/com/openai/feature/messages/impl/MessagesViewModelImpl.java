package com.openai.feature.messages.impl;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import bh.C11434h;
import com.openai.feature.messages.MessagesViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13919b0;
import gd.C13975p0;
import gd.C14005w2;
import gd.C14008x1;
import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p003A1.C0254h0;
import p017Af.C0491v;
import p025An.C0644w;
import p040Bd.AbstractC0985Q1;
import p040Bd.C0924G0;
import p040Bd.C0937I1;
import p040Bd.EnumC1117k4;
import p092Dc.C1991h;
import p095Df.C2039i;
import p095Df.C2040j;
import p098Di.C2054c;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2134H;
import p103Dn.C2182h;
import p103Dn.C2207t0;
import p103Dn.C2219z0;
import p1041uf.C20212a;
import p1041uf.C20217f;
import p1081wc.AbstractC20882b;
import p1081wc.C20857C;
import p1081wc.C20864J;
import p1081wc.C20890i;
import p1081wc.C20893l;
import p1081wc.C20894m;
import p1081wc.C20896o;
import p1081wc.C20903v;
import p1081wc.InterfaceC20904w;
import p1091wn.C21036q;
import p1113xn.AbstractC21329w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21907E;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p1155zi.C21980Z0;
import p1155zi.C21984a1;
import p1155zi.C22020j1;
import p129En.C2604o;
import p193Hf.C3332T;
import p195Hh.C3430e;
import p204I1.C3590f;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p217Ie.C3708d;
import p268Kf.C4666u;
import p318Mh.C5379S;
import p318Mh.C5381U;
import p318Mh.C5393d;
import p318Mh.C5432w0;
import p318Mh.C5433x;
import p337Nd.C5710c;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p403Qd.AbstractC6653q0;
import p403Qd.AbstractC6659u;
import p403Qd.C6600F;
import p403Qd.C6636i;
import p403Qd.C6645m0;
import p428Rd.C6864c;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p480Te.C7392q;
import p480Te.C7395t;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p571X9.AbstractC9393x3;
import p575Xd.C9436E;
import p576Xe.C9473F;
import p787he.C14459O;
import p787he.C14495x;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p926of.C18138A;
import p926of.C18139B;
import p926of.C18140C;
import p926of.C18141D;
import p926of.C18142E;
import p926of.C18143F;
import p926of.C18144G;
import p926of.C18145H;
import p926of.C18146I;
import p926of.C18147J;
import p926of.C18148K;
import p926of.C18149L;
import p926of.C18150M;
import p926of.C18151N;
import p926of.C18152O;
import p926of.C18153P;
import p926of.C18154Q;
import p926of.C18155S;
import p926of.C18156T;
import p926of.C18157U;
import p926of.C18158V;
import p926of.C18160X;
import p926of.C18162Z;
import p926of.C18177n;
import p926of.C18178o;
import p926of.C18180q;
import p926of.C18181r;
import p926of.C18182s;
import p926of.C18183t;
import p926of.C18184u;
import p926of.C18185v;
import p926of.C18186w;
import p926of.C18187x;
import p926of.C18188y;
import p926of.C18189z;
import p926of.InterfaceC18159W;
import p991rh.AbstractC19000i;
import p991rh.C19003l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import tf.C19909N;
import ye.C21525n;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/MessagesViewModelImpl;", "Lcom/openai/feature/messages/MessagesViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessagesViewModelImpl extends MessagesViewModel {

    /* JADX INFO: renamed from: i */
    public final C14459O f38487i;

    /* JADX INFO: renamed from: j */
    public final C7395t f38488j;

    /* JADX INFO: renamed from: k */
    public final C7392q f38489k;

    /* JADX INFO: renamed from: l */
    public final C2040j f38490l;

    /* JADX INFO: renamed from: m */
    public final C9473F f38491m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC13849E f38492n;

    /* JADX INFO: renamed from: o */
    public final C4666u f38493o;

    /* JADX INFO: renamed from: p */
    public final C19909N f38494p;

    /* JADX INFO: renamed from: q */
    public final C16382j f38495q;

    /* JADX INFO: renamed from: r */
    public final C5710c f38496r;

    /* JADX INFO: renamed from: s */
    public final C3708d f38497s;

    /* JADX INFO: renamed from: t */
    public final C20212a f38498t;

    /* JADX INFO: renamed from: u */
    public final C3332T f38499u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC20904w f38500v;

    /* JADX INFO: renamed from: w */
    public final C11434h f38501w;

    /* JADX INFO: renamed from: x */
    public final C3430e f38502x;

    public MessagesViewModelImpl(C14459O c14459o, C7395t c7395t, C7392q c7392q, C2040j c2040j, C20217f c20217f, C9473F c9473f, InterfaceC13849E interfaceC13849E, C4666u c4666u, C19909N c19909n, C16382j c16382j, C5710c c5710c, C1991h c1991h, C3708d c3708d, C20212a c20212a, C3332T c3332t, InterfaceC20904w interfaceC20904w, C11434h c11434h) {
        super(new C18160X(null, null, false, null, null, ((C14005w2) interfaceC13849E).m15481a(C13919b0.f43970c), false, null, null, C17690x.f56481Y, null));
        this.f38487i = c14459o;
        this.f38488j = c7395t;
        this.f38489k = c7392q;
        this.f38490l = c2040j;
        this.f38491m = c9473f;
        this.f38492n = interfaceC13849E;
        this.f38493o = c4666u;
        this.f38494p = c19909n;
        this.f38495q = c16382j;
        this.f38496r = c5710c;
        this.f38497s = c3708d;
        this.f38498t = c20212a;
        this.f38499u = c3332t;
        this.f38500v = interfaceC20904w;
        this.f38501w = c11434h;
        this.f38502x = AbstractC8168p6.m8749b("MessagesViewModel", null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14294n(MessagesViewModelImpl messagesViewModelImpl, C7351f0 c7351f0, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$copy$1 messagesViewModelImpl$copy$1;
        C20857C c20857c;
        InterfaceC20904w interfaceC20904w;
        String str;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$copy$1) {
            messagesViewModelImpl$copy$1 = (MessagesViewModelImpl$copy$1) abstractC19687c;
            int i10 = messagesViewModelImpl$copy$1.f38508r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$copy$1.f38508r0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$copy$1 = new MessagesViewModelImpl$copy$1(messagesViewModelImpl, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$copy$1 = new MessagesViewModelImpl$copy$1(messagesViewModelImpl, abstractC19687c);
        }
        Object objM3221t = messagesViewModelImpl$copy$1.f38506p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$copy$1.f38508r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            C3590f c3590fM14307b = MessagesViewModelImplKt.m14307b(c7351f0.f23291f);
            if (c3590fM14307b != null) {
                messagesViewModelImpl.m14393h(new C2054c(c3590fM14307b, MessagesViewModelImplKt.m14306a(c7351f0.f23291f)));
            }
            c20857c = C20857C.f66326h;
            C2207t0 c2207t0 = messagesViewModelImpl.f38487i.f45526y;
            InterfaceC20904w interfaceC20904w2 = messagesViewModelImpl.f38500v;
            messagesViewModelImpl$copy$1.f38503Y = interfaceC20904w2;
            messagesViewModelImpl$copy$1.f38504Z = c20857c;
            messagesViewModelImpl$copy$1.f38505o0 = "conversation_id";
            messagesViewModelImpl$copy$1.f38508r0 = 1;
            objM3221t = AbstractC2124C.m3221t(c2207t0, messagesViewModelImpl$copy$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            interfaceC20904w = interfaceC20904w2;
            str = "conversation_id";
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = messagesViewModelImpl$copy$1.f38505o0;
            c20857c = messagesViewModelImpl$copy$1.f38504Z;
            interfaceC20904w = messagesViewModelImpl$copy$1.f38503Y;
            AbstractC9233X.m9807c(objM3221t);
        }
        String str2 = ((C3694b) objM3221t).f11216a;
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        interfaceC20904w.mo21447a(c20857c, AbstractC17660E.m19258c(new C17309l(str, str2)));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: o */
    public static final Object m14295o(MessagesViewModelImpl messagesViewModelImpl, String str, String str2, boolean z6, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$handleLink$1 messagesViewModelImpl$handleLink$1;
        boolean z10;
        Object objM14302v;
        AbstractC6659u abstractC6659u;
        Iterator it;
        Object next;
        C0937I1 c0937i1;
        String url;
        C0937I1 citation;
        String str3;
        boolean z11;
        MessagesViewModelImpl messagesViewModelImpl2;
        boolean z12;
        boolean zEquals;
        MessagesViewModelImpl messagesViewModelImpl3 = messagesViewModelImpl;
        String str4 = str;
        String str5 = str2;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$handleLink$1) {
            messagesViewModelImpl$handleLink$1 = (MessagesViewModelImpl$handleLink$1) abstractC19687c;
            int i10 = messagesViewModelImpl$handleLink$1.f38532u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$handleLink$1.f38532u0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$handleLink$1 = new MessagesViewModelImpl$handleLink$1(messagesViewModelImpl3, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$handleLink$1 = new MessagesViewModelImpl$handleLink$1(messagesViewModelImpl3, abstractC19687c);
        }
        Object obj = messagesViewModelImpl$handleLink$1.f38530s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$handleLink$1.f38532u0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Uri uri = Uri.parse(str2);
            if (AbstractC16544l.m18089b(uri.getScheme(), "code")) {
                messagesViewModelImpl$handleLink$1.f38532u0 = 1;
                if (messagesViewModelImpl3.m14305y(str4, messagesViewModelImpl$handleLink$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                AbstractC16544l.m18094g(str5, "<this>");
                if (AbstractC21329w.m21734u(str5, "file-service://", false)) {
                    messagesViewModelImpl$handleLink$1.f38532u0 = 2;
                    if (messagesViewModelImpl3.m14300t(str5, messagesViewModelImpl$handleLink$1) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (AbstractC21329w.m21726m(uri.getScheme(), "sandbox")) {
                    messagesViewModelImpl$handleLink$1.f38532u0 = 3;
                    if (messagesViewModelImpl3.m14301u(str4, uri, messagesViewModelImpl$handleLink$1) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    messagesViewModelImpl$handleLink$1.f38524Y = messagesViewModelImpl3;
                    messagesViewModelImpl$handleLink$1.f38525Z = str4;
                    messagesViewModelImpl$handleLink$1.f38526o0 = str5;
                    z10 = z6;
                    messagesViewModelImpl$handleLink$1.f38528q0 = z10;
                    messagesViewModelImpl$handleLink$1.f38532u0 = 4;
                    objM14302v = messagesViewModelImpl3.m14302v(str4, messagesViewModelImpl$handleLink$1);
                    if (objM14302v == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC6659u = (AbstractC6659u) objM14302v;
                    if (abstractC6659u != null) {
                        messagesViewModelImpl3.getClass();
                        it = abstractC6659u.m7171c().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!AbstractC16544l.m18089b(((C0937I1) next).f2687c, str5));
                        c0937i1 = (C0937I1) next;
                        if (c0937i1 != null) {
                        }
                        messagesViewModelImpl3.f38500v.mo21448b(C20857C.f66333o, str5, C17690x.f56481Y);
                        Intent intent = new Intent();
                        AbstractC9186P.m9748b(intent, str5);
                        messagesViewModelImpl3.m14393h(new C2055d(intent));
                    }
                }
            }
        } else if (i11 == 1 || i11 == 2 || i11 == 3) {
            AbstractC9233X.m9807c(obj);
        } else {
            if (i11 == 4) {
                boolean z13 = messagesViewModelImpl$handleLink$1.f38528q0;
                String str6 = messagesViewModelImpl$handleLink$1.f38526o0;
                String str7 = messagesViewModelImpl$handleLink$1.f38525Z;
                MessagesViewModelImpl messagesViewModelImpl4 = messagesViewModelImpl$handleLink$1.f38524Y;
                AbstractC9233X.m9807c(obj);
                z10 = z13;
                messagesViewModelImpl3 = messagesViewModelImpl4;
                objM14302v = obj;
                str5 = str6;
                str4 = str7;
                abstractC6659u = (AbstractC6659u) objM14302v;
                if (abstractC6659u != null) {
                    messagesViewModelImpl3.getClass();
                    it = abstractC6659u.m7171c().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC16544l.m18089b(((C0937I1) next).f2687c, str5));
                    c0937i1 = (C0937I1) next;
                    if (c0937i1 != null || AbstractC16544l.m18089b(c0937i1.f2690f, Boolean.TRUE)) {
                        messagesViewModelImpl3.f38500v.mo21448b(C20857C.f66333o, str5, C17690x.f56481Y);
                        Intent intent2 = new Intent();
                        AbstractC9186P.m9748b(intent2, str5);
                        messagesViewModelImpl3.m14393h(new C2055d(intent2));
                    } else {
                        boolean zM15481a = ((C14005w2) messagesViewModelImpl3.f38492n).m15481a(C14008x1.f44090c);
                        C2207t0 c2207t0 = messagesViewModelImpl3.f38487i.f45526y;
                        messagesViewModelImpl$handleLink$1.f38524Y = messagesViewModelImpl3;
                        messagesViewModelImpl$handleLink$1.f38525Z = str4;
                        messagesViewModelImpl$handleLink$1.f38526o0 = str5;
                        messagesViewModelImpl$handleLink$1.f38527p0 = c0937i1;
                        messagesViewModelImpl$handleLink$1.f38528q0 = z10;
                        messagesViewModelImpl$handleLink$1.f38529r0 = zM15481a;
                        messagesViewModelImpl$handleLink$1.f38532u0 = 5;
                        Object objM3221t = AbstractC2124C.m3221t(c2207t0, messagesViewModelImpl$handleLink$1);
                        if (objM3221t == enumC19250a) {
                            return enumC19250a;
                        }
                        url = str5;
                        citation = c0937i1;
                        str3 = str4;
                        z11 = z10;
                        obj = objM3221t;
                        messagesViewModelImpl2 = messagesViewModelImpl3;
                        z12 = zM15481a;
                    }
                }
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = messagesViewModelImpl$handleLink$1.f38529r0;
                z11 = messagesViewModelImpl$handleLink$1.f38528q0;
                citation = messagesViewModelImpl$handleLink$1.f38527p0;
                url = messagesViewModelImpl$handleLink$1.f38526o0;
                str3 = messagesViewModelImpl$handleLink$1.f38525Z;
                messagesViewModelImpl2 = messagesViewModelImpl$handleLink$1.f38524Y;
                AbstractC9233X.m9807c(obj);
            }
            C9436E safeUrls = ((C3694b) obj).f11226k;
            Map map = MessagesViewModelImplKt.f38638a;
            AbstractC16544l.m18094g(url, "url");
            AbstractC16544l.m18094g(citation, "citation");
            AbstractC16544l.m18094g(safeUrls, "safeUrls");
            if (z12) {
                Boolean bool = citation.f2690f;
                zEquals = bool != null ? bool.equals(Boolean.TRUE) : safeUrls.m10001a(url);
            } else {
                zEquals = true;
            }
            messagesViewModelImpl2.f38500v.mo21447a(C20890i.f66560f, AbstractC17659D.m19244f(new C17309l("url", url), new C17309l("trusted", Boolean.valueOf(zEquals)), new C17309l("skipPopup", Boolean.valueOf(z11))));
            C18162Z c18162z = new C18162Z(str3, citation, zEquals);
            if (z11) {
                Intent intent3 = new Intent();
                AbstractC9186P.m9748b(intent3, url);
                messagesViewModelImpl2.m14393h(new C2055d(intent3));
            } else {
                messagesViewModelImpl2.m14397m(new MessagesViewModelImpl$handleLink$2(c18162z));
            }
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0064->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14296p(MessagesViewModelImpl messagesViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$logCitationImpressions$1 messagesViewModelImpl$logCitationImpressions$1;
        MessagesViewModelImpl messagesViewModelImpl2;
        Iterator it;
        AbstractC6659u abstractC6659u;
        C0937I1 c0937i1;
        C20890i c20890i;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$logCitationImpressions$1) {
            messagesViewModelImpl$logCitationImpressions$1 = (MessagesViewModelImpl$logCitationImpressions$1) abstractC19687c;
            int i10 = messagesViewModelImpl$logCitationImpressions$1.f38552r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$logCitationImpressions$1.f38552r0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$logCitationImpressions$1 = new MessagesViewModelImpl$logCitationImpressions$1(messagesViewModelImpl, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$logCitationImpressions$1 = new MessagesViewModelImpl$logCitationImpressions$1(messagesViewModelImpl, abstractC19687c);
        }
        Object objM14302v = messagesViewModelImpl$logCitationImpressions$1.f38550p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$logCitationImpressions$1.f38552r0;
        if (i11 != 0) {
            if (i11 == 1) {
                messagesViewModelImpl = messagesViewModelImpl$logCitationImpressions$1.f38547Y;
                AbstractC9233X.m9807c(objM14302v);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = messagesViewModelImpl$logCitationImpressions$1.f38549o0;
                abstractC6659u = messagesViewModelImpl$logCitationImpressions$1.f38548Z;
                messagesViewModelImpl2 = messagesViewModelImpl$logCitationImpressions$1.f38547Y;
                AbstractC9233X.m9807c(objM14302v);
            }
            while (it.hasNext()) {
                c0937i1 = (C0937I1) it.next();
                c20890i = C20890i.f66558d;
                messagesViewModelImpl$logCitationImpressions$1.f38547Y = messagesViewModelImpl2;
                messagesViewModelImpl$logCitationImpressions$1.f38548Z = abstractC6659u;
                messagesViewModelImpl$logCitationImpressions$1.f38549o0 = it;
                messagesViewModelImpl$logCitationImpressions$1.f38552r0 = 2;
                if (messagesViewModelImpl2.m14303w(abstractC6659u, c0937i1, c20890i, messagesViewModelImpl$logCitationImpressions$1) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM14302v);
        messagesViewModelImpl$logCitationImpressions$1.f38547Y = messagesViewModelImpl;
        messagesViewModelImpl$logCitationImpressions$1.f38552r0 = 1;
        objM14302v = messagesViewModelImpl.m14302v(str, messagesViewModelImpl$logCitationImpressions$1);
        if (objM14302v == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6659u abstractC6659u2 = (AbstractC6659u) objM14302v;
        if (abstractC6659u2 != null && abstractC6659u2.m7175g()) {
            messagesViewModelImpl2 = messagesViewModelImpl;
            it = abstractC6659u2.m7171c().iterator();
            abstractC6659u = abstractC6659u2;
            while (it.hasNext()) {
                c0937i1 = (C0937I1) it.next();
                c20890i = C20890i.f66558d;
                messagesViewModelImpl$logCitationImpressions$1.f38547Y = messagesViewModelImpl2;
                messagesViewModelImpl$logCitationImpressions$1.f38548Z = abstractC6659u;
                messagesViewModelImpl$logCitationImpressions$1.f38549o0 = it;
                messagesViewModelImpl$logCitationImpressions$1.f38552r0 = 2;
                if (messagesViewModelImpl2.m14303w(abstractC6659u, c0937i1, c20890i, messagesViewModelImpl$logCitationImpressions$1) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: q */
    public static final Object m14297q(MessagesViewModelImpl messagesViewModelImpl, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$optOutOfCanmore$1 messagesViewModelImpl$optOutOfCanmore$1;
        C7351f0 c7351f0;
        Object objInvoke;
        MessagesViewModelImpl messagesViewModelImpl2;
        C7351f0 c7351f1;
        Object objInvoke2;
        C7351f0 c7351f2;
        C14459O c14459o;
        EnumC21517f enumC21517f;
        MessagesViewModelImpl messagesViewModelImpl3 = messagesViewModelImpl;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$optOutOfCanmore$1) {
            messagesViewModelImpl$optOutOfCanmore$1 = (MessagesViewModelImpl$optOutOfCanmore$1) abstractC19687c;
            int i10 = messagesViewModelImpl$optOutOfCanmore$1.f38622r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$optOutOfCanmore$1.f38622r0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$optOutOfCanmore$1 = new MessagesViewModelImpl$optOutOfCanmore$1(messagesViewModelImpl3, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$optOutOfCanmore$1 = new MessagesViewModelImpl$optOutOfCanmore$1(messagesViewModelImpl3, abstractC19687c);
        }
        MessagesViewModelImpl$optOutOfCanmore$1 messagesViewModelImpl$optOutOfCanmore$2 = messagesViewModelImpl$optOutOfCanmore$1;
        Object objM3221t = messagesViewModelImpl$optOutOfCanmore$2.f38620p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$optOutOfCanmore$2.f38622r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                messagesViewModelImpl3 = messagesViewModelImpl$optOutOfCanmore$2.f38617Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                c7351f1 = messagesViewModelImpl$optOutOfCanmore$2.f38619o0;
                C7351f0 c7351f3 = messagesViewModelImpl$optOutOfCanmore$2.f38618Z;
                messagesViewModelImpl2 = messagesViewModelImpl$optOutOfCanmore$2.f38617Y;
                AbstractC9233X.m9807c(objM3221t);
                c7351f0 = c7351f3;
                c14459o = messagesViewModelImpl2.f38487i;
                enumC21517f = EnumC21517f.f68138Z;
                messagesViewModelImpl$optOutOfCanmore$2.f38617Y = null;
                messagesViewModelImpl$optOutOfCanmore$2.f38618Z = null;
                messagesViewModelImpl$optOutOfCanmore$2.f38619o0 = null;
                messagesViewModelImpl$optOutOfCanmore$2.f38622r0 = 3;
                if (c14459o.m15984m(c7351f0, null, enumC21517f, c7351f1, messagesViewModelImpl$optOutOfCanmore$2) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        C2604o c2604o = messagesViewModelImpl3.f38487i.f45521t;
        messagesViewModelImpl$optOutOfCanmore$2.f38617Y = messagesViewModelImpl3;
        messagesViewModelImpl$optOutOfCanmore$2.f38622r0 = 1;
        objM3221t = AbstractC2124C.m3221t(c2604o, messagesViewModelImpl$optOutOfCanmore$2);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C6636i c6636i = (C6636i) objM3221t;
        C21036q c21036qM7167f = c6636i != null ? c6636i.m7167f() : null;
        if (c21036qM7167f != null) {
            Iterator it = c21036qM7167f.f66917a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke2 = null;
                    break;
                }
                objInvoke2 = c21036qM7167f.f66918b.invoke(it.next());
                c7351f2 = (C7351f0) objInvoke2;
                if (c7351f2.f23290e.m7783a()) {
                    break;
                }
            } while (!c7351f2.f23293h.m7782a());
            c7351f0 = (C7351f0) objInvoke2;
        } else {
            c7351f0 = null;
        }
        if (c7351f0 == null) {
            AbstractC8160o6.m8726a(messagesViewModelImpl3.f38502x, "No canmore message found to regenerate for opt out.", null, 6);
        } else {
            c21036qM7167f.getClass();
            Iterator it2 = c21036qM7167f.f66917a.iterator();
            do {
                if (!it2.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = c21036qM7167f.f66918b.invoke(it2.next());
            } while (((C7351f0) objInvoke).f23290e != EnumC7359j0.f23343Z);
            C7351f0 c7351f4 = (C7351f0) objInvoke;
            InterfaceC20904w interfaceC20904w = messagesViewModelImpl3.f38500v;
            C20864J c20864j = C20864J.f66426e;
            String str = c7351f4 != null ? c7351f4.f23286a : null;
            if (str == null) {
                str = "";
            }
            interfaceC20904w.mo21447a(c20864j, AbstractC17660E.m19258c(new C17309l("user_message_id", str)));
            C21984a1.Companion.getClass();
            String strM22339a = C21980Z0.m22339a();
            C7326L c7326l = new C7326L("The user has requested the canvas tool be disabled for this conversation. You should not call the tool again.");
            C22020j1.Companion.getClass();
            C7351f0 c7351f5 = new C7351f0(strM22339a, null, c7351f0.f23288c, null, EnumC7359j0.f23346q0, c7326l, "gpt-4o-mini", null, null, null, null, null, null, null, "gpt-4o-mini", false, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AbstractC9393x3.m9974d(EnumC1117k4.Canmore), null, null, false, -295030, 479);
            messagesViewModelImpl$optOutOfCanmore$2.f38617Y = messagesViewModelImpl3;
            messagesViewModelImpl$optOutOfCanmore$2.f38618Z = c7351f0;
            messagesViewModelImpl$optOutOfCanmore$2.f38619o0 = c7351f5;
            messagesViewModelImpl$optOutOfCanmore$2.f38622r0 = 2;
            Object objM7282a = messagesViewModelImpl3.f38487i.f45525x.m7282a(messagesViewModelImpl$optOutOfCanmore$2);
            if (objM7282a != EnumC19250a.f61036Y) {
                objM7282a = c17296c;
            }
            if (objM7282a == enumC19250a) {
                return enumC19250a;
            }
            messagesViewModelImpl2 = messagesViewModelImpl3;
            c7351f1 = c7351f5;
            c14459o = messagesViewModelImpl2.f38487i;
            enumC21517f = EnumC21517f.f68138Z;
            messagesViewModelImpl$optOutOfCanmore$2.f38617Y = null;
            messagesViewModelImpl$optOutOfCanmore$2.f38618Z = null;
            messagesViewModelImpl$optOutOfCanmore$2.f38619o0 = null;
            messagesViewModelImpl$optOutOfCanmore$2.f38622r0 = 3;
            if (c14459o.m15984m(c7351f0, null, enumC21517f, c7351f1, messagesViewModelImpl$optOutOfCanmore$2) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: r */
    public static final Object m14298r(MessagesViewModelImpl messagesViewModelImpl, C18148K c18148k, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$rateGizmo$1 messagesViewModelImpl$rateGizmo$1;
        String str;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$rateGizmo$1) {
            messagesViewModelImpl$rateGizmo$1 = (MessagesViewModelImpl$rateGizmo$1) abstractC19687c;
            int i10 = messagesViewModelImpl$rateGizmo$1.f38627q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$rateGizmo$1.f38627q0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$rateGizmo$1 = new MessagesViewModelImpl$rateGizmo$1(messagesViewModelImpl, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$rateGizmo$1 = new MessagesViewModelImpl$rateGizmo$1(messagesViewModelImpl, abstractC19687c);
        }
        Object obj = messagesViewModelImpl$rateGizmo$1.f38625o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$rateGizmo$1.f38627q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            str = c18148k.f57894a;
            messagesViewModelImpl.f38500v.mo21447a(C20893l.f66570h, AbstractC17660E.m19258c(new C17309l("gizmo_id", new C21936L0(str))));
            C6864c c6864c = new C6864c(str);
            messagesViewModelImpl$rateGizmo$1.f38623Y = messagesViewModelImpl;
            messagesViewModelImpl$rateGizmo$1.f38624Z = str;
            messagesViewModelImpl$rateGizmo$1.f38627q0 = 1;
            if (messagesViewModelImpl.f38487i.m15975d(c6864c, messagesViewModelImpl$rateGizmo$1) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = messagesViewModelImpl$rateGizmo$1.f38624Z;
            MessagesViewModelImpl messagesViewModelImpl2 = messagesViewModelImpl$rateGizmo$1.f38623Y;
            AbstractC9233X.m9807c(obj);
            str = str2;
            messagesViewModelImpl = messagesViewModelImpl2;
        }
        messagesViewModelImpl.m14393h(new C2058g(C5379S.f17631i.m5898d(str), true));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: s */
    public static final Object m14299s(MessagesViewModelImpl messagesViewModelImpl, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        MessagesViewModelImpl$retry$1 messagesViewModelImpl$retry$1;
        messagesViewModelImpl.getClass();
        if (abstractC19687c instanceof MessagesViewModelImpl$retry$1) {
            messagesViewModelImpl$retry$1 = (MessagesViewModelImpl$retry$1) abstractC19687c;
            int i10 = messagesViewModelImpl$retry$1.f38632q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$retry$1.f38632q0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$retry$1 = new MessagesViewModelImpl$retry$1(messagesViewModelImpl, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$retry$1 = new MessagesViewModelImpl$retry$1(messagesViewModelImpl, abstractC19687c);
        }
        MessagesViewModelImpl$retry$1 messagesViewModelImpl$retry$2 = messagesViewModelImpl$retry$1;
        Object objM3221t = messagesViewModelImpl$retry$2.f38630o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$retry$2.f38632q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = messagesViewModelImpl$retry$2.f38629Z;
                messagesViewModelImpl = messagesViewModelImpl$retry$2.f38628Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        C2207t0 c2207t0 = messagesViewModelImpl.f38487i.f45526y;
        messagesViewModelImpl$retry$2.f38628Y = messagesViewModelImpl;
        messagesViewModelImpl$retry$2.f38629Z = z6;
        messagesViewModelImpl$retry$2.f38632q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c2207t0, messagesViewModelImpl$retry$2);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        AbstractC6659u abstractC6659u = (AbstractC6659u) AbstractC17680n.m19353c0(AbstractC3693a.m4405e(((C3694b) objM3221t).f11224i));
        C7351f0 c7351f0M7172d = abstractC6659u != null ? abstractC6659u.m7172d() : null;
        if ((c7351f0M7172d != null ? c7351f0M7172d.f23290e : null) == EnumC7359j0.f23343Z) {
            messagesViewModelImpl.f38500v.mo21447a(C20857C.f66341w, C17690x.f56481Y);
            EnumC21517f enumC21517f = EnumC21517f.f68138Z;
            messagesViewModelImpl$retry$2.f38628Y = null;
            messagesViewModelImpl$retry$2.f38632q0 = 2;
            if (messagesViewModelImpl.f38487i.m15984m(c7351f0M7172d, null, enumC21517f, null, messagesViewModelImpl$retry$2) == enumC19250a) {
                return enumC19250a;
            }
        } else if (c7351f0M7172d == null || z6) {
            messagesViewModelImpl.f38500v.mo21447a(C20857C.f66339u, C17690x.f56481Y);
            messagesViewModelImpl$retry$2.f38628Y = null;
            messagesViewModelImpl$retry$2.f38632q0 = 4;
            C14459O c14459o = messagesViewModelImpl.f38487i;
            c14459o.getClass();
            if (c14459o.m15992u(new C14495x(true, c14459o, null), messagesViewModelImpl$retry$2) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            EnumC21517f enumC21517f2 = c7351f0M7172d.f23308w.isEmpty() ^ true ? EnumC21517f.f68139o0 : EnumC21517f.f68138Z;
            messagesViewModelImpl$retry$2.f38628Y = null;
            messagesViewModelImpl$retry$2.f38632q0 = 3;
            messagesViewModelImpl.f38500v.mo21447a(C20857C.f66340v, C17690x.f56481Y);
            Object objM15984m = messagesViewModelImpl.f38487i.m15984m(c7351f0M7172d, null, enumC21517f2, null, messagesViewModelImpl$retry$2);
            if (objM15984m != enumC19250a) {
                objM15984m = c17296c;
            }
            if (objM15984m == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC18159W intent = (InterfaceC18159W) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C18183t) {
            m14394i(new MessagesViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        boolean z6 = intent instanceof C18151N;
        C5710c c5710c = this.f38496r;
        if (z6) {
            C5432w0 c5432w0 = C5432w0.f17762g;
            String conversationId = c5710c.f18498a;
            String messageId = ((C18151N) intent).f57899a.f23286a;
            c5432w0.getClass();
            AbstractC16544l.m18094g(conversationId, "conversationId");
            AbstractC16544l.m18094g(messageId, "messageId");
            m14393h(new C2058g(c5432w0.m5885a(new C5393d(3, conversationId, messageId)), true));
            return;
        }
        if (intent instanceof C18149L) {
            m14394i(new MessagesViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C18138A) {
            m14394i(new MessagesViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C18158V) {
            m14394i(new MessagesViewModelImpl$onIntent$4(this, intent, null));
            return;
        }
        if (intent instanceof C18150M) {
            m14394i(new MessagesViewModelImpl$onIntent$5(this, intent, null));
            return;
        }
        if (intent instanceof C18146I) {
            C18146I c18146i = (C18146I) intent;
            C19909N.m20798a(this.f38494p, c18146i.f57888a, c18146i.f57889b, false, c18146i.f57890c, c18146i.f57891d, 4);
            m14393h(new C2058g(C5381U.f17633g.m5899d(c5710c.f18498a), true));
            return;
        }
        if (intent instanceof C18189z) {
            m14397m(MessagesViewModelImpl$onIntent$7.f38610Y);
            return;
        }
        if (intent instanceof C18184u) {
            m14393h(new C2054c(((C18184u) intent).f57998a));
            return;
        }
        if (intent instanceof C18181r) {
            m14394i(new MessagesViewModelImpl$onIntent$8(this, intent, null));
            return;
        }
        if (intent instanceof C18147J) {
            m14394i(new MessagesViewModelImpl$onIntent$9(this, intent, null));
            return;
        }
        if (intent instanceof C18185v) {
            m14394i(new MessagesViewModelImpl$onIntent$10(this, intent, null));
            return;
        }
        if (intent instanceof C18188y) {
            m14397m(MessagesViewModelImpl$onIntent$11.f38559Y);
            return;
        }
        if (intent instanceof C18144G) {
            m14394i(new MessagesViewModelImpl$onIntent$14(this, null));
            return;
        }
        if (intent instanceof C18186w) {
            m14394i(new MessagesViewModelImpl$onIntent$15(this, intent, null));
            return;
        }
        if (intent instanceof C18187x) {
            m14394i(new MessagesViewModelImpl$onIntent$16(this, intent, null));
            return;
        }
        if (intent instanceof C18143F) {
            m14394i(new MessagesViewModelImpl$onIntent$17(this, intent, null));
            return;
        }
        if (intent.equals(C18182s.f57996a)) {
            m14394i(new MessagesViewModelImpl$onIntent$18(this, null));
            return;
        }
        boolean z10 = intent instanceof C18154Q;
        InterfaceC20904w interfaceC20904w = this.f38500v;
        if (z10) {
            interfaceC20904w.mo21447a(C20894m.f66591e, C17690x.f56481Y);
            return;
        }
        if (intent instanceof C18148K) {
            m14394i(new MessagesViewModelImpl$onIntent$19(this, intent, null));
            return;
        }
        if (intent instanceof C18157U) {
            if (((C18157U) intent).f57908a) {
                interfaceC20904w.mo21447a(C20896o.f66602f, C17690x.f56481Y);
            }
            m14397m(new MessagesViewModelImpl$onIntent$20(intent));
            return;
        }
        if (intent.equals(C18140C.f57877a)) {
            m14394i(new MessagesViewModelImpl$onIntent$21(this, null));
            return;
        }
        if (intent instanceof C18155S) {
            m14397m(new MessagesViewModelImpl$onIntent$22(intent));
            return;
        }
        if (intent instanceof C18153P) {
            if (((C14005w2) this.f38492n).m15481a(C13975p0.f44033c)) {
                m14397m(new MessagesViewModelImpl$onIntent$23(intent));
                return;
            }
            return;
        }
        if (intent instanceof C18139B) {
            Map map = ((C18160X) this.f40343c.getValue()).f57919j;
            Set setKeySet = map.keySet();
            Set set = ((C18139B) intent).f57876a;
            Set setM19264d = AbstractC17665J.m19264d(set, setKeySet);
            if (setM19264d.isEmpty()) {
                return;
            }
            Set set2 = set;
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(set2, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            for (Object obj : set2) {
                linkedHashMap.put(obj, (String) map.get((String) obj));
            }
            m14397m(new MessagesViewModelImpl$onIntent$24(linkedHashMap));
            C2040j c2040j = this.f38490l;
            c2040j.getClass();
            m14396l(MessagesViewModelImpl$onIntent$26.f38592Y, new C2134H(setM19264d.isEmpty() ? C2182h.f6683Y : new C2219z0(new C2039i(c2040j, setM19264d, null)), new MessagesViewModelImpl$onIntent$25(this, null)));
            return;
        }
        if (intent instanceof C18152O) {
            C18152O c18152o = (C18152O) intent;
            C3332T c3332t = this.f38499u;
            c3332t.getClass();
            String messageId2 = c18152o.f57900a;
            AbstractC16544l.m18094g(messageId2, "messageId");
            String canmoreId = c18152o.f57901b;
            AbstractC16544l.m18094g(canmoreId, "canmoreId");
            c3332t.m4169b(new C0254h0(new C21525n(messageId2, canmoreId, c18152o.f57902c, c18152o.f57903d), 20));
            return;
        }
        if (!(intent instanceof C18142E)) {
            if (intent instanceof C18141D) {
                m14394i(new MessagesViewModelImpl$onIntent$27(this, intent, null));
                return;
            }
            if (intent.equals(C18145H.f57887a)) {
                C5433x c5433x = C5433x.f17766g;
                String conversationId2 = c5710c.f18498a;
                c5433x.getClass();
                AbstractC16544l.m18094g(conversationId2, "conversationId");
                m14393h(new C2058g(c5433x.m5885a(new C0491v(conversationId2, 23)), true));
                return;
            }
            if (intent instanceof C18156T) {
                m14394i(new MessagesViewModelImpl$onIntent$28(this, intent, null));
                return;
            } else {
                if (intent.equals(C18180q.f57992a)) {
                    m14394i(new MessagesViewModelImpl$onIntent$29(this, null));
                    return;
                }
                return;
            }
        }
        C18142E c18142e = (C18142E) intent;
        C20212a c20212a = this.f38498t;
        c20212a.getClass();
        String messageId3 = c18142e.f57883b;
        AbstractC16544l.m18094g(messageId3, "messageId");
        List<AbstractC0985Q1> references = c18142e.f57884c;
        AbstractC16544l.m18094g(references, "references");
        for (AbstractC0985Q1 abstractC0985Q1 : references) {
            LinkedHashSet linkedHashSet = c20212a.f63990b;
            if (!linkedHashSet.contains(abstractC0985Q1)) {
                linkedHashSet.add(abstractC0985Q1);
                boolean z11 = abstractC0985Q1 instanceof C0924G0;
                C20903v c20903v = C20903v.f66627d;
                String str = c18142e.f57882a;
                if (z11) {
                    int i10 = 0;
                    for (Object obj2 : ((C0924G0) abstractC0985Q1).f2669d) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        c20212a.m21013a(c20903v, str, messageId3, abstractC0985Q1, Integer.valueOf(i10), references);
                        i10 = i11;
                        str = str;
                    }
                } else {
                    c20212a.m21013a(c20903v, str, messageId3, abstractC0985Q1, null, references);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m14300t(String value, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$downloadAssetPointer$1 messagesViewModelImpl$downloadAssetPointer$1;
        MessagesViewModelImpl messagesViewModelImpl;
        if (abstractC19687c instanceof MessagesViewModelImpl$downloadAssetPointer$1) {
            messagesViewModelImpl$downloadAssetPointer$1 = (MessagesViewModelImpl$downloadAssetPointer$1) abstractC19687c;
            int i10 = messagesViewModelImpl$downloadAssetPointer$1.f38512p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$downloadAssetPointer$1.f38512p0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$downloadAssetPointer$1 = new MessagesViewModelImpl$downloadAssetPointer$1(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$downloadAssetPointer$1 = new MessagesViewModelImpl$downloadAssetPointer$1(this, abstractC19687c);
        }
        Object objM7792b = messagesViewModelImpl$downloadAssetPointer$1.f38510Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$downloadAssetPointer$1.f38512p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7792b);
            m14392g(C18178o.f57991a);
            AbstractC16544l.m18094g(value, "value");
            String strM22337a = C21907E.m22337a(value);
            messagesViewModelImpl$downloadAssetPointer$1.f38509Y = this;
            messagesViewModelImpl$downloadAssetPointer$1.f38512p0 = 1;
            objM7792b = this.f38489k.m7792b(strM22337a, messagesViewModelImpl$downloadAssetPointer$1);
            if (objM7792b == enumC19250a) {
                return enumC19250a;
            }
            messagesViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messagesViewModelImpl = messagesViewModelImpl$downloadAssetPointer$1.f38509Y;
            AbstractC9233X.m9807c(objM7792b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM7792b;
        if (abstractC6224C instanceof C6223B) {
            String str = ((C19003l) ((C6223B) abstractC6224C).f20258a).f60582b;
            if (str != null) {
                Intent intent = new Intent();
                AbstractC9186P.m9748b(intent, str);
                messagesViewModelImpl.m14393h(new C2055d(intent));
            }
        } else if (abstractC6224C instanceof AbstractC6249w) {
            AbstractC6249w abstractC6249w = (AbstractC6249w) abstractC6224C;
            messagesViewModelImpl.getClass();
            Throwable th2 = abstractC6249w.f20328a;
            if (th2 instanceof AbstractC19000i) {
                messagesViewModelImpl.m14392g(new C18177n((AbstractC19000i) th2));
            } else {
                messagesViewModelImpl.m14393h(new C2059h(AbstractC6224C.m6734a(abstractC6249w)));
            }
        } else if (!(abstractC6224C instanceof C6248v)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m14301u(String str, Uri uri, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$downloadSandboxFile$1 messagesViewModelImpl$downloadSandboxFile$1;
        MessagesViewModelImpl messagesViewModelImpl;
        String str2;
        C7395t c7395t;
        MessagesViewModelImpl messagesViewModelImpl2;
        AbstractC21955Q1 abstractC21955Q1;
        AbstractC21933K1 abstractC21933K1;
        Throwable th2;
        String str3;
        if (abstractC19687c instanceof MessagesViewModelImpl$downloadSandboxFile$1) {
            messagesViewModelImpl$downloadSandboxFile$1 = (MessagesViewModelImpl$downloadSandboxFile$1) abstractC19687c;
            int i10 = messagesViewModelImpl$downloadSandboxFile$1.f38519s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$downloadSandboxFile$1.f38519s0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$downloadSandboxFile$1 = new MessagesViewModelImpl$downloadSandboxFile$1(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$downloadSandboxFile$1 = new MessagesViewModelImpl$downloadSandboxFile$1(this, abstractC19687c);
        }
        Object objM3221t = messagesViewModelImpl$downloadSandboxFile$1.f38517q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$downloadSandboxFile$1.f38519s0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c7395t = messagesViewModelImpl$downloadSandboxFile$1.f38516p0;
                uri = messagesViewModelImpl$downloadSandboxFile$1.f38515o0;
                str2 = messagesViewModelImpl$downloadSandboxFile$1.f38514Z;
                messagesViewModelImpl = messagesViewModelImpl$downloadSandboxFile$1.f38513Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                messagesViewModelImpl2 = messagesViewModelImpl$downloadSandboxFile$1.f38513Y;
                AbstractC9233X.m9807c(objM3221t);
            }
            abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
            if (abstractC21955Q1 instanceof C21952P1) {
                str3 = (String) ((C21952P1) abstractC21955Q1).f69511a;
                if (str3 != null) {
                    Intent intent = new Intent();
                    AbstractC9186P.m9748b(intent, str3);
                    messagesViewModelImpl2.m14393h(new C2055d(intent));
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                th2 = abstractC21933K1.f69485a;
                if (th2 instanceof AbstractC19000i) {
                    messagesViewModelImpl2.m14392g(new C18177n((AbstractC19000i) th2));
                } else {
                    messagesViewModelImpl2.m14393h(new C2059h(abstractC21933K1));
                }
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        m14392g(C18178o.f57991a);
        C2604o c2604o = this.f38487i.f45521t;
        messagesViewModelImpl$downloadSandboxFile$1.f38513Y = this;
        messagesViewModelImpl$downloadSandboxFile$1.f38514Z = str;
        messagesViewModelImpl$downloadSandboxFile$1.f38515o0 = uri;
        C7395t c7395t2 = this.f38488j;
        messagesViewModelImpl$downloadSandboxFile$1.f38516p0 = c7395t2;
        messagesViewModelImpl$downloadSandboxFile$1.f38519s0 = 1;
        objM3221t = AbstractC2124C.m3221t(c2604o, messagesViewModelImpl$downloadSandboxFile$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        messagesViewModelImpl = this;
        str2 = str;
        c7395t = c7395t2;
        C6636i c6636i = (C6636i) objM3221t;
        if (c6636i == null) {
            return c17296c;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        messagesViewModelImpl$downloadSandboxFile$1.f38513Y = messagesViewModelImpl;
        messagesViewModelImpl$downloadSandboxFile$1.f38514Z = null;
        messagesViewModelImpl$downloadSandboxFile$1.f38515o0 = null;
        messagesViewModelImpl$downloadSandboxFile$1.f38516p0 = null;
        messagesViewModelImpl$downloadSandboxFile$1.f38519s0 = 2;
        objM3221t = c7395t.m7794a(c6636i.f21379a, str2, path, messagesViewModelImpl$downloadSandboxFile$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        messagesViewModelImpl2 = messagesViewModelImpl;
        abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
        if (abstractC21955Q1 instanceof C21952P1) {
            str3 = (String) ((C21952P1) abstractC21955Q1).f69511a;
            if (str3 != null) {
                Intent intent2 = new Intent();
                AbstractC9186P.m9748b(intent2, str3);
                messagesViewModelImpl2.m14393h(new C2055d(intent2));
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            th2 = abstractC21933K1.f69485a;
            if (th2 instanceof AbstractC19000i) {
                messagesViewModelImpl2.m14392g(new C18177n((AbstractC19000i) th2));
            } else {
                messagesViewModelImpl2.m14393h(new C2059h(abstractC21933K1));
            }
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m14302v(String id2, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$findMessageById$1 messagesViewModelImpl$findMessageById$1;
        if (abstractC19687c instanceof MessagesViewModelImpl$findMessageById$1) {
            messagesViewModelImpl$findMessageById$1 = (MessagesViewModelImpl$findMessageById$1) abstractC19687c;
            int i10 = messagesViewModelImpl$findMessageById$1.f38523p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$findMessageById$1.f38523p0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$findMessageById$1 = new MessagesViewModelImpl$findMessageById$1(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$findMessageById$1 = new MessagesViewModelImpl$findMessageById$1(this, abstractC19687c);
        }
        Object objM3221t = messagesViewModelImpl$findMessageById$1.f38521Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$findMessageById$1.f38523p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            C2207t0 c2207t0 = this.f38487i.f45526y;
            messagesViewModelImpl$findMessageById$1.f38520Y = id2;
            messagesViewModelImpl$findMessageById$1.f38523p0 = 1;
            objM3221t = AbstractC2124C.m3221t(c2207t0, messagesViewModelImpl$findMessageById$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            id2 = messagesViewModelImpl$findMessageById$1.f38520Y;
            AbstractC9233X.m9807c(objM3221t);
        }
        for (Object obj : AbstractC3693a.m4405e(((C3694b) objM3221t).f11224i)) {
            AbstractC6659u abstractC6659u = (AbstractC6659u) obj;
            abstractC6659u.getClass();
            AbstractC16544l.m18094g(id2, "id");
            if (abstractC6659u.m7176h(id2) != null) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: w */
    public final Object m14303w(AbstractC6659u abstractC6659u, C0937I1 c0937i1, AbstractC20882b abstractC20882b, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$logBrowseEvent$3 messagesViewModelImpl$logBrowseEvent$3;
        MessagesViewModelImpl messagesViewModelImpl;
        if (abstractC19687c instanceof MessagesViewModelImpl$logBrowseEvent$3) {
            messagesViewModelImpl$logBrowseEvent$3 = (MessagesViewModelImpl$logBrowseEvent$3) abstractC19687c;
            int i10 = messagesViewModelImpl$logBrowseEvent$3.f38546s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$logBrowseEvent$3.f38546s0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$logBrowseEvent$3 = new MessagesViewModelImpl$logBrowseEvent$3(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$logBrowseEvent$3 = new MessagesViewModelImpl$logBrowseEvent$3(this, abstractC19687c);
        }
        Object objM3221t = messagesViewModelImpl$logBrowseEvent$3.f38544q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$logBrowseEvent$3.f38546s0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            C2604o c2604o = this.f38487i.f45521t;
            messagesViewModelImpl$logBrowseEvent$3.f38540Y = this;
            messagesViewModelImpl$logBrowseEvent$3.f38541Z = abstractC6659u;
            messagesViewModelImpl$logBrowseEvent$3.f38542o0 = c0937i1;
            messagesViewModelImpl$logBrowseEvent$3.f38543p0 = abstractC20882b;
            messagesViewModelImpl$logBrowseEvent$3.f38546s0 = 1;
            objM3221t = AbstractC2124C.m3221t(c2604o, messagesViewModelImpl$logBrowseEvent$3);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            messagesViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC20882b = messagesViewModelImpl$logBrowseEvent$3.f38543p0;
            c0937i1 = messagesViewModelImpl$logBrowseEvent$3.f38542o0;
            abstractC6659u = messagesViewModelImpl$logBrowseEvent$3.f38541Z;
            messagesViewModelImpl = messagesViewModelImpl$logBrowseEvent$3.f38540Y;
            AbstractC9233X.m9807c(objM3221t);
        }
        C6636i c6636i = (C6636i) objM3221t;
        C17296C c17296c = C17296C.f55119a;
        if (c6636i != null) {
            InterfaceC20904w interfaceC20904w = messagesViewModelImpl.f38500v;
            C17309l c17309l = new C17309l("conversation_id", c6636i.f21379a);
            C17309l c17309l2 = new C17309l("model_slug", abstractC6659u.m7172d().f23292g);
            C17309l c17309l3 = new C17309l("message_id", abstractC6659u.m7172d().f23286a);
            C17309l c17309l4 = new C17309l("url", c0937i1.f2687c);
            ArrayList arrayListM7171c = abstractC6659u.m7171c();
            interfaceC20904w.mo21447a(abstractC20882b, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, new C17309l("citation_number", String.valueOf(Integer.valueOf(arrayListM7171c.size() - arrayListM7171c.indexOf(c0937i1))))));
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m14304x(String str, C0937I1 c0937i1, AbstractC20882b abstractC20882b, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$logBrowseEvent$1 messagesViewModelImpl$logBrowseEvent$1;
        MessagesViewModelImpl messagesViewModelImpl;
        if (abstractC19687c instanceof MessagesViewModelImpl$logBrowseEvent$1) {
            messagesViewModelImpl$logBrowseEvent$1 = (MessagesViewModelImpl$logBrowseEvent$1) abstractC19687c;
            int i10 = messagesViewModelImpl$logBrowseEvent$1.f38539r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$logBrowseEvent$1.f38539r0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$logBrowseEvent$1 = new MessagesViewModelImpl$logBrowseEvent$1(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$logBrowseEvent$1 = new MessagesViewModelImpl$logBrowseEvent$1(this, abstractC19687c);
        }
        Object objM14302v = messagesViewModelImpl$logBrowseEvent$1.f38537p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$logBrowseEvent$1.f38539r0;
        if (i11 != 0) {
            if (i11 == 1) {
                abstractC20882b = messagesViewModelImpl$logBrowseEvent$1.f38536o0;
                c0937i1 = messagesViewModelImpl$logBrowseEvent$1.f38535Z;
                messagesViewModelImpl = messagesViewModelImpl$logBrowseEvent$1.f38534Y;
                AbstractC9233X.m9807c(objM14302v);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM14302v);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM14302v);
        messagesViewModelImpl$logBrowseEvent$1.f38534Y = this;
        messagesViewModelImpl$logBrowseEvent$1.f38535Z = c0937i1;
        messagesViewModelImpl$logBrowseEvent$1.f38536o0 = abstractC20882b;
        messagesViewModelImpl$logBrowseEvent$1.f38539r0 = 1;
        objM14302v = m14302v(str, messagesViewModelImpl$logBrowseEvent$1);
        if (objM14302v == enumC19250a) {
            return enumC19250a;
        }
        messagesViewModelImpl = this;
        AbstractC6659u abstractC6659u = (AbstractC6659u) objM14302v;
        if (abstractC6659u == null) {
            return null;
        }
        messagesViewModelImpl$logBrowseEvent$1.f38534Y = null;
        messagesViewModelImpl$logBrowseEvent$1.f38535Z = null;
        messagesViewModelImpl$logBrowseEvent$1.f38536o0 = null;
        messagesViewModelImpl$logBrowseEvent$1.f38539r0 = 2;
        if (messagesViewModelImpl.m14303w(abstractC6659u, c0937i1, abstractC20882b, messagesViewModelImpl$logBrowseEvent$1) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m14305y(String str, AbstractC19687c abstractC19687c) {
        MessagesViewModelImpl$showCode$1 messagesViewModelImpl$showCode$1;
        MessagesViewModelImpl messagesViewModelImpl;
        if (abstractC19687c instanceof MessagesViewModelImpl$showCode$1) {
            messagesViewModelImpl$showCode$1 = (MessagesViewModelImpl$showCode$1) abstractC19687c;
            int i10 = messagesViewModelImpl$showCode$1.f38636p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messagesViewModelImpl$showCode$1.f38636p0 = i10 - Integer.MIN_VALUE;
            } else {
                messagesViewModelImpl$showCode$1 = new MessagesViewModelImpl$showCode$1(this, abstractC19687c);
            }
        } else {
            messagesViewModelImpl$showCode$1 = new MessagesViewModelImpl$showCode$1(this, abstractC19687c);
        }
        Object objM14302v = messagesViewModelImpl$showCode$1.f38634Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messagesViewModelImpl$showCode$1.f38636p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM14302v);
            messagesViewModelImpl$showCode$1.f38633Y = this;
            messagesViewModelImpl$showCode$1.f38636p0 = 1;
            objM14302v = m14302v(str, messagesViewModelImpl$showCode$1);
            if (objM14302v == enumC19250a) {
                return enumC19250a;
            }
            messagesViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messagesViewModelImpl = messagesViewModelImpl$showCode$1.f38633Y;
            AbstractC9233X.m9807c(objM14302v);
        }
        C6600F c6600f = objM14302v instanceof C6600F ? (C6600F) objM14302v : null;
        AbstractC6653q0 abstractC6653q0 = c6600f != null ? c6600f.f21314f : null;
        C6645m0 c6645m0 = abstractC6653q0 instanceof C6645m0 ? (C6645m0) abstractC6653q0 : null;
        messagesViewModelImpl.m14397m(new MessagesViewModelImpl$showCode$2(c6645m0 != null ? c6645m0.f21410c : null));
        return C17296C.f55119a;
    }
}
