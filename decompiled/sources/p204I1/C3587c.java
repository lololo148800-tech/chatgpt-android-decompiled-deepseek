package p204I1;

import java.util.ArrayList;
import java.util.List;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: I1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3587c implements Appendable {

    /* JADX INFO: renamed from: Y */
    public final StringBuilder f10925Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f10926Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f10927o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f10928p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f10929q0;

    public /* synthetic */ C3587c() {
        this(16);
    }

    /* JADX INFO: renamed from: a */
    public final void m4289a(C3573D c3573d, int i10, int i11) {
        this.f10926Z.add(new C3586b(c3573d, i10, i11, null, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C3590f) {
            m4290b((C3590f) charSequence);
        } else {
            this.f10925Y.append(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m4290b(C3590f c3590f) {
        StringBuilder sb2 = this.f10925Y;
        int length = sb2.length();
        sb2.append(c3590f.f10934Y);
        List list = c3590f.f10935Z;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3588d c3588d = (C3588d) list.get(i10);
                m4289a((C3573D) c3588d.f10930a, c3588d.f10931b + length, c3588d.f10932c + length);
            }
        }
        List list2 = c3590f.f10936o0;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C3588d c3588d2 = (C3588d) list2.get(i11);
                this.f10927o0.add(new C3586b((C3604t) c3588d2.f10930a, length + c3588d2.f10931b, length + c3588d2.f10932c, null, 8));
            }
        }
        List list3 = c3590f.f10937p0;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                C3588d c3588d3 = (C3588d) list3.get(i12);
                this.f10928p0.add(new C3586b(c3588d3.f10930a, c3588d3.f10931b + length, c3588d3.f10932c + length, c3588d3.f10933d));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4291c(String str) {
        this.f10925Y.append(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m4292d() {
        ArrayList arrayList = this.f10929q0;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Nothing to pop.");
        }
        ((C3586b) arrayList.remove(arrayList.size() - 1)).f10923c = this.f10925Y.length();
    }

    /* JADX INFO: renamed from: e */
    public final void m4293e(int i10) {
        ArrayList arrayList = this.f10929q0;
        if (i10 < arrayList.size()) {
            while (arrayList.size() - 1 >= i10) {
                m4292d();
            }
        } else {
            throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m4294f(String str, String str2) {
        C3586b c3586b = new C3586b(str2, this.f10925Y.length(), 0, str, 4);
        ArrayList arrayList = this.f10929q0;
        arrayList.add(c3586b);
        this.f10928p0.add(c3586b);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: g */
    public final int m4295g(C3604t c3604t) {
        C3586b c3586b = new C3586b(c3604t, this.f10925Y.length(), 0, null, 12);
        ArrayList arrayList = this.f10929q0;
        arrayList.add(c3586b);
        this.f10927o0.add(c3586b);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m4296h(C3573D c3573d) {
        C3586b c3586b = new C3586b(c3573d, this.f10925Y.length(), 0, null, 12);
        ArrayList arrayList = this.f10929q0;
        arrayList.add(c3586b);
        this.f10926Z.add(c3586b);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: i */
    public final C3590f m4297i() {
        StringBuilder sb2 = this.f10925Y;
        String string = sb2.toString();
        ArrayList arrayList = this.f10926Z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C3586b) arrayList.get(i10)).m4288a(sb2.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f10927o0;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList4.add(((C3586b) arrayList3.get(i11)).m4288a(sb2.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f10928p0;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList6.add(((C3586b) arrayList5.get(i12)).m4288a(sb2.length()));
        }
        return new C3590f(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    public C3587c(int i10) {
        this.f10925Y = new StringBuilder(i10);
        this.f10926Z = new ArrayList();
        this.f10927o0 = new ArrayList();
        this.f10928p0 = new ArrayList();
        this.f10929q0 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        ?? arrayList;
        ?? arrayList2;
        boolean z6 = charSequence instanceof C3590f;
        StringBuilder sb2 = this.f10925Y;
        if (z6) {
            C3590f c3590f = (C3590f) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) c3590f.f10934Y, i10, i11);
            List listM4303b = AbstractC3591g.m4303b(c3590f, i10, i11);
            if (listM4303b != null) {
                int size = listM4303b.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C3588d c3588d = (C3588d) listM4303b.get(i12);
                    m4289a((C3573D) c3588d.f10930a, c3588d.f10931b + length, c3588d.f10932c + length);
                }
            }
            ?? r6 = 0;
            r6 = 0;
            String str = c3590f.f10934Y;
            if (i10 == i11 || (arrayList = c3590f.f10936o0) == 0) {
                arrayList = 0;
            } else if (i10 != 0 || i11 < str.length()) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = arrayList.get(i13);
                    C3588d c3588d2 = (C3588d) obj;
                    if (AbstractC3591g.m4304c(i10, i11, c3588d2.f10931b, c3588d2.f10932c)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    C3588d c3588d3 = (C3588d) arrayList3.get(i14);
                    arrayList.add(new C3588d(c3588d3.f10930a, AbstractC8301I.m8921l(c3588d3.f10931b, i10, i11) - i10, AbstractC8301I.m8921l(c3588d3.f10932c, i10, i11) - i10));
                }
            }
            if (arrayList != 0) {
                int size4 = arrayList.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    C3588d c3588d4 = (C3588d) arrayList.get(i15);
                    this.f10927o0.add(new C3586b((C3604t) c3588d4.f10930a, length + c3588d4.f10931b, length + c3588d4.f10932c, null, 8));
                }
            }
            if (i10 != i11 && (arrayList2 = c3590f.f10937p0) != 0) {
                if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size5 = arrayList2.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        Object obj2 = arrayList2.get(i16);
                        C3588d c3588d5 = (C3588d) obj2;
                        if (AbstractC3591g.m4304c(i10, i11, c3588d5.f10931b, c3588d5.f10932c)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4.size());
                    int size6 = arrayList4.size();
                    for (int i17 = 0; i17 < size6; i17++) {
                        C3588d c3588d6 = (C3588d) arrayList4.get(i17);
                        arrayList2.add(new C3588d(c3588d6.f10930a, AbstractC8301I.m8921l(c3588d6.f10931b, i10, i11) - i10, AbstractC8301I.m8921l(c3588d6.f10932c, i10, i11) - i10, c3588d6.f10933d));
                    }
                }
                r6 = arrayList2;
            }
            if (r6 != 0) {
                int size7 = r6.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    C3588d c3588d7 = (C3588d) r6.get(i18);
                    this.f10928p0.add(new C3586b(c3588d7.f10930a, c3588d7.f10931b + length, c3588d7.f10932c + length, c3588d7.f10933d));
                }
            }
        } else {
            sb2.append(charSequence, i10, i11);
        }
        return this;
    }

    public C3587c(C3590f c3590f) {
        this();
        m4290b(c3590f);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        this.f10925Y.append(c9);
        return this;
    }
}
