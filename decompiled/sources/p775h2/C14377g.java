package p775h2;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: renamed from: h2.g */
/* JADX INFO: loaded from: classes.dex */
public class C14377g implements InterfaceC14375e {

    /* JADX INFO: renamed from: d */
    public final AbstractC14386p f45082d;

    /* JADX INFO: renamed from: f */
    public int f45084f;

    /* JADX INFO: renamed from: g */
    public int f45085g;

    /* JADX INFO: renamed from: a */
    public AbstractC14386p f45079a = null;

    /* JADX INFO: renamed from: b */
    public boolean f45080b = false;

    /* JADX INFO: renamed from: c */
    public boolean f45081c = false;

    /* JADX INFO: renamed from: e */
    public int f45083e = 1;

    /* JADX INFO: renamed from: h */
    public int f45086h = 1;

    /* JADX INFO: renamed from: i */
    public C14378h f45087i = null;

    /* JADX INFO: renamed from: j */
    public boolean f45088j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f45089k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f45090l = new ArrayList();

    public C14377g(AbstractC14386p abstractC14386p) {
        this.f45082d = abstractC14386p;
    }

    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        ArrayList<C14377g> arrayList = this.f45090l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C14377g) it.next()).f45088j) {
                return;
            }
        }
        this.f45081c = true;
        AbstractC14386p abstractC14386p = this.f45079a;
        if (abstractC14386p != null) {
            abstractC14386p.mo15814a(this);
        }
        if (this.f45080b) {
            this.f45082d.mo15814a(this);
            return;
        }
        C14377g c14377g = null;
        int i10 = 0;
        for (C14377g c14377g2 : arrayList) {
            if (!(c14377g2 instanceof C14378h)) {
                i10++;
                c14377g = c14377g2;
            }
        }
        if (c14377g != null && i10 == 1 && c14377g.f45088j) {
            C14378h c14378h = this.f45087i;
            if (c14378h != null) {
                if (!c14378h.f45088j) {
                    return;
                } else {
                    this.f45084f = this.f45086h * c14378h.f45085g;
                }
            }
            mo15863d(c14377g.f45085g + this.f45084f);
        }
        AbstractC14386p abstractC14386p2 = this.f45079a;
        if (abstractC14386p2 != null) {
            abstractC14386p2.mo15814a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15861b(AbstractC14386p abstractC14386p) {
        this.f45089k.add(abstractC14386p);
        if (this.f45088j) {
            abstractC14386p.mo15814a(abstractC14386p);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15862c() {
        this.f45090l.clear();
        this.f45089k.clear();
        this.f45088j = false;
        this.f45085g = 0;
        this.f45081c = false;
        this.f45080b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo15863d(int i10) {
        if (this.f45088j) {
            return;
        }
        this.f45088j = true;
        this.f45085g = i10;
        for (InterfaceC14375e interfaceC14375e : this.f45089k) {
            interfaceC14375e.mo15814a(interfaceC14375e);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45082d.f45105b.f43672i0);
        sb2.append(":");
        switch (this.f45083e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = SfpOlmlMATQ.HkfIUhiZirl;
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(Separators.LPAREN);
        sb2.append(this.f45088j ? Integer.valueOf(this.f45085g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f45090l.size());
        sb2.append(":d=");
        sb2.append(this.f45089k.size());
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
