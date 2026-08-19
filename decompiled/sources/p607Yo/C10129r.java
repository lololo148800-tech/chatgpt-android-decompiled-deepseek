package p607Yo;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0010F;
import p030B2.C0781s;
import p228J.C3847l0;
import p523V9.AbstractC8031Y3;
import p667bp.AbstractC11538a;
import p690cp.AbstractC12915a;
import p690cp.C12921g;
import p690cp.C12932r;
import p690cp.C12938x;
import p690cp.C12940z;
import p712dp.C13191g;
import p734ep.C13458b;
import p756fp.AbstractC13719a;
import p817j$.util.DesugarCollections;
import p817j$.util.Map;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Yo.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C10129r extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final C12938x f30031a = new C12938x();

    /* JADX INFO: renamed from: b */
    public final C10125n f30032b = new C10125n();

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public final void mo7964a(C13191g c13191g) {
        String str;
        C10125n c10125n = this.f30032b;
        ArrayList arrayList = c10125n.f30015b;
        arrayList.add(c13191g);
        if (c10125n.f30014a == 6) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c13191g);
        C13458b c13458b = new C13458b(arrayList2);
        while (c13458b.m14983e()) {
            int iM24h = AbstractC0010F.m24h(c10125n.f30014a);
            if (iM24h == 0) {
                c10125n.m10722a();
                c13458b.m14993o();
                if (!c13458b.m14988j('[')) {
                    c10125n.f30014a = 6;
                    c10125n.m10722a();
                    return;
                } else {
                    c10125n.f30014a = 2;
                    c10125n.f30018e = new StringBuilder();
                    if (!c13458b.m14983e()) {
                        c10125n.f30018e.append('\n');
                    }
                }
            } else {
                if (iM24h == 1) {
                    C0781s c0781sM14991m = c13458b.m14991m();
                    if (AbstractC8031Y3.m8381e(c13458b)) {
                        c10125n.f30018e.append(c13458b.m14982d(c0781sM14991m, c13458b.m14991m()).m4580g());
                        if (!c13458b.m14983e()) {
                            c10125n.f30018e.append('\n');
                        } else if (c13458b.m14988j(']') && c13458b.m14988j(':') && c10125n.f30018e.length() <= 999 && !AbstractC11538a.m12929b(c10125n.f30018e.toString()).isEmpty()) {
                            c10125n.f30014a = 3;
                            c13458b.m14993o();
                        }
                    }
                    c10125n.f30014a = 6;
                    c10125n.m10722a();
                    return;
                }
                if (iM24h == 2) {
                    c13458b.m14993o();
                    C0781s c0781sM14991m2 = c13458b.m14991m();
                    if (AbstractC8031Y3.m8380d(c13458b)) {
                        String strM4580g = c13458b.m14982d(c0781sM14991m2, c13458b.m14991m()).m4580g();
                        if (strM4580g.startsWith(Separators.LESS_THAN)) {
                            strM4580g = strM4580g.substring(1, strM4580g.length() - 1);
                        }
                        c10125n.f30019f = strM4580g;
                        int iM14993o = c13458b.m14993o();
                        if (!c13458b.m14983e()) {
                            c10125n.f30022i = true;
                            arrayList.clear();
                        } else if (iM14993o == 0) {
                        }
                        c10125n.f30014a = 4;
                    }
                    c10125n.f30014a = 6;
                    c10125n.m10722a();
                    return;
                }
                if (iM24h != 3) {
                    if (iM24h == 4) {
                        C0781s c0781sM14991m3 = c13458b.m14991m();
                        if (AbstractC8031Y3.m8382f(c13458b, c10125n.f30020g)) {
                            c10125n.f30021h.append(c13458b.m14982d(c0781sM14991m3, c13458b.m14991m()).m4580g());
                            if (c13458b.m14983e()) {
                                c13458b.m14987i();
                                c13458b.m14993o();
                                if (c13458b.m14983e()) {
                                    c10125n.f30021h = null;
                                } else {
                                    c10125n.f30022i = true;
                                    arrayList.clear();
                                    c10125n.f30014a = 1;
                                }
                            } else {
                                c10125n.f30021h.append('\n');
                            }
                        } else {
                            c10125n.f30021h = null;
                        }
                        c10125n.f30014a = 6;
                        c10125n.m10722a();
                        return;
                    }
                    switch (c10125n.f30014a) {
                        case 1:
                            str = "START_DEFINITION";
                            break;
                        case 2:
                            str = "LABEL";
                            break;
                        case 3:
                            str = "DESTINATION";
                            break;
                        case 4:
                            str = "START_TITLE";
                            break;
                        case 5:
                            str = "TITLE";
                            break;
                        case 6:
                            str = "PARAGRAPH";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalStateException("Unknown parsing state: ".concat(str));
                }
                c13458b.m14993o();
                if (c13458b.m14983e()) {
                    c10125n.f30020g = (char) 0;
                    char cM14990l = c13458b.m14990l();
                    if (cM14990l == '\"' || cM14990l == '\'') {
                        c10125n.f30020g = cM14990l;
                    } else if (cM14990l == '(') {
                        c10125n.f30020g = ')';
                    }
                    if (c10125n.f30020g != 0) {
                        c10125n.f30014a = 5;
                        c10125n.f30021h = new StringBuilder();
                        c13458b.m14987i();
                        if (!c13458b.m14983e()) {
                            c10125n.f30021h.append('\n');
                        }
                    } else {
                        c10125n.f30014a = 1;
                    }
                } else {
                    c10125n.f30014a = 1;
                }
            }
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: b */
    public final void mo10723b(C12940z c12940z) {
        this.f30032b.f30017d.add(c12940z);
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public final void mo7965e() {
        C12938x c12938x;
        C10125n c10125n = this.f30032b;
        c10125n.m10722a();
        Iterator it = c10125n.f30016c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c12938x = this.f30031a;
            if (!zHasNext) {
                break;
            } else {
                c12938x.m14596g((C12932r) it.next());
            }
        }
        ArrayList arrayList = c10125n.f30015b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            c12938x.m14598k();
        } else {
            c12938x.m14597i(c10125n.f30017d);
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        return this.f30031a;
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: g */
    public final List mo10724g() {
        C12921g c12921g = new C12921g();
        C10125n c10125n = this.f30032b;
        c10125n.m10722a();
        for (C12932r c12932r : c10125n.f30016c) {
            Map.EL.putIfAbsent(c12921g.f41072b, AbstractC11538a.m12929b(c12932r.f41088g), c12932r);
        }
        Object[] objArr = {c12921g};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: i */
    public final void mo10035i(C10124m c10124m) {
        ArrayList arrayList = this.f30032b.f30015b;
        C3847l0 c3847l0 = new C3847l0(1);
        ArrayList arrayList2 = c3847l0.f11629a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        c10124m.m10718e(c3847l0, this.f30031a);
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        if (c10119h.f29977i) {
            return null;
        }
        return C10112a.m10688a(c10119h.f29971c);
    }
}
