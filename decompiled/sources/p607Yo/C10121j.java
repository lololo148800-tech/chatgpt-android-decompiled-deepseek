package p607Yo;

import java.util.ArrayList;
import p228J.C3847l0;
import p544W9.AbstractC8495I3;
import p690cp.AbstractC12915a;
import p690cp.C12926l;
import p690cp.C12930p;
import p712dp.C13191g;
import p756fp.AbstractC13719a;

/* JADX INFO: renamed from: Yo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10121j extends AbstractC13719a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29994a;

    /* JADX INFO: renamed from: b */
    public final AbstractC12915a f29995b;

    /* JADX INFO: renamed from: c */
    public final Object f29996c;

    public C10121j() {
        this.f29994a = 1;
        this.f29995b = new C12930p();
        this.f29996c = new ArrayList();
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: a */
    public void mo7964a(C13191g c13191g) {
        switch (this.f29994a) {
            case 1:
                ((ArrayList) this.f29996c).add(c13191g.f41860a);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:1: B:12:0x002f->B:14:0x0033, LOOP_END] */
    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: e */
    public void mo7965e() {
        int i10;
        StringBuilder sb2;
        CharSequence charSequence;
        switch (this.f29994a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f29996c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        charSequence = (CharSequence) arrayList.get(size);
                    }
                    sb2 = new StringBuilder();
                    for (i10 = 0; i10 < size + 1; i10++) {
                        sb2.append((CharSequence) arrayList.get(i10));
                        sb2.append('\n');
                    }
                    ((C12930p) this.f29995b).f41085g = sb2.toString();
                    break;
                } while (AbstractC8495I3.m9157e(0, charSequence.length(), charSequence) == charSequence.length());
                sb2 = new StringBuilder();
                while (i10 < size + 1) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((C12930p) this.f29995b).f41085g = sb2.toString();
                break;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: f */
    public final AbstractC12915a mo7966f() {
        switch (this.f29994a) {
            case 0:
                return (C12926l) this.f29995b;
            default:
                return (C12930p) this.f29995b;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: i */
    public void mo10035i(C10124m c10124m) {
        switch (this.f29994a) {
            case 0:
                c10124m.m10718e((C3847l0) this.f29996c, (C12926l) this.f29995b);
                break;
        }
    }

    @Override // p756fp.AbstractC13719a
    /* JADX INFO: renamed from: j */
    public final C10112a mo7967j(C10119h c10119h) {
        switch (this.f29994a) {
            case 0:
                return null;
            default:
                if (c10119h.f29976h >= 4) {
                    return new C10112a(-1, c10119h.f29972d + 4, false);
                }
                if (c10119h.f29977i) {
                    return C10112a.m10688a(c10119h.f29974f);
                }
                return null;
        }
    }

    public C10121j(int i10, C3847l0 c3847l0) {
        this.f29994a = 0;
        C12926l c12926l = new C12926l();
        this.f29995b = c12926l;
        c12926l.f41080g = i10;
        this.f29996c = c3847l0;
    }
}
