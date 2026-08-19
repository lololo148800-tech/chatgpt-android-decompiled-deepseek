package p243Jf;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.AbstractC0985Q1;
import p040Bd.C1197y0;
import p040Bd.C1203z0;
import p1113xn.AbstractC21322p;
import p204I1.C3573D;
import p204I1.C3586b;
import p204I1.C3587c;
import p204I1.C3590f;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5609y;
import p479Td.C7320F;
import p503Ud.C7628a;
import p503Ud.C7629b;
import p523V9.AbstractC7877E4;
import p548Wd.C8818b;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9393x3;
import p690cp.AbstractC12919e;
import p690cp.AbstractC12920f;
import p690cp.AbstractC12935u;
import p690cp.C12911B;
import p690cp.C12912C;
import p690cp.C12913D;
import p690cp.C12916b;
import p690cp.C12917c;
import p690cp.C12918d;
import p690cp.C12922h;
import p690cp.C12923i;
import p690cp.C12924j;
import p690cp.C12925k;
import p690cp.C12926l;
import p690cp.C12927m;
import p690cp.C12928n;
import p690cp.C12929o;
import p690cp.C12930p;
import p690cp.C12931q;
import p690cp.C12932r;
import p690cp.C12934t;
import p690cp.C12937w;
import p690cp.C12938x;
import p690cp.C12939y;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: Jf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4331a extends AbstractC7877E4 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14112Y;

    /* JADX INFO: renamed from: Z */
    public final Object f14113Z;

    public /* synthetic */ C4331a(Object obj, int i10) {
        this.f14112Y = i10;
        this.f14113Z = obj;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: A */
    public void mo5146A(C12939y softLineBreak) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(softLineBreak, "softLineBreak");
                ((C3587c) this.f14113Z).m4291c(Separators.f31991SP);
                break;
            case 1:
            case 3:
            default:
                super.mo5146A(softLineBreak);
                break;
            case 2:
                AbstractC16544l.m18094g(softLineBreak, "softLineBreak");
                mo8159r(softLineBreak);
                if (softLineBreak.f41095d instanceof C8818b) {
                    softLineBreak.m14598k();
                }
                break;
            case 4:
                ((StringBuilder) this.f14113Z).append('\n');
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: D */
    public void mo3707D(C12911B strongEmphasis) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(strongEmphasis, "strongEmphasis");
                C3573D c3573d = new C3573D(0L, 0L, C5609y.f18158u0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    mo8159r(strongEmphasis);
                    return;
                } finally {
                    c3587c.m4293e(iM4296h);
                }
            default:
                super.mo3707D(strongEmphasis);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: E */
    public void mo5147E(C12934t listItem) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(listItem, "listItem");
                mo8159r(listItem);
                break;
            default:
                super.mo5147E(listItem);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: J */
    public void mo5148J(C12931q link) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(link, "link");
                C3587c c3587c = (C3587c) this.f14113Z;
                int length = c3587c.f10925Y.length();
                int length2 = c3587c.f10925Y.length();
                String str = link.f41086g;
                if (str == null) {
                    str = "";
                }
                c3587c.f10928p0.add(new C3586b(str, length, length2, "URL"));
                int iM4296h = c3587c.m4296h(new C3573D(AbstractC14334L.m15626d(4280191205L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    mo8159r(link);
                    return;
                } finally {
                    c3587c.m4293e(iM4296h);
                }
            case 1:
                AbstractC16544l.m18094g(link, "node");
                String str2 = link.f41086g;
                AbstractC16544l.m18093f(str2, "getDestination(...)");
                ((LinkedHashSet) this.f14113Z).add(str2);
                mo8159r(link);
                return;
            default:
                super.mo5148J(link);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: M */
    public void mo5149M(C12938x paragraph) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(paragraph, "paragraph");
                mo8159r(paragraph);
                ((C3587c) this.f14113Z).m4291c("\n\n");
                break;
            default:
                super.mo5149M(paragraph);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: O */
    public void mo5150O(AbstractC12920f customNode) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(customNode, "customNode");
                if (customNode instanceof C8818b) {
                    String strMo1963a = ((C8818b) customNode).f27002g.mo1963a();
                    if (strMo1963a == null) {
                        strMo1963a = "";
                    }
                    ((C3587c) this.f14113Z).m4291c(strMo1963a);
                }
                break;
            case 3:
                AbstractC16544l.m18094g(customNode, "customNode");
                mo8159r(customNode);
                C7629b c7629b = (C7629b) this.f14113Z;
                if (c7629b.f24122h == null && (customNode instanceof C8818b)) {
                    AbstractC0985Q1 abstractC0985Q1 = ((C8818b) customNode).f27002g;
                    if (abstractC0985Q1 instanceof C1203z0) {
                        c7629b.f24122h = (C1203z0) abstractC0985Q1;
                        customNode.m14598k();
                    }
                    break;
                }
                break;
            default:
                super.mo5150O(customNode);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: P */
    public void mo5151P(C12925k hardLineBreak) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(hardLineBreak, "hardLineBreak");
                ((C3587c) this.f14113Z).m4291c(Separators.RETURN);
                break;
            case 4:
                ((StringBuilder) this.f14113Z).append('\n');
                break;
            default:
                super.mo5151P(hardLineBreak);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: Q */
    public void mo5152Q(C12918d code) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(code, "code");
                C3573D c3573d = new C3573D(0L, 0L, null, null, null, AbstractC5599o.f18133o0, null, 0L, null, null, null, C14365u.f45054d, null, null, 63455);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    String str = code.f41070g;
                    if (str == null) {
                        str = "";
                    }
                    c3587c.m4291c(str);
                    return;
                } finally {
                    c3587c.m4293e(iM4296h);
                }
            default:
                super.mo5152Q(code);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: R */
    public void mo5153R(C12926l heading) {
        C3573D c3573d;
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(heading, "heading");
                int i10 = heading.f41080g;
                if (i10 == 1) {
                    c3573d = new C3573D(0L, AbstractC9119D4.m9650c(24), C5609y.f18158u0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529);
                } else if (i10 == 2) {
                    c3573d = new C3573D(0L, AbstractC9119D4.m9650c(20), C5609y.f18158u0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529);
                } else if (i10 == 3) {
                    c3573d = new C3573D(0L, AbstractC9119D4.m9650c(18), C5609y.f18157t0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529);
                } else if (i10 != 4) {
                    c3573d = i10 != 5 ? new C3573D(0L, AbstractC9119D4.m9650c(12), C5609y.f18155r0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529) : new C3573D(0L, AbstractC9119D4.m9650c(14), C5609y.f18156s0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529);
                } else {
                    c3573d = new C3573D(0L, AbstractC9119D4.m9650c(16), C5609y.f18156s0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65529);
                }
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    mo8159r(heading);
                    c3587c.m4293e(iM4296h);
                    c3587c.m4291c("\n\n");
                    return;
                } catch (Throwable th2) {
                    c3587c.m4293e(iM4296h);
                    throw th2;
                }
            default:
                super.mo5153R(heading);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: c */
    public void mo5154c(C12913D thematicBreak) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(thematicBreak, "thematicBreak");
                ((C3587c) this.f14113Z).m4291c("\n---\n\n");
                break;
            default:
                super.mo5154c(thematicBreak);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: e */
    public void mo5155e(C12916b blockQuote) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(blockQuote, "blockQuote");
                C3573D c3573d = new C3573D(C14365u.f45053c, 0L, null, new C5605u(1), null, null, null, 0L, null, null, null, 0L, null, null, 65526);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    c3587c.m4291c("> ");
                    mo8159r(blockQuote);
                    c3587c.m4293e(iM4296h);
                    c3587c.m4291c("\n\n");
                    return;
                } catch (Throwable th2) {
                    c3587c.m4293e(iM4296h);
                    throw th2;
                }
            default:
                super.mo5155e(blockQuote);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: f */
    public void mo3708f(C12912C text) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(text, "text");
                String str = text.f41068g;
                if (str == null) {
                    str = "";
                }
                ((C3587c) this.f14113Z).m4291c(str);
                break;
            case 4:
                ((StringBuilder) this.f14113Z).append(text.f41068g);
                break;
            default:
                super.mo3708f(text);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: g */
    public void mo5156g(C12922h document) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(document, "document");
                mo8159r(document);
                break;
            default:
                super.mo5156g(document);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: i */
    public void mo5157i(C12932r linkReferenceDefinition) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(linkReferenceDefinition, "linkReferenceDefinition");
                break;
            default:
                super.mo5157i(linkReferenceDefinition);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: k */
    public void mo5158k(C12937w orderedList) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(orderedList, "orderedList");
                Integer numValueOf = orderedList.f41102i;
                AbstractC12935u abstractC12935u = orderedList.f41093b;
                while (true) {
                    boolean z6 = abstractC12935u instanceof C12934t;
                    C3587c c3587c = (C3587c) this.f14113Z;
                    if (!z6) {
                        c3587c.m4291c(Separators.RETURN);
                    } else {
                        c3587c.m4291c(numValueOf + ". ");
                        mo8159r(abstractC12935u);
                        c3587c.m4291c(Separators.RETURN);
                        numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
                        abstractC12935u = ((C12934t) abstractC12935u).f41096e;
                    }
                    break;
                }
                break;
            default:
                super.mo5158k(orderedList);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: l */
    public void mo5159l(C12929o image) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(image, "image");
                String str = image.f41084h;
                if (str == null) {
                    str = "";
                }
                ((C3587c) this.f14113Z).m4291c(str);
                break;
            case 3:
                AbstractC16544l.m18094g(image, "image");
                C7629b c7629b = (C7629b) this.f14113Z;
                if (c7629b.f24122h == null) {
                    String str2 = image.f41083g;
                    AbstractC16544l.m18093f(str2, "getDestination(...)");
                    AbstractC12935u abstractC12935u = image.f41093b;
                    if (!(abstractC12935u instanceof C12912C)) {
                        abstractC12935u = null;
                    }
                    C12912C c12912c = (C12912C) abstractC12935u;
                    String str3 = c12912c != null ? c12912c.f41068g : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c7629b.f24122h = new C1203z0(AbstractC9393x3.m9974d(new C1197y0(str2, str2, str3, str2)));
                }
                image.m14598k();
                break;
            default:
                super.mo5159l(image);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: m */
    public void mo5160m(C12923i emphasis) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(emphasis, "emphasis");
                C3573D c3573d = new C3573D(0L, 0L, null, new C5605u(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    mo8159r(emphasis);
                    return;
                } finally {
                    c3587c.m4293e(iM4296h);
                }
            default:
                super.mo5160m(emphasis);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: n */
    public void mo5161n(C12930p indentedCodeBlock) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(indentedCodeBlock, "indentedCodeBlock");
                C3573D c3573d = new C3573D(0L, 0L, null, null, null, AbstractC5599o.f18133o0, null, 0L, null, null, null, C14365u.f45054d, null, null, 63455);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    String str = indentedCodeBlock.f41085g;
                    if (str == null) {
                        str = "";
                    }
                    c3587c.m4291c(AbstractC21322p.m21711s0(str).toString());
                    c3587c.m4293e(iM4296h);
                    c3587c.m4291c("\n\n");
                    return;
                } catch (Throwable th2) {
                    c3587c.m4293e(iM4296h);
                    throw th2;
                }
            default:
                super.mo5161n(indentedCodeBlock);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: p */
    public void mo5162p(C12927m htmlBlock) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(htmlBlock, "htmlBlock");
                String str = htmlBlock.f41081g;
                if (str == null) {
                    str = "";
                }
                ((C3587c) this.f14113Z).m4291c(str);
                break;
            default:
                super.mo5162p(htmlBlock);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: v */
    public void mo5163v(C12928n htmlInline) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(htmlInline, "htmlInline");
                String str = htmlInline.f41082g;
                if (str == null) {
                    str = "";
                }
                ((C3587c) this.f14113Z).m4291c(str);
                break;
            default:
                super.mo5163v(htmlInline);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: w */
    public void mo5164w(C12917c bulletList) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(bulletList, "bulletList");
                mo8159r(bulletList);
                ((C3587c) this.f14113Z).m4291c(Separators.RETURN);
                break;
            default:
                super.mo5164w(bulletList);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: x */
    public void mo5165x(C12924j fencedCodeBlock) {
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(fencedCodeBlock, "fencedCodeBlock");
                C3573D c3573d = new C3573D(0L, 0L, null, null, null, AbstractC5599o.f18133o0, null, 0L, null, null, null, C14365u.f45054d, null, null, 63455);
                C3587c c3587c = (C3587c) this.f14113Z;
                int iM4296h = c3587c.m4296h(c3573d);
                try {
                    String str = fencedCodeBlock.f41079l;
                    if (str == null) {
                        str = "";
                    }
                    c3587c.m4291c(AbstractC21322p.m21711s0(str).toString());
                    c3587c.m4293e(iM4296h);
                    c3587c.m4291c("\n\n");
                    return;
                } catch (Throwable th2) {
                    c3587c.m4293e(iM4296h);
                    throw th2;
                }
            default:
                super.mo5165x(fencedCodeBlock);
                return;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: y */
    public void mo5166y(AbstractC12919e customBlock) {
        C3590f c3590fM4297i;
        switch (this.f14112Y) {
            case 0:
                AbstractC16544l.m18094g(customBlock, "customBlock");
                if (customBlock instanceof C7629b) {
                    C7629b c7629b = (C7629b) customBlock;
                    C7320F c7320f = c7629b.f24123i;
                    if (c7320f != null) {
                        AbstractC12935u abstractC12935uM7778d = c7320f.m7778d();
                        C4331a c4331a = new C4331a(0);
                        abstractC12935uM7778d.mo14588a(c4331a);
                        c3590fM4297i = ((C3587c) c4331a.f14113Z).m4297i();
                    } else {
                        c3590fM4297i = null;
                    }
                    C3587c c3587c = (C3587c) this.f14113Z;
                    c3587c.getClass();
                    if (c3590fM4297i instanceof C3590f) {
                        c3587c.m4290b(c3590fM4297i);
                    } else {
                        c3587c.f10925Y.append((CharSequence) c3590fM4297i);
                    }
                    c3587c.m4291c(c7629b.f24121g);
                }
                break;
            case 1:
            default:
                super.mo5166y(customBlock);
                break;
            case 2:
                AbstractC16544l.m18094g(customBlock, "node");
                mo8159r(customBlock);
                if (customBlock instanceof C7629b) {
                    C7629b c7629b2 = (C7629b) customBlock;
                    List references = ((C7320F) this.f14113Z).f23221e;
                    AbstractC16544l.m18094g(references, "references");
                    C7320F c7320f2 = new C7320F(2, c7629b2.f24121g, references, false, true);
                    c7629b2.f24123i = c7320f2;
                    c7320f2.m7778d().mo14588a(new C4331a(c7629b2, 3));
                    C7320F c7320f3 = c7629b2.f24123i;
                    if (c7320f3 != null) {
                        c7320f3.m7778d().mo14588a(new C7628a(0));
                    }
                }
                break;
        }
    }

    public C4331a(int i10) {
        this.f14112Y = i10;
        switch (i10) {
            case 4:
                this.f14113Z = new StringBuilder();
                break;
            default:
                this.f14113Z = new C3587c();
                break;
        }
    }
}
