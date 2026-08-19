package p503Ud;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.AbstractC1142p;
import p523V9.AbstractC7877E4;
import p548Wd.C8818b;
import p690cp.AbstractC12935u;
import p690cp.C12938x;
import p690cp.C12939y;

/* JADX INFO: renamed from: Ud.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7628a extends AbstractC7877E4 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24120Y;

    public /* synthetic */ C7628a(int i10) {
        this.f24120Y = i10;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: A */
    public void mo5146A(C12939y softLineBreak) {
        switch (this.f24120Y) {
            case 0:
                AbstractC16544l.m18094g(softLineBreak, "softLineBreak");
                mo8159r(softLineBreak);
                if (softLineBreak.f41093b == null) {
                    softLineBreak.m14598k();
                }
                break;
            default:
                super.mo5146A(softLineBreak);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: M */
    public final void mo5149M(C12938x paragraph) {
        switch (this.f24120Y) {
            case 0:
                AbstractC16544l.m18094g(paragraph, "paragraph");
                mo8159r(paragraph);
                if (paragraph.f41093b == null) {
                    paragraph.m14598k();
                }
                break;
            default:
                AbstractC16544l.m18094g(paragraph, "paragraph");
                ArrayList arrayList = new ArrayList();
                AbstractC12935u abstractC12935u = paragraph.f41093b;
                while (abstractC12935u != null) {
                    AbstractC12935u abstractC12935u2 = abstractC12935u.f41096e;
                    if ((abstractC12935u instanceof C8818b) && (((C8818b) abstractC12935u).f27002g instanceof AbstractC1142p)) {
                        if (!arrayList.isEmpty()) {
                            C12938x c12938x = new C12938x();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                c12938x.m14593c((AbstractC12935u) it.next());
                            }
                            paragraph.m14596g(c12938x);
                            arrayList.clear();
                        }
                        paragraph.m14596g(abstractC12935u);
                    } else {
                        arrayList.add(abstractC12935u);
                    }
                    abstractC12935u = abstractC12935u2;
                }
                if (!arrayList.isEmpty()) {
                    C12938x c12938x2 = new C12938x();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c12938x2.m14593c((AbstractC12935u) it2.next());
                    }
                    paragraph.m14596g(c12938x2);
                    arrayList.clear();
                }
                paragraph.m14598k();
                break;
        }
    }
}
