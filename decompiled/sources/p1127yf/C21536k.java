package p1127yf;

import ai.AbstractC10620k;
import android.gov.nist.core.Separators;
import com.openai.chatgpt.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17311n;
import mm.C17314q;
import p003A1.C0155B1;
import p006A4.C0364y;
import p017Af.AbstractC0465L;
import p017Af.AbstractC0473d;
import p017Af.C0464K;
import p017Af.C0471b;
import p017Af.C0472c;
import p017Af.C0477h;
import p017Af.C0481l;
import p017Af.C0485p;
import p017Af.C0491v;
import p025An.C0644w;
import p040Bd.AbstractC0888A0;
import p040Bd.AbstractC0985Q1;
import p040Bd.C0911E;
import p040Bd.C0935I;
import p040Bd.C0937I1;
import p040Bd.C1113k0;
import p040Bd.C1119l0;
import p040Bd.C1186w1;
import p040Bd.C1204z1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1442q;
import p092Dc.C1991h;
import p095Df.AbstractC2043m;
import p095Df.C2031a;
import p095Df.C2042l;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p523V9.AbstractC8050b0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p526Vd.C8262d;
import p537W0.C8410b;
import p544W9.AbstractC8519M3;
import p548Wd.C8818b;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p575Xd.C9436E;
import p594Y9.AbstractC9961r4;
import p690cp.AbstractC12935u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p923oc.C18050f;
import p923oc.C18058n;
import p923oc.C18064t;
import p946pc.C18320E;
import p988rc.C18919g;
import p988rc.C18920h;
import p988rc.C18923k;

/* JADX INFO: renamed from: yf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21536k extends AbstractC16546n implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f68213Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f68214Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1991h f68215o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f68216p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f68217q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f68218r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9436E f68219s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC20904w f68220t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21536k(String str, String str2, C1991h c1991h, boolean z6, InterfaceC1436k interfaceC1436k, boolean z10, C9436E c9436e, InterfaceC20904w interfaceC20904w) {
        super(5);
        this.f68213Y = str;
        this.f68214Z = str2;
        this.f68215o0 = c1991h;
        this.f68216p0 = z6;
        this.f68217q0 = interfaceC1436k;
        this.f68218r0 = z10;
        this.f68219s0 = c9436e;
        this.f68220t0 = interfaceC20904w;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x027d  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b5  */
    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        AbstractC12935u abstractC12935u;
        Object objM9806b;
        int i10 = 1;
        C18320E Markdown = (C18320E) obj;
        C18064t content = (C18064t) obj2;
        C18919g richTextStringBuilder = (C18919g) obj3;
        InterfaceC1426a defaultContent = (InterfaceC1426a) obj4;
        InterfaceC1436k onLinkClick = (InterfaceC1436k) obj5;
        AbstractC16544l.m18094g(Markdown, "$this$Markdown");
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(richTextStringBuilder, "richTextStringBuilder");
        AbstractC16544l.m18094g(defaultContent, "defaultContent");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC9961r4 abstractC9961r4 = content.f57620a;
        boolean z6 = abstractC9961r4 instanceof C18050f;
        if (!z6) {
            obj6 = null;
            if (abstractC9961r4 instanceof C18058n) {
                if (z6) {
                    abstractC12935u = ((C18050f) abstractC9961r4).f57599a;
                    if (abstractC12935u instanceof C8262d) {
                        AbstractC16544l.m18092e(abstractC12935u, "null cannot be cast to non-null type com.openai.feature.conversations.domain.message.latex.InlineLatexNode");
                        C8262d c8262d = (C8262d) abstractC12935u;
                        String text = c8262d.f25761g;
                        AbstractC16544l.m18094g(text, "text");
                        AbstractC8050b0.m8444e(richTextStringBuilder, new C0491v(text, 0), 4, new C8410b(new C0485p(c8262d, 14), true, -877041147));
                    }
                }
                return (Integer) defaultContent.invoke();
            }
            if (z6) {
                abstractC12935u = ((C18050f) abstractC9961r4).f57599a;
                if (abstractC12935u instanceof C8262d) {
                    AbstractC16544l.m18092e(abstractC12935u, "null cannot be cast to non-null type com.openai.feature.conversations.domain.message.latex.InlineLatexNode");
                    C8262d c8262d2 = (C8262d) abstractC12935u;
                    String text2 = c8262d2.f25761g;
                    AbstractC16544l.m18094g(text2, "text");
                    AbstractC8050b0.m8444e(richTextStringBuilder, new C0491v(text2, 0), 4, new C8410b(new C0485p(c8262d2, 14), true, -877041147));
                }
            }
            return (Integer) defaultContent.invoke();
        }
        AbstractC12935u abstractC12935u2 = ((C18050f) abstractC9961r4).f57599a;
        if (abstractC12935u2 instanceof C8818b) {
            AbstractC16544l.m18092e(abstractC12935u2, "null cannot be cast to non-null type com.openai.feature.conversations.domain.message.reference.ContentReferenceNode");
            AbstractC0985Q1 abstractC0985Q1 = ((C8818b) abstractC12935u2).f27002g;
            if (abstractC0985Q1 instanceof AbstractC0888A0) {
                AbstractC0888A0 contentReference = (AbstractC0888A0) abstractC0985Q1;
                String messageId = this.f68214Z;
                AbstractC16544l.m18094g(messageId, "messageId");
                AbstractC16544l.m18094g(contentReference, "contentReference");
                C1991h c1991h = this.f68215o0;
                InterfaceC1436k onIntent = this.f68217q0;
                AbstractC16544l.m18094g(onIntent, "onIntent");
                C0471b c0471b = new C0471b(onIntent, this.f68213Y, messageId, 1);
                boolean z10 = contentReference instanceof C0937I1;
                boolean z11 = this.f68216p0;
                if (z10) {
                    C0937I1 c0937i1 = (C0937I1) contentReference;
                    C2042l c2042l = AbstractC2043m.f6253a;
                    List listM21697e0 = AbstractC21322p.m21697e0(c1991h.m3161c(R.string.website_source_parenthesis, "❞"), new String[]{"❞"}, 0, 6);
                    String str = (String) AbstractC17680n.m19343S(listM21697e0);
                    if (str != null) {
                        richTextStringBuilder.m20269a(str);
                    }
                    int iM20271d = richTextStringBuilder.m20271d(new C18923k(new C0155B1(onLinkClick, c0937i1, c0471b, 8)));
                    AbstractC2043m.m3177a(richTextStringBuilder, c0937i1.f2691g, z11, new C2031a(c0937i1, 1));
                    richTextStringBuilder.m20270c(iM20271d);
                    String str2 = (String) AbstractC17680n.m19353c0(listM21697e0);
                    if (str2 != null) {
                        richTextStringBuilder.m20269a(str2);
                    }
                } else if (contentReference instanceof C1113k0) {
                    C1113k0 c1113k0 = (C1113k0) contentReference;
                    String strM3160b = c1991h.m3160b(R.string.link_list_separator);
                    List listM21697e1 = AbstractC21322p.m21697e0(c1991h.m3161c(R.string.website_source_parenthesis, "❞"), new String[]{"❞"}, 0, 6);
                    String str3 = (String) AbstractC17680n.m19343S(listM21697e1);
                    if (str3 != null) {
                        richTextStringBuilder.m20269a(str3);
                    }
                    List list = c1113k0.f3020c;
                    int i11 = 0;
                    for (Object obj7 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        C0937I1 c0937i2 = (C0937I1) obj7;
                        int i13 = i11 == list.size() - i10 ? i10 : 0;
                        List list2 = list;
                        boolean z12 = z11;
                        C0471b c0471b2 = c0471b;
                        int iM20271d2 = richTextStringBuilder.m20271d(new C18923k(new C0477h(i11, 2, onLinkClick, c0937i2, c0471b, c1113k0)));
                        AbstractC2043m.m3177a(richTextStringBuilder, c0937i2.f2691g, z12, new C2031a(c0937i2, 0));
                        richTextStringBuilder.m20270c(iM20271d2);
                        if (i13 == 0) {
                            AbstractC2043m.m3177a(richTextStringBuilder, c0937i2.f2691g, z12, new C0491v(strM3160b, 12));
                        }
                        z11 = z12;
                        i11 = i12;
                        list = list2;
                        c0471b = c0471b2;
                        i10 = 1;
                    }
                    String str4 = (String) AbstractC17680n.m19353c0(listM21697e1);
                    if (str4 != null) {
                        richTextStringBuilder.m20269a(str4);
                    }
                } else if (contentReference instanceof C0935I) {
                    int iM20271d3 = richTextStringBuilder.m20271d(new C18923k(new C0155B1(onLinkClick, (C0935I) contentReference, c0471b, 1)));
                    richTextStringBuilder.m20269a("[");
                    richTextStringBuilder.m20269a("❞");
                    richTextStringBuilder.m20269a("]");
                    richTextStringBuilder.m20270c(iM20271d3);
                } else if (contentReference instanceof C1204z1) {
                    C1204z1 c1204z1 = (C1204z1) contentReference;
                    C17314q c17314q = AbstractC0465L.f1507a;
                    String str5 = c1204z1.f3169c;
                    if (!AbstractC21322p.m21681O(str5)) {
                        int iM20271d4 = richTextStringBuilder.m20271d((C0464K) AbstractC0465L.f1507a.getValue());
                        richTextStringBuilder.m20269a(str5);
                        richTextStringBuilder.m20270c(iM20271d4);
                        richTextStringBuilder.m20269a(Separators.RETURN);
                    }
                    String str6 = c1204z1.f3170d;
                    if (str6 != null && !AbstractC21322p.m21681O(str6)) {
                        int iM20271d5 = richTextStringBuilder.m20271d((C0464K) AbstractC0465L.f1507a.getValue());
                        richTextStringBuilder.m20269a(str6);
                        richTextStringBuilder.m20270c(iM20271d5);
                        richTextStringBuilder.m20269a(Separators.RETURN);
                    }
                } else if (contentReference instanceof C1186w1) {
                    C1186w1 c1186w1 = (C1186w1) contentReference;
                    String str7 = c1186w1.f3138d;
                    try {
                        C5525F.Companion.getClass();
                        objM9806b = C5524E.m5925b(str7);
                    } catch (Throwable th2) {
                        objM9806b = AbstractC9233X.m9806b(th2);
                    }
                    if (objM9806b instanceof C17311n) {
                        objM9806b = null;
                    }
                    C5525F c5525f = (C5525F) objM9806b;
                    if (c5525f == null) {
                        obj6 = null;
                        AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("TimeContent", null), AbstractC9306j0.m9889h("Unable to parse time zone: ", str7), null, null, 6);
                        richTextStringBuilder.m20269a("");
                    } else {
                        obj6 = null;
                        String strM10989e = AbstractC10620k.m10989e(AbstractC8519M3.m9187a(c1186w1.f3137c, c5525f));
                        int iM20271d6 = richTextStringBuilder.m20271d(C18920h.f60375d);
                        richTextStringBuilder.m20269a(strM10989e);
                        richTextStringBuilder.m20270c(iM20271d6);
                    }
                } else {
                    obj6 = null;
                    if (contentReference instanceof C0911E) {
                        C0911E c0911e = (C0911E) contentReference;
                        C0472c c0472c = AbstractC0473d.f1537a;
                        String str8 = c0911e.f2647d;
                        if (!AbstractC21322p.m21681O(str8)) {
                            int iM20271d7 = richTextStringBuilder.m20271d(AbstractC0473d.f1537a);
                            richTextStringBuilder.m20269a(str8);
                            richTextStringBuilder.m20270c(iM20271d7);
                        }
                        String str9 = c0911e.f2646c;
                        if (!AbstractC21322p.m21681O(str9)) {
                            richTextStringBuilder.m20269a(Separators.RETURN);
                            richTextStringBuilder.m20269a(str9);
                        }
                        richTextStringBuilder.m20269a(Separators.RETURN);
                    } else {
                        if (!(contentReference instanceof C1119l0)) {
                            throw new C0644w();
                        }
                        AbstractC8050b0.m8444e(richTextStringBuilder, C0481l.f1561o0, 1, new C8410b(new C0485p((C1119l0) contentReference, 0), true, -1899608184));
                    }
                }
                obj6 = null;
            } else {
                obj6 = null;
            }
        } else {
            obj6 = null;
            if ((abstractC9961r4 instanceof C18058n) || !this.f68218r0 || this.f68219s0.m10001a(((C18058n) abstractC9961r4).f57612b)) {
                if (z6) {
                    abstractC12935u = ((C18050f) abstractC9961r4).f57599a;
                    if (abstractC12935u instanceof C8262d) {
                        AbstractC16544l.m18092e(abstractC12935u, "null cannot be cast to non-null type com.openai.feature.conversations.domain.message.latex.InlineLatexNode");
                        C8262d c8262d3 = (C8262d) abstractC12935u;
                        String text3 = c8262d3.f25761g;
                        AbstractC16544l.m18094g(text3, "text");
                        AbstractC8050b0.m8444e(richTextStringBuilder, new C0491v(text3, 0), 4, new C8410b(new C0485p(c8262d3, 14), true, -877041147));
                    }
                }
                return (Integer) defaultContent.invoke();
            }
            AbstractC8050b0.m8444e(richTextStringBuilder, C21534i.f68210Y, 1, new C8410b(new C0364y(this.f68220t0, 16, abstractC9961r4), true, -1971867580));
        }
        return obj6;
    }
}
