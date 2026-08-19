package p760g2;

import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p026Ao.C0681o;
import p315Me.Myis.CxcULo;
import p655b2.C11219c;
import p655b2.C11221e;
import p658b5.C11242m;
import p775h2.AbstractC14379i;
import p775h2.AbstractC14386p;
import p775h2.C14372b;
import p775h2.C14374d;
import p775h2.C14380j;
import p775h2.C14382l;
import p775h2.C14384n;
import p775h2.C14385o;
import p775h2.InterfaceC14373c;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13808e extends C13807d {

    /* JADX INFO: renamed from: u0 */
    public int f43714u0;

    /* JADX INFO: renamed from: y0 */
    public int f43718y0;

    /* JADX INFO: renamed from: z0 */
    public int f43719z0;

    /* JADX INFO: renamed from: r0 */
    public ArrayList f43711r0 = new ArrayList();

    /* JADX INFO: renamed from: s0 */
    public C11242m f43712s0 = new C11242m(this);

    /* JADX INFO: renamed from: t0 */
    public C0681o f43713t0 = new C0681o(this);

    /* JADX INFO: renamed from: v0 */
    public InterfaceC14373c f43715v0 = null;

    /* JADX INFO: renamed from: w0 */
    public boolean f43716w0 = false;

    /* JADX INFO: renamed from: x0 */
    public C11219c f43717x0 = new C11219c();

    /* JADX INFO: renamed from: A0 */
    public int f43698A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f43699B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public C13805b[] f43700C0 = new C13805b[4];

    /* JADX INFO: renamed from: D0 */
    public C13805b[] f43701D0 = new C13805b[4];

    /* JADX INFO: renamed from: E0 */
    public int f43702E0 = 257;

    /* JADX INFO: renamed from: F0 */
    public boolean f43703F0 = false;

    /* JADX INFO: renamed from: G0 */
    public boolean f43704G0 = false;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f43705H0 = null;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f43706I0 = null;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f43707J0 = null;

    /* JADX INFO: renamed from: K0 */
    public WeakReference f43708K0 = null;

    /* JADX INFO: renamed from: L0 */
    public HashSet f43709L0 = new HashSet();

    /* JADX INFO: renamed from: M0 */
    public C14372b f43710M0 = new C14372b();

    /* JADX INFO: renamed from: Z */
    public static void m15396Z(C13807d c13807d, InterfaceC14373c interfaceC14373c, C14372b c14372b) {
        int i10;
        int i11;
        if (interfaceC14373c == null) {
            return;
        }
        if (c13807d.f43670h0 == 8 || (c13807d instanceof C13811h) || (c13807d instanceof C13804a)) {
            c14372b.f45071e = 0;
            c14372b.f45072f = 0;
            return;
        }
        int[] iArr = c13807d.f43688q0;
        c14372b.f45067a = iArr[0];
        c14372b.f45068b = iArr[1];
        c14372b.f45069c = c13807d.m15387r();
        c14372b.f45070d = c13807d.m15383l();
        c14372b.f45075i = false;
        c14372b.f45076j = 0;
        boolean z6 = c14372b.f45067a == 3;
        boolean z10 = c14372b.f45068b == 3;
        boolean z11 = z6 && c13807d.f43652X > 0.0f;
        boolean z12 = z10 && c13807d.f43652X > 0.0f;
        if (z6 && c13807d.m15390u(0) && c13807d.f43690s == 0 && !z11) {
            c14372b.f45067a = 2;
            if (z10 && c13807d.f43691t == 0) {
                c14372b.f45067a = 1;
            }
            z6 = false;
        }
        if (z10 && c13807d.m15390u(1) && c13807d.f43691t == 0 && !z12) {
            c14372b.f45068b = 2;
            if (z6 && c13807d.f43690s == 0) {
                c14372b.f45068b = 1;
            }
            z10 = false;
        }
        if (c13807d.mo15336B()) {
            c14372b.f45067a = 1;
            z6 = false;
        }
        if (c13807d.mo15337C()) {
            c14372b.f45068b = 1;
            z10 = false;
        }
        int[] iArr2 = c13807d.f43692u;
        if (z11) {
            if (iArr2[0] == 4) {
                c14372b.f45067a = 1;
            } else if (!z10) {
                if (c14372b.f45068b == 1) {
                    i11 = c14372b.f45070d;
                } else {
                    c14372b.f45067a = 2;
                    interfaceC14373c.mo10946b(c13807d, c14372b);
                    i11 = c14372b.f45072f;
                }
                c14372b.f45067a = 1;
                c14372b.f45069c = (int) (c13807d.f43652X * i11);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                c14372b.f45068b = 1;
            } else if (!z6) {
                if (c14372b.f45067a == 1) {
                    i10 = c14372b.f45069c;
                } else {
                    c14372b.f45068b = 2;
                    interfaceC14373c.mo10946b(c13807d, c14372b);
                    i10 = c14372b.f45071e;
                }
                c14372b.f45068b = 1;
                if (c13807d.f43653Y == -1) {
                    c14372b.f45070d = (int) (i10 / c13807d.f43652X);
                } else {
                    c14372b.f45070d = (int) (c13807d.f43652X * i10);
                }
            }
        }
        interfaceC14373c.mo10946b(c13807d, c14372b);
        c13807d.m15371R(c14372b.f45071e);
        c13807d.m15366M(c14372b.f45072f);
        c13807d.f43634F = c14372b.f45074h;
        c13807d.m15363J(c14372b.f45073g);
        c14372b.f45076j = 0;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: D */
    public final void mo15359D() {
        this.f43717x0.m12475t();
        this.f43718y0 = 0;
        this.f43719z0 = 0;
        this.f43711r0.clear();
        super.mo15359D();
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: G */
    public final void mo15362G(C11242m c11242m) {
        super.mo15362G(c11242m);
        int size = this.f43711r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C13807d) this.f43711r0.get(i10)).mo15362G(c11242m);
        }
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: S */
    public final void mo15372S(boolean z6, boolean z10) {
        super.mo15372S(z6, z10);
        int size = this.f43711r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C13807d) this.f43711r0.get(i10)).mo15372S(z6, z10);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m15397U(C13807d c13807d, int i10) {
        if (i10 == 0) {
            int i11 = this.f43698A0 + 1;
            C13805b[] c13805bArr = this.f43701D0;
            if (i11 >= c13805bArr.length) {
                this.f43701D0 = (C13805b[]) Arrays.copyOf(c13805bArr, c13805bArr.length * 2);
            }
            C13805b[] c13805bArr2 = this.f43701D0;
            int i12 = this.f43698A0;
            c13805bArr2[i12] = new C13805b(c13807d, 0, this.f43716w0);
            this.f43698A0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f43699B0 + 1;
            C13805b[] c13805bArr3 = this.f43700C0;
            if (i13 >= c13805bArr3.length) {
                this.f43700C0 = (C13805b[]) Arrays.copyOf(c13805bArr3, c13805bArr3.length * 2);
            }
            C13805b[] c13805bArr4 = this.f43700C0;
            int i14 = this.f43699B0;
            c13805bArr4[i14] = new C13805b(c13807d, 1, this.f43716w0);
            this.f43699B0 = i14 + 1;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m15398V(C11219c c11219c) {
        boolean zM15402a0 = m15402a0(64);
        mo15340c(c11219c, zM15402a0);
        int size = this.f43711r0.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C13807d c13807d = (C13807d) this.f43711r0.get(i10);
            boolean[] zArr = c13807d.f43648T;
            zArr[0] = false;
            zArr[1] = false;
            if (c13807d instanceof C13804a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i11 = 0; i11 < size; i11++) {
                C13807d c13807d2 = (C13807d) this.f43711r0.get(i11);
                if (c13807d2 instanceof C13804a) {
                    C13804a c13804a = (C13804a) c13807d2;
                    for (int i12 = 0; i12 < c13804a.f43781s0; i12++) {
                        C13807d c13807d3 = c13804a.f43780r0[i12];
                        if (c13804a.f43600u0 || c13807d3.mo15341d()) {
                            int i13 = c13804a.f43599t0;
                            if (i13 == 0 || i13 == 1) {
                                c13807d3.f43648T[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                c13807d3.f43648T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f43709L0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            C13807d c13807d4 = (C13807d) this.f43711r0.get(i14);
            c13807d4.getClass();
            boolean z10 = c13807d4 instanceof C13810g;
            if (z10 || (c13807d4 instanceof C13811h)) {
                if (z10) {
                    hashSet.add(c13807d4);
                } else {
                    c13807d4.mo15340c(c11219c, zM15402a0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C13810g c13810g = (C13810g) ((C13807d) it.next());
                for (int i15 = 0; i15 < c13810g.f43781s0; i15++) {
                    if (hashSet.contains(c13810g.f43780r0[i15])) {
                        c13810g.mo15340c(c11219c, zM15402a0);
                        hashSet.remove(c13810g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C13807d) it2.next()).mo15340c(c11219c, zM15402a0);
                }
                hashSet.clear();
            }
        }
        if (C11219c.f33946p) {
            HashSet<C13807d> hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                C13807d c13807d5 = (C13807d) this.f43711r0.get(i16);
                c13807d5.getClass();
                if (!(c13807d5 instanceof C13810g) && !(c13807d5 instanceof C13811h)) {
                    hashSet2.add(c13807d5);
                }
            }
            m15375b(this, c11219c, hashSet2, this.f43688q0[0] == 2 ? 0 : 1, false);
            for (C13807d c13807d6 : hashSet2) {
                AbstractC13813j.m15418b(this, c11219c, c13807d6);
                c13807d6.mo15340c(c11219c, zM15402a0);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                C13807d c13807d7 = (C13807d) this.f43711r0.get(i17);
                if (c13807d7 instanceof C13808e) {
                    int[] iArr = c13807d7.f43688q0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        c13807d7.m15367N(1);
                    }
                    if (i19 == 2) {
                        c13807d7.m15369P(1);
                    }
                    c13807d7.mo15340c(c11219c, zM15402a0);
                    if (i18 == 2) {
                        c13807d7.m15367N(i18);
                    }
                    if (i19 == 2) {
                        c13807d7.m15369P(i19);
                    }
                } else {
                    AbstractC13813j.m15418b(this, c11219c, c13807d7);
                    if (!(c13807d7 instanceof C13810g) && !(c13807d7 instanceof C13811h)) {
                        c13807d7.mo15340c(c11219c, zM15402a0);
                    }
                }
            }
        }
        if (this.f43698A0 > 0) {
            AbstractC13813j.m15417a(this, c11219c, null, 0);
        }
        if (this.f43699B0 > 0) {
            AbstractC13813j.m15417a(this, c11219c, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX INFO: renamed from: W */
    public final boolean m15399W(int i10, boolean z6) {
        boolean z10;
        C0681o c0681o = this.f43713t0;
        C13808e c13808e = (C13808e) c0681o.f1985d;
        boolean z11 = false;
        int iM15382k = c13808e.m15382k(0);
        int iM15382k2 = c13808e.m15382k(1);
        int iM15388s = c13808e.m15388s();
        int iM15389t = c13808e.m15389t();
        ArrayList<AbstractC14386p> arrayList = (ArrayList) c0681o.f1987f;
        if (z6 && (iM15382k == 2 || iM15382k2 == 2)) {
            for (AbstractC14386p abstractC14386p : arrayList) {
                if (abstractC14386p.f45109f == i10 && !abstractC14386p.mo15819k()) {
                    z6 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z6 && iM15382k == 2) {
                    c13808e.m15367N(1);
                    c13808e.m15371R(c0681o.m1457d(c13808e, 0));
                    c13808e.f43661d.f45108e.mo15863d(c13808e.m15387r());
                }
            } else if (z6 && iM15382k2 == 2) {
                c13808e.m15369P(1);
                c13808e.m15366M(c0681o.m1457d(c13808e, 1));
                c13808e.f43663e.f45108e.mo15863d(c13808e.m15383l());
            }
        }
        int[] iArr = c13808e.f43688q0;
        if (i10 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int iM15387r = c13808e.m15387r() + iM15388s;
                c13808e.f43661d.f45112i.mo15863d(iM15387r);
                c13808e.f43661d.f45108e.mo15863d(iM15387r - iM15388s);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int iM15383l = c13808e.m15383l() + iM15389t;
                c13808e.f43663e.f45112i.mo15863d(iM15383l);
                c13808e.f43663e.f45108e.mo15863d(iM15383l - iM15389t);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        c0681o.m1460g();
        for (AbstractC14386p abstractC14386p2 : arrayList) {
            if (abstractC14386p2.f45109f == i10 && (abstractC14386p2.f45105b != c13808e || abstractC14386p2.f45110g)) {
                abstractC14386p2.mo15816e();
            }
        }
        for (AbstractC14386p abstractC14386p3 : arrayList) {
            if (abstractC14386p3.f45109f == i10 && (z10 || abstractC14386p3.f45105b != c13808e)) {
                if (!abstractC14386p3.f45111h.f45088j || !abstractC14386p3.f45112i.f45088j || (!(abstractC14386p3 instanceof C14374d) && !abstractC14386p3.f45108e.f45088j)) {
                    c13808e.m15367N(iM15382k);
                    c13808e.m15369P(iM15382k2);
                    return z11;
                }
            }
        }
        z11 = true;
        c13808e.m15367N(iM15382k);
        c13808e.m15369P(iM15382k2);
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:349:0x05db  */
    /* JADX WARN: Code duplicated, block: B:352:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:360:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:361:0x0606  */
    /* JADX WARN: Code duplicated, block: B:367:0x061a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0633  */
    /* JADX WARN: Code duplicated, block: B:376:0x0639  */
    /* JADX WARN: Code duplicated, block: B:378:0x0641 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x064f  */
    /* JADX WARN: Code duplicated, block: B:387:0x065f  */
    /* JADX WARN: Code duplicated, block: B:391:0x066a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x067b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0683  */
    /* JADX WARN: Code duplicated, block: B:403:0x068a  */
    /* JADX WARN: Code duplicated, block: B:406:0x0694  */
    /* JADX WARN: Code duplicated, block: B:408:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:412:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c2 A[Catch: Exception -> 0x06d0, LOOP:12: B:414:0x06c0->B:415:0x06c2, LOOP_END, TryCatch #0 {Exception -> 0x06d0, blocks: (B:413:0x06b4, B:415:0x06c2, B:419:0x06d7), top: B:541:0x06b4 }] */
    /* JADX WARN: Code duplicated, block: B:424:0x06e4 A[Catch: Exception -> 0x070f, TRY_LEAVE, TryCatch #2 {Exception -> 0x070f, blocks: (B:422:0x06de, B:424:0x06e4), top: B:545:0x06de }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0713  */
    /* JADX WARN: Code duplicated, block: B:439:0x0719 A[Catch: Exception -> 0x0705, TRY_ENTER, TryCatch #6 {Exception -> 0x0705, blocks: (B:428:0x06fe, B:439:0x0719, B:441:0x071f, B:444:0x073f, B:446:0x0745, B:450:0x075d), top: B:553:0x06fe }] */
    /* JADX WARN: Code duplicated, block: B:444:0x073f A[Catch: Exception -> 0x0705, TRY_ENTER, TryCatch #6 {Exception -> 0x0705, blocks: (B:428:0x06fe, B:439:0x0719, B:441:0x071f, B:444:0x073f, B:446:0x0745, B:450:0x075d), top: B:553:0x06fe }] */
    /* JADX WARN: Code duplicated, block: B:456:0x076c A[Catch: Exception -> 0x0797, TryCatch #4 {Exception -> 0x0797, blocks: (B:437:0x0715, B:442:0x073b, B:454:0x0768, B:456:0x076c, B:458:0x0772), top: B:549:0x0715 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x079b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:480:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:482:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:484:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:486:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:489:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:491:0x0804 A[LOOP:15: B:490:0x0802->B:491:0x0804, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x0824 A[LOOP:14: B:499:0x0822->B:500:0x0824, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x0858  */
    /* JADX WARN: Code duplicated, block: B:507:0x086a  */
    /* JADX WARN: Code duplicated, block: B:512:0x088a  */
    /* JADX WARN: Code duplicated, block: B:513:0x0896  */
    /* JADX WARN: Code duplicated, block: B:516:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:517:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:519:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:521:0x08bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:524:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:527:0x08d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:534:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:538:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:545:0x06de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x06a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:611:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r31v0, types: [g2.d, g2.e] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v75, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v28, types: [int] */
    /* JADX INFO: renamed from: X */
    public final void m15400X() {
        int i10;
        ?? r23;
        C13806c c13806c;
        int i11;
        int i12;
        C13806c c13806c2;
        int i13;
        C11219c c11219c;
        int i14;
        boolean z6;
        boolean z10;
        char c9;
        boolean z11;
        int i15;
        int i16;
        boolean zM15402a0;
        ?? r12;
        int i17;
        boolean z12;
        ?? r21;
        int i18;
        ?? r22;
        ?? r24;
        boolean z13;
        boolean[] zArr;
        int i19;
        boolean z14;
        int iMax;
        ?? r6;
        ?? r18;
        boolean z15;
        int iMax2;
        ?? r10;
        boolean z16;
        boolean z17;
        ?? r11;
        ?? r13;
        boolean z18;
        int i20;
        boolean z19;
        ?? r14;
        ?? r15;
        int i21;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zM15402a1;
        int size;
        int i22;
        boolean z20;
        C13807d c13807d;
        ?? r25;
        boolean z21;
        boolean z22;
        int i23;
        ?? r26;
        WeakReference weakReference;
        C13806c c13806c3;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C13806c c13806c4;
        C13807d c13807d2;
        int i24;
        int i25;
        int i26;
        char c10;
        C14385o c14385o;
        C14385o c14385o2;
        int i27;
        int iM15387r;
        int i28;
        int iM15383l;
        int i29;
        int iM15881b;
        C14385o c14385o3;
        C14385o c14385o4;
        int[] iArr;
        this.f43654Z = 0;
        this.f43656a0 = 0;
        this.f43703F0 = false;
        this.f43704G0 = false;
        int size2 = this.f43711r0.size();
        int iMax7 = Math.max(0, m15387r());
        int iMax8 = Math.max(0, m15383l());
        int[] iArr2 = this.f43688q0;
        int i30 = iArr2[1];
        int i31 = iArr2[0];
        int i32 = this.f43714u0;
        C13806c c13806c5 = this.f43639K;
        C13806c c13806c6 = this.f43638J;
        if (i32 == 0 && AbstractC13813j.m15419c(this.f43702E0, 1)) {
            InterfaceC14373c interfaceC14373c = this.f43715v0;
            int i33 = iArr2[0];
            int i34 = iArr2[1];
            m15361F();
            ArrayList arrayList = this.f43711r0;
            int size3 = arrayList.size();
            for (int i35 = 0; i35 < size3; i35++) {
                ((C13807d) arrayList.get(i35)).m15361F();
            }
            boolean z23 = this.f43716w0;
            if (i33 == 1) {
                m15364K(0, m15387r());
            } else {
                c13806c6.m15353l(0);
                this.f43654Z = 0;
            }
            int i36 = 0;
            boolean z24 = false;
            boolean z25 = false;
            while (i36 < size3) {
                C13806c c13806c7 = c13806c6;
                C13807d c13807d3 = (C13807d) arrayList.get(i36);
                int i37 = iMax8;
                if (c13807d3 instanceof C13811h) {
                    C13811h c13811h = (C13811h) c13807d3;
                    iArr = iArr2;
                    if (c13811h.f43778v0 == 1) {
                        int i38 = c13811h.f43775s0;
                        if (i38 != -1) {
                            c13811h.m15413U(i38);
                        } else if (c13811h.f43776t0 != -1 && mo15336B()) {
                            c13811h.m15413U(m15387r() - c13811h.f43776t0);
                        } else if (mo15336B()) {
                            c13811h.m15413U((int) ((c13811h.f43774r0 * m15387r()) + 0.5f));
                        }
                        z24 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c13807d3 instanceof C13804a) && ((C13804a) c13807d3).m15339Y() == 0) {
                        z25 = true;
                    }
                }
                i36++;
                iMax8 = i37;
                c13806c6 = c13806c7;
                iArr2 = iArr;
            }
            i10 = iMax8;
            r23 = iArr2;
            c13806c = c13806c6;
            if (z24) {
                for (int i39 = 0; i39 < size3; i39++) {
                    C13807d c13807d4 = (C13807d) arrayList.get(i39);
                    if (c13807d4 instanceof C13811h) {
                        C13811h c13811h2 = (C13811h) c13807d4;
                        if (c13811h2.f43778v0 == 1) {
                            AbstractC14379i.m15866c(0, c13811h2, interfaceC14373c, z23);
                        }
                    }
                }
            }
            AbstractC14379i.m15866c(0, this, interfaceC14373c, z23);
            if (z25) {
                for (int i40 = 0; i40 < size3; i40++) {
                    C13807d c13807d5 = (C13807d) arrayList.get(i40);
                    if (c13807d5 instanceof C13804a) {
                        C13804a c13804a = (C13804a) c13807d5;
                        if (c13804a.m15339Y() == 0 && c13804a.m15338X()) {
                            AbstractC14379i.m15866c(1, c13804a, interfaceC14373c, z23);
                        }
                    }
                }
            }
            if (i34 == 1) {
                m15365L(0, m15383l());
            } else {
                c13806c5.m15353l(0);
                this.f43656a0 = 0;
            }
            boolean z26 = false;
            boolean z27 = false;
            for (int i41 = 0; i41 < size3; i41++) {
                C13807d c13807d6 = (C13807d) arrayList.get(i41);
                if (c13807d6 instanceof C13811h) {
                    C13811h c13811h3 = (C13811h) c13807d6;
                    if (c13811h3.f43778v0 == 0) {
                        int i42 = c13811h3.f43775s0;
                        if (i42 != -1) {
                            c13811h3.m15413U(i42);
                        } else if (c13811h3.f43776t0 != -1 && mo15337C()) {
                            c13811h3.m15413U(m15383l() - c13811h3.f43776t0);
                        } else if (mo15337C()) {
                            c13811h3.m15413U((int) ((c13811h3.f43774r0 * m15383l()) + 0.5f));
                        }
                        z26 = true;
                    }
                } else if ((c13807d6 instanceof C13804a) && ((C13804a) c13807d6).m15339Y() == 1) {
                    z27 = true;
                }
            }
            if (z26) {
                for (int i43 = 0; i43 < size3; i43++) {
                    C13807d c13807d7 = (C13807d) arrayList.get(i43);
                    if (c13807d7 instanceof C13811h) {
                        C13811h c13811h4 = (C13811h) c13807d7;
                        if (c13811h4.f43778v0 == 0) {
                            AbstractC14379i.m15872i(1, c13811h4, interfaceC14373c);
                        }
                    }
                }
            }
            AbstractC14379i.m15872i(0, this, interfaceC14373c);
            if (z27) {
                for (int i44 = 0; i44 < size3; i44++) {
                    C13807d c13807d8 = (C13807d) arrayList.get(i44);
                    if (c13807d8 instanceof C13804a) {
                        C13804a c13804a2 = (C13804a) c13807d8;
                        if (c13804a2.m15339Y() == 1 && c13804a2.m15338X()) {
                            AbstractC14379i.m15872i(1, c13804a2, interfaceC14373c);
                        }
                    }
                }
            }
            for (int i45 = 0; i45 < size3; i45++) {
                C13807d c13807d9 = (C13807d) arrayList.get(i45);
                if (c13807d9.m15358A() && AbstractC14379i.m15864a(c13807d9)) {
                    m15396Z(c13807d9, interfaceC14373c, AbstractC14379i.f45092a);
                    if (!(c13807d9 instanceof C13811h)) {
                        AbstractC14379i.m15866c(0, c13807d9, interfaceC14373c, z23);
                        AbstractC14379i.m15872i(0, c13807d9, interfaceC14373c);
                    } else if (((C13811h) c13807d9).f43778v0 == 0) {
                        AbstractC14379i.m15872i(0, c13807d9, interfaceC14373c);
                    } else {
                        AbstractC14379i.m15866c(0, c13807d9, interfaceC14373c, z23);
                    }
                }
            }
            for (int i46 = 0; i46 < size2; i46++) {
                C13807d c13807d10 = (C13807d) this.f43711r0.get(i46);
                if (c13807d10.m15358A() && !(c13807d10 instanceof C13811h) && !(c13807d10 instanceof C13804a) && !(c13807d10 instanceof C13810g) && !c13807d10.f43635G) {
                    int iM15382k = c13807d10.m15382k(0);
                    int iM15382k2 = c13807d10.m15382k(1);
                    if (iM15382k != 3 || c13807d10.f43690s == 1 || iM15382k2 != 3 || c13807d10.f43691t == 1) {
                        m15396Z(c13807d10, this.f43715v0, new C14372b());
                    }
                }
            }
        } else {
            i10 = iMax8;
            r23 = iArr2;
            c13806c = c13806c6;
        }
        C11219c c11219c2 = this.f43717x0;
        if (size2 <= 2 || !((i31 == 2 || i30 == 2) && AbstractC13813j.m15419c(this.f43702E0, 1024))) {
            i11 = size2;
            i12 = i30;
            c13806c2 = c13806c5;
            i13 = iMax7;
            c11219c = c11219c2;
            i14 = i31;
        } else {
            InterfaceC14373c interfaceC14373c2 = this.f43715v0;
            ArrayList arrayList2 = this.f43711r0;
            int size4 = arrayList2.size();
            int i47 = 0;
            while (true) {
                if (i47 < size4) {
                    C13807d c13807d11 = (C13807d) arrayList2.get(i47);
                    ?? r16 = r23[0];
                    ?? r17 = r23[1];
                    int[] iArr3 = c13807d11.f43688q0;
                    c13806c2 = c13806c5;
                    if (AbstractC14379i.m15871h(r16, r17, iArr3[0], iArr3[1]) && !(c13807d11 instanceof C13810g)) {
                        i47++;
                        c13806c5 = c13806c2;
                    } else {
                        i24 = iMax7;
                        i11 = size2;
                        i25 = i30;
                        i26 = i31;
                        c11219c = c11219c2;
                    }
                } else {
                    c13806c2 = c13806c5;
                    int i48 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList<AbstractC13812i> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<AbstractC13812i> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i48 < size4) {
                        int i49 = size2;
                        C13807d c13807d12 = (C13807d) arrayList2.get(i48);
                        int i50 = i30;
                        ?? r19 = r23[0];
                        int i51 = iMax7;
                        ?? r20 = r23[1];
                        int i52 = i31;
                        int[] iArr4 = c13807d12.f43688q0;
                        C11219c c11219c3 = c11219c2;
                        if (!AbstractC14379i.m15871h(r19, r20, iArr4[0], iArr4[1])) {
                            m15396Z(c13807d12, interfaceC14373c2, this.f43710M0);
                        }
                        boolean z28 = c13807d12 instanceof C13811h;
                        if (z28) {
                            C13811h c13811h5 = (C13811h) c13807d12;
                            if (c13811h5.f43778v0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c13811h5);
                            }
                            if (c13811h5.f43778v0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c13811h5);
                            }
                        }
                        if (c13807d12 instanceof AbstractC13812i) {
                            if (c13807d12 instanceof C13804a) {
                                C13804a c13804a3 = (C13804a) c13807d12;
                                if (c13804a3.m15339Y() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(c13804a3);
                                }
                                if (c13804a3.m15339Y() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(c13804a3);
                                }
                            } else {
                                AbstractC13812i abstractC13812i = (AbstractC13812i) c13807d12;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(abstractC13812i);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(abstractC13812i);
                            }
                        }
                        if (c13807d12.f43638J.f43625f == null && c13807d12.f43640L.f43625f == null && !z28 && !(c13807d12 instanceof C13804a)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(c13807d12);
                        }
                        if (c13807d12.f43639K.f43625f == null && c13807d12.f43641M.f43625f == null && c13807d12.f43642N.f43625f == null && !z28 && !(c13807d12 instanceof C13804a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(c13807d12);
                        }
                        i48++;
                        i30 = i50;
                        size2 = i49;
                        iMax7 = i51;
                        i31 = i52;
                        c11219c2 = c11219c3;
                    }
                    i24 = iMax7;
                    C11219c c11219c4 = c11219c2;
                    i11 = size2;
                    i25 = i30;
                    i26 = i31;
                    ArrayList<C14385o> arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            AbstractC14379i.m15865b((C13811h) it.next(), 0, arrayList9, null);
                        }
                    }
                    int i53 = 0;
                    C14385o c14385o5 = null;
                    if (arrayList4 != null) {
                        for (AbstractC13812i abstractC13812i2 : arrayList4) {
                            C14385o c14385oM15865b = AbstractC14379i.m15865b(abstractC13812i2, i53, arrayList9, c14385o5);
                            abstractC13812i2.m15416V(i53, c14385oM15865b, arrayList9);
                            c14385oM15865b.m15880a(arrayList9);
                            i53 = 0;
                            c14385o5 = null;
                        }
                    }
                    HashSet hashSet = mo15381j(2).f43620a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it2.next()).f43623d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = mo15381j(4).f43620a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it3.next()).f43623d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = mo15381j(7).f43620a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it4.next()).f43623d, 0, arrayList9, null);
                        }
                    }
                    C14385o c14385o6 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            AbstractC14379i.m15865b((C13807d) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            AbstractC14379i.m15865b((C13811h) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i54 = 1;
                    if (arrayList6 != null) {
                        for (AbstractC13812i abstractC13812i3 : arrayList6) {
                            C14385o c14385oM15865b2 = AbstractC14379i.m15865b(abstractC13812i3, i54, arrayList9, c14385o6);
                            abstractC13812i3.m15416V(i54, c14385oM15865b2, arrayList9);
                            c14385oM15865b2.m15880a(arrayList9);
                            i54 = 1;
                            c14385o6 = null;
                        }
                    }
                    HashSet hashSet4 = mo15381j(3).f43620a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it7.next()).f43623d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = mo15381j(6).f43620a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it8.next()).f43623d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = mo15381j(5).f43620a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it9.next()).f43623d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = mo15381j(7).f43620a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC14379i.m15865b(((C13806c) it10.next()).f43623d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            AbstractC14379i.m15865b((C13807d) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i55 = 0; i55 < size4; i55++) {
                        C13807d c13807d13 = (C13807d) arrayList2.get(i55);
                        int[] iArr5 = c13807d13.f43688q0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i56 = c13807d13.f43684o0;
                            int size5 = arrayList9.size();
                            int i57 = 0;
                            while (true) {
                                if (i57 >= size5) {
                                    c14385o3 = null;
                                    break;
                                }
                                c14385o3 = (C14385o) arrayList9.get(i57);
                                if (i56 == c14385o3.f45100b) {
                                    break;
                                } else {
                                    i57++;
                                }
                            }
                            int i58 = c13807d13.f43686p0;
                            int size6 = arrayList9.size();
                            int i59 = 0;
                            while (true) {
                                if (i59 >= size6) {
                                    c14385o4 = null;
                                    break;
                                }
                                c14385o4 = (C14385o) arrayList9.get(i59);
                                if (i58 == c14385o4.f45100b) {
                                    break;
                                } else {
                                    i59++;
                                }
                            }
                            if (c14385o3 != null && c14385o4 != null) {
                                c14385o3.m15882c(0, c14385o4);
                                c14385o4.f45101c = 2;
                                arrayList9.remove(c14385o3);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (r23[0] == 2) {
                            int i60 = 0;
                            c14385o = null;
                            for (C14385o c14385o7 : arrayList9) {
                                if (c14385o7.f45101c != 1) {
                                    C11219c c11219c5 = c11219c4;
                                    int iM15881b2 = c14385o7.m15881b(c11219c5, 0);
                                    if (iM15881b2 > i60) {
                                        c14385o = c14385o7;
                                        i60 = iM15881b2;
                                    }
                                    c11219c4 = c11219c5;
                                }
                            }
                            c11219c = c11219c4;
                            c10 = 1;
                            if (c14385o != null) {
                                m15367N(1);
                                m15371R(i60);
                            }
                            if (r23[c10] == 2) {
                                i29 = 0;
                                c14385o2 = null;
                                for (C14385o c14385o8 : arrayList9) {
                                    if (c14385o8.f45101c != 0 && (iM15881b = c14385o8.m15881b(c11219c, 1)) > i29) {
                                        c14385o2 = c14385o8;
                                        i29 = iM15881b;
                                    }
                                }
                                if (c14385o2 != null) {
                                    m15369P(1);
                                    m15366M(i29);
                                } else {
                                    c14385o2 = null;
                                }
                            } else {
                                c14385o2 = null;
                            }
                            if (c14385o == null || c14385o2 != null) {
                                i14 = i26;
                                if (i14 == 2) {
                                    i27 = i24;
                                    if (i27 < m15387r() || i27 <= 0) {
                                        iM15387r = m15387r();
                                    } else {
                                        m15371R(i27);
                                        this.f43703F0 = true;
                                    }
                                    i12 = i25;
                                    if (i12 == 2) {
                                        i28 = i10;
                                        if (i28 < m15383l() || i28 <= 0) {
                                            iM15383l = m15383l();
                                        } else {
                                            m15366M(i28);
                                            this.f43704G0 = true;
                                        }
                                        i10 = iM15383l;
                                        i13 = iM15387r;
                                        z6 = true;
                                    } else {
                                        i28 = i10;
                                    }
                                    iM15383l = i28;
                                    i10 = iM15383l;
                                    i13 = iM15387r;
                                    z6 = true;
                                } else {
                                    i27 = i24;
                                }
                                iM15387r = i27;
                                i12 = i25;
                                if (i12 == 2) {
                                    i28 = i10;
                                    if (i28 < m15383l()) {
                                    }
                                    iM15383l = m15383l();
                                    i10 = iM15383l;
                                    i13 = iM15387r;
                                    z6 = true;
                                } else {
                                    i28 = i10;
                                }
                                iM15383l = i28;
                                i10 = iM15383l;
                                i13 = iM15387r;
                                z6 = true;
                            }
                            if (!m15402a0(64) || m15402a0(128)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c11219c.getClass();
                            c11219c.f33954g = false;
                            if (this.f43702E0 == 0 && z10) {
                                c9 = 1;
                                c11219c.f33954g = true;
                            } else {
                                c9 = 1;
                            }
                            ArrayList arrayList10 = this.f43711r0;
                            if (r23[0] != 2 || r23[c9] == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f43698A0 = 0;
                            this.f43699B0 = 0;
                            i15 = i11;
                            for (i16 = 0; i16 < i15; i16++) {
                                c13807d2 = (C13807d) this.f43711r0.get(i16);
                                if (c13807d2 instanceof C13808e) {
                                    ((C13808e) c13807d2).m15400X();
                                }
                            }
                            zM15402a0 = m15402a0(64);
                            r12 = z6;
                            i17 = 0;
                            z12 = true;
                            while (z12) {
                                i18 = i17 + 1;
                                try {
                                    c11219c.m12475t();
                                    this.f43698A0 = 0;
                                    this.f43699B0 = 0;
                                    m15379h(c11219c);
                                    for (i23 = 0; i23 < i15; i23++) {
                                        ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
                                    }
                                    m15398V(c11219c);
                                    try {
                                        weakReference = this.f43705H0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    C13806c c13806c8 = (C13806c) this.f43705H0.get();
                                                    c13806c3 = c13806c2;
                                                    try {
                                                        C11221e c11221eM12467k = c11219c.m12467k(c13806c3);
                                                        C11219c c11219c6 = this.f43717x0;
                                                        r26 = r12;
                                                        c13806c2 = c13806c3;
                                                        try {
                                                            c11219c6.m12462f(c11219c6.m12467k(c13806c8), c11221eM12467k, 0, 5);
                                                            this.f43705H0 = null;
                                                            r26 = r26;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z22 = true;
                                                            r22 = r26;
                                                            z21 = z22;
                                                            r25 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z13 = z21;
                                                            r24 = r25;
                                                            zArr = AbstractC13813j.f43782a;
                                                            if (z13) {
                                                                zArr[2] = false;
                                                                zM15402a1 = m15402a0(64);
                                                                mo15373T(c11219c, zM15402a1);
                                                                size = this.f43711r0.size();
                                                                i22 = 0;
                                                                z20 = false;
                                                                while (i22 < size) {
                                                                    c13807d = (C13807d) this.f43711r0.get(i22);
                                                                    c13807d.mo15373T(c11219c, zM15402a1);
                                                                    boolean z29 = zM15402a1;
                                                                    int i61 = size;
                                                                    if (c13807d.f43669h == -1) {
                                                                        z20 = true;
                                                                    } else {
                                                                        z20 = true;
                                                                    }
                                                                    i22++;
                                                                    zM15402a1 = z29;
                                                                    size = i61;
                                                                    z20 = z20;
                                                                }
                                                                z14 = z20;
                                                            } else {
                                                                mo15373T(c11219c, zM15402a0);
                                                                for (i19 = 0; i19 < i15; i19++) {
                                                                    ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                                                }
                                                                z14 = false;
                                                            }
                                                            if (z11) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                for (i21 = 0; i21 < i15; i21++) {
                                                                    C13807d c13807d14 = (C13807d) this.f43711r0.get(i21);
                                                                    iMax3 = Math.max(iMax3, c13807d14.m15387r() + c13807d14.f43654Z);
                                                                    iMax4 = Math.max(iMax4, c13807d14.m15383l() + c13807d14.f43656a0);
                                                                }
                                                                iMax5 = Math.max(this.f43660c0, iMax3);
                                                                iMax6 = Math.max(this.f43662d0, iMax4);
                                                                z14 = z14;
                                                                r24 = r24;
                                                                if (i14 == 2) {
                                                                    z14 = z14;
                                                                    r24 = r24;
                                                                    m15371R(iMax5);
                                                                    r23[0] = 2;
                                                                    z14 = true;
                                                                    r24 = 1;
                                                                }
                                                                if (i12 == 2) {
                                                                    m15366M(iMax6);
                                                                    r23[1] = 2;
                                                                    z14 = true;
                                                                    r24 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f43660c0, m15387r());
                                                            if (iMax > m15387r()) {
                                                                m15371R(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z15 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r18 = r24;
                                                                z15 = z14;
                                                            }
                                                            iMax2 = Math.max(this.f43662d0, m15383l());
                                                            if (iMax2 > m15383l()) {
                                                                m15366M(iMax2);
                                                                r23[r6] = r6;
                                                                r15 = r6;
                                                                z16 = r15 == true ? 1 : 0;
                                                            } else {
                                                                r10 = r18;
                                                            }
                                                            if (r10 == 0) {
                                                                z16 = z15;
                                                                if (r23[0] == 2) {
                                                                    r14 = r10;
                                                                    z19 = z16;
                                                                    if (m15387r() > i13) {
                                                                        this.f43703F0 = r6;
                                                                        r23[0] = r6;
                                                                        m15371R(i13);
                                                                        ?? r27 = r6;
                                                                        z19 = r27 == true ? 1 : 0;
                                                                        r14 = r27;
                                                                    }
                                                                }
                                                                r10 = r15;
                                                                r14 = r10;
                                                                r14 = r10;
                                                                z19 = z16;
                                                                z19 = z16;
                                                                r11 = r14;
                                                                r11 = r14;
                                                                z17 = z19;
                                                                z17 = z19;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i18 > i20) {
                                                                    r11 = r14;
                                                                    z17 = z19;
                                                                    z18 = false;
                                                                } else {
                                                                    r11 = r14;
                                                                    z17 = z19;
                                                                }
                                                                z12 = z18;
                                                                i17 = i18;
                                                                r12 = r13;
                                                            } else {
                                                                z16 = z15;
                                                                r10 = r15;
                                                                r11 = r10;
                                                                z17 = z16;
                                                            }
                                                            r11 = r14;
                                                            z17 = z19;
                                                            r13 = r11;
                                                            z18 = z17;
                                                            i20 = 8;
                                                            if (i18 > i20) {
                                                                r11 = r14;
                                                                z17 = z19;
                                                                z18 = false;
                                                            } else {
                                                                r11 = r14;
                                                                z17 = z19;
                                                            }
                                                            z12 = z18;
                                                            i17 = i18;
                                                            r12 = r13;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        r26 = r12;
                                                        c13806c2 = c13806c3;
                                                    }
                                                } else {
                                                    r26 = r12;
                                                }
                                                try {
                                                    weakReference2 = this.f43707J0;
                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                        C13806c c13806c9 = (C13806c) this.f43707J0.get();
                                                        C11221e c11221eM12467k2 = c11219c.m12467k(this.f43641M);
                                                        C11219c c11219c7 = this.f43717x0;
                                                        c11219c7.m12462f(c11221eM12467k2, c11219c7.m12467k(c13806c9), 0, 5);
                                                        this.f43707J0 = null;
                                                    }
                                                    weakReference3 = this.f43706I0;
                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                        C13806c c13806c10 = (C13806c) this.f43706I0.get();
                                                        c13806c4 = c13806c;
                                                        try {
                                                            C11221e c11221eM12467k3 = c11219c.m12467k(c13806c4);
                                                            C11219c c11219c8 = this.f43717x0;
                                                            c13806c = c13806c4;
                                                            c11219c8.m12462f(c11219c8.m12467k(c13806c10), c11221eM12467k3, 0, 5);
                                                            this.f43706I0 = null;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            c13806c = c13806c4;
                                                            z22 = true;
                                                            r22 = r26;
                                                            z21 = z22;
                                                            r25 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z13 = z21;
                                                            r24 = r25;
                                                        }
                                                    }
                                                    weakReference4 = this.f43708K0;
                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                        C13806c c13806c11 = (C13806c) this.f43708K0.get();
                                                        C11221e c11221eM12467k4 = c11219c.m12467k(this.f43640L);
                                                        try {
                                                            C11219c c11219c9 = this.f43717x0;
                                                            try {
                                                                c11219c9.m12462f(c11221eM12467k4, c11219c9.m12467k(c13806c11), 0, 5);
                                                                try {
                                                                    this.f43708K0 = null;
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    z21 = true;
                                                                    r25 = r26;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    z13 = z21;
                                                                    r24 = r25;
                                                                }
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            z21 = true;
                                                            r25 = r26;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z13 = z21;
                                                            r24 = r25;
                                                            zArr = AbstractC13813j.f43782a;
                                                            if (z13) {
                                                                zArr[2] = false;
                                                                zM15402a1 = m15402a0(64);
                                                                mo15373T(c11219c, zM15402a1);
                                                                size = this.f43711r0.size();
                                                                i22 = 0;
                                                                z20 = false;
                                                                while (i22 < size) {
                                                                    c13807d = (C13807d) this.f43711r0.get(i22);
                                                                    c13807d.mo15373T(c11219c, zM15402a1);
                                                                    boolean z210 = zM15402a1;
                                                                    int i62 = size;
                                                                    if (c13807d.f43669h == -1) {
                                                                        z20 = true;
                                                                    } else {
                                                                        z20 = true;
                                                                    }
                                                                    i22++;
                                                                    zM15402a1 = z210;
                                                                    size = i62;
                                                                    z20 = z20;
                                                                }
                                                                z14 = z20;
                                                            } else {
                                                                mo15373T(c11219c, zM15402a0);
                                                                while (i19 < i15) {
                                                                    ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                                                }
                                                                z14 = false;
                                                            }
                                                            if (z11) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i21 < i15) {
                                                                    C13807d c13807d15 = (C13807d) this.f43711r0.get(i21);
                                                                    iMax3 = Math.max(iMax3, c13807d15.m15387r() + c13807d15.f43654Z);
                                                                    iMax4 = Math.max(iMax4, c13807d15.m15383l() + c13807d15.f43656a0);
                                                                }
                                                                iMax5 = Math.max(this.f43660c0, iMax3);
                                                                iMax6 = Math.max(this.f43662d0, iMax4);
                                                                z14 = z14;
                                                                r24 = r24;
                                                                if (i14 == 2) {
                                                                    z14 = z14;
                                                                    r24 = r24;
                                                                    m15371R(iMax5);
                                                                    r23[0] = 2;
                                                                    z14 = true;
                                                                    r24 = 1;
                                                                }
                                                                if (i12 == 2) {
                                                                    m15366M(iMax6);
                                                                    r23[1] = 2;
                                                                    z14 = true;
                                                                    r24 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f43660c0, m15387r());
                                                            if (iMax > m15387r()) {
                                                                m15371R(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z15 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r18 = r24;
                                                                z15 = z14;
                                                            }
                                                            iMax2 = Math.max(this.f43662d0, m15383l());
                                                            if (iMax2 > m15383l()) {
                                                                m15366M(iMax2);
                                                                r23[r6] = r6;
                                                                r15 = r6;
                                                                z16 = r15 == true ? 1 : 0;
                                                            } else {
                                                                r10 = r18;
                                                            }
                                                            if (r10 == 0) {
                                                                z16 = z15;
                                                                if (r23[0] == 2) {
                                                                    r14 = r10;
                                                                    z19 = z16;
                                                                    if (m15387r() > i13) {
                                                                        this.f43703F0 = r6;
                                                                        r23[0] = r6;
                                                                        m15371R(i13);
                                                                        ?? r28 = r6;
                                                                        z19 = r28 == true ? 1 : 0;
                                                                        r14 = r28;
                                                                    }
                                                                }
                                                                r10 = r15;
                                                                r14 = r10;
                                                                r14 = r10;
                                                                z19 = z16;
                                                                z19 = z16;
                                                                r11 = r14;
                                                                r11 = r14;
                                                                z17 = z19;
                                                                z17 = z19;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i18 > i20) {
                                                                    r11 = r14;
                                                                    z17 = z19;
                                                                    z18 = false;
                                                                } else {
                                                                    r11 = r14;
                                                                    z17 = z19;
                                                                }
                                                                z12 = z18;
                                                                i17 = i18;
                                                                r12 = r13;
                                                            } else {
                                                                z16 = z15;
                                                                r10 = r15;
                                                                r11 = r10;
                                                                z17 = z16;
                                                            }
                                                            r11 = r14;
                                                            z17 = z19;
                                                            r13 = r11;
                                                            z18 = z17;
                                                            i20 = 8;
                                                            if (i18 > i20) {
                                                                r11 = r14;
                                                                z17 = z19;
                                                                z18 = false;
                                                            } else {
                                                                r11 = r14;
                                                                z17 = z19;
                                                            }
                                                            z12 = z18;
                                                            i17 = i18;
                                                            r12 = r13;
                                                        }
                                                    }
                                                    c11219c.m12471p();
                                                    z13 = true;
                                                    r24 = r26;
                                                } catch (Exception e16) {
                                                    e = e16;
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                r26 = r12;
                                            }
                                        } else {
                                            r26 = r12;
                                            weakReference2 = this.f43707J0;
                                            if (weakReference2 != null) {
                                                C13806c c13806c12 = (C13806c) this.f43707J0.get();
                                                C11221e c11221eM12467k5 = c11219c.m12467k(this.f43641M);
                                                C11219c c11219c10 = this.f43717x0;
                                                c11219c10.m12462f(c11221eM12467k5, c11219c10.m12467k(c13806c12), 0, 5);
                                                this.f43707J0 = null;
                                            }
                                            weakReference3 = this.f43706I0;
                                            if (weakReference3 != null) {
                                                C13806c c13806c13 = (C13806c) this.f43706I0.get();
                                                c13806c4 = c13806c;
                                                C11221e c11221eM12467k6 = c11219c.m12467k(c13806c4);
                                                C11219c c11219c11 = this.f43717x0;
                                                c13806c = c13806c4;
                                                c11219c11.m12462f(c11219c11.m12467k(c13806c13), c11221eM12467k6, 0, 5);
                                                this.f43706I0 = null;
                                            }
                                            weakReference4 = this.f43708K0;
                                            if (weakReference4 == null) {
                                            }
                                            c11219c.m12471p();
                                            z13 = true;
                                            r24 = r26;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        r26 = r12;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    r22 = r12;
                                    z22 = z12;
                                }
                                zArr = AbstractC13813j.f43782a;
                                if (z13) {
                                    zArr[2] = false;
                                    zM15402a1 = m15402a0(64);
                                    mo15373T(c11219c, zM15402a1);
                                    size = this.f43711r0.size();
                                    i22 = 0;
                                    z20 = false;
                                    while (i22 < size) {
                                        c13807d = (C13807d) this.f43711r0.get(i22);
                                        c13807d.mo15373T(c11219c, zM15402a1);
                                        boolean z211 = zM15402a1;
                                        int i63 = size;
                                        if (c13807d.f43669h == -1 || c13807d.f43671i != -1) {
                                            z20 = true;
                                        }
                                        i22++;
                                        zM15402a1 = z211;
                                        size = i63;
                                        z20 = z20;
                                    }
                                    z14 = z20;
                                } else {
                                    mo15373T(c11219c, zM15402a0);
                                    while (i19 < i15) {
                                        ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                    }
                                    z14 = false;
                                }
                                if (z11 && i18 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i21 < i15) {
                                        C13807d c13807d16 = (C13807d) this.f43711r0.get(i21);
                                        iMax3 = Math.max(iMax3, c13807d16.m15387r() + c13807d16.f43654Z);
                                        iMax4 = Math.max(iMax4, c13807d16.m15383l() + c13807d16.f43656a0);
                                    }
                                    iMax5 = Math.max(this.f43660c0, iMax3);
                                    iMax6 = Math.max(this.f43662d0, iMax4);
                                    z14 = z14;
                                    r24 = r24;
                                    if (i14 == 2 && m15387r() < iMax5) {
                                        z14 = z14;
                                        r24 = r24;
                                        m15371R(iMax5);
                                        r23[0] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                    if (i12 == 2 && m15383l() < iMax6) {
                                        m15366M(iMax6);
                                        r23[1] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.f43660c0, m15387r());
                                if (iMax > m15387r()) {
                                    m15371R(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z15 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z15 = z14;
                                }
                                iMax2 = Math.max(this.f43662d0, m15383l());
                                if (iMax2 > m15383l()) {
                                    m15366M(iMax2);
                                    r23[r6] = r6;
                                    r15 = r6;
                                    z16 = r15 == true ? 1 : 0;
                                } else {
                                    r10 = r18;
                                }
                                if (r10 == 0) {
                                    z16 = z15;
                                    if (r23[0] == 2 && i13 > 0) {
                                        r14 = r10;
                                        z19 = z16;
                                        if (m15387r() > i13) {
                                            this.f43703F0 = r6;
                                            r23[0] = r6;
                                            m15371R(i13);
                                            ?? r29 = r6;
                                            z19 = r29 == true ? 1 : 0;
                                            r14 = r29;
                                        }
                                    }
                                    r10 = r15;
                                    r14 = r10;
                                    r14 = r10;
                                    z19 = z16;
                                    z19 = z16;
                                    r11 = r14;
                                    r11 = r14;
                                    z17 = z19;
                                    z17 = z19;
                                    if (r23[r6] != 2 && i10 > 0 && m15383l() > i10) {
                                        this.f43704G0 = r6;
                                        r23[r6] = r6;
                                        m15366M(i10);
                                        i20 = 8;
                                        z18 = true;
                                        r13 = 1;
                                    }
                                    if (i18 > i20) {
                                        r11 = r14;
                                        z17 = z19;
                                        z18 = false;
                                    } else {
                                        r11 = r14;
                                        z17 = z19;
                                    }
                                    z12 = z18;
                                    i17 = i18;
                                    r12 = r13;
                                } else {
                                    z16 = z15;
                                    r10 = r15;
                                    r11 = r10;
                                    z17 = z16;
                                }
                                r11 = r14;
                                z17 = z19;
                                r13 = r11;
                                z18 = z17;
                                i20 = 8;
                                if (i18 > i20) {
                                    r11 = r14;
                                    z17 = z19;
                                    z18 = false;
                                } else {
                                    r11 = r14;
                                    z17 = z19;
                                }
                                z12 = z18;
                                i17 = i18;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.f43711r0 = arrayList10;
                            if (r21 != 0) {
                                r23[0] = i14;
                                r23[1] = i12;
                            }
                            mo15362G(c11219c.f33959l);
                        }
                        c11219c = c11219c4;
                        c10 = 1;
                        c14385o = null;
                        if (r23[c10] == 2) {
                            i29 = 0;
                            c14385o2 = null;
                            while (r0.hasNext()) {
                                if (c14385o8.f45101c != 0) {
                                    c14385o2 = c14385o8;
                                    i29 = iM15881b;
                                }
                            }
                            if (c14385o2 != null) {
                                m15369P(1);
                                m15366M(i29);
                            } else {
                                c14385o2 = null;
                            }
                        } else {
                            c14385o2 = null;
                        }
                        if (c14385o == null) {
                        }
                        i14 = i26;
                        if (i14 == 2) {
                            i27 = i24;
                            if (i27 < m15387r()) {
                            }
                            iM15387r = m15387r();
                            i12 = i25;
                            if (i12 == 2) {
                                i28 = i10;
                                if (i28 < m15383l()) {
                                }
                                iM15383l = m15383l();
                                i10 = iM15383l;
                                i13 = iM15387r;
                                z6 = true;
                                if (m15402a0(64)) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                c11219c.getClass();
                                c11219c.f33954g = false;
                                if (this.f43702E0 == 0) {
                                    c9 = 1;
                                } else {
                                    c9 = 1;
                                }
                                ArrayList arrayList11 = this.f43711r0;
                                if (r23[0] != 2) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                this.f43698A0 = 0;
                                this.f43699B0 = 0;
                                i15 = i11;
                                while (i16 < i15) {
                                    c13807d2 = (C13807d) this.f43711r0.get(i16);
                                    if (c13807d2 instanceof C13808e) {
                                        ((C13808e) c13807d2).m15400X();
                                    }
                                }
                                zM15402a0 = m15402a0(64);
                                r12 = z6;
                                i17 = 0;
                                z12 = true;
                                while (z12) {
                                    i18 = i17 + 1;
                                    c11219c.m12475t();
                                    this.f43698A0 = 0;
                                    this.f43699B0 = 0;
                                    m15379h(c11219c);
                                    while (i23 < i15) {
                                        ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
                                    }
                                    m15398V(c11219c);
                                    weakReference = this.f43705H0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            C13806c c13806c14 = (C13806c) this.f43705H0.get();
                                            c13806c3 = c13806c2;
                                            C11221e c11221eM12467k7 = c11219c.m12467k(c13806c3);
                                            C11219c c11219c12 = this.f43717x0;
                                            r26 = r12;
                                            c13806c2 = c13806c3;
                                            c11219c12.m12462f(c11219c12.m12467k(c13806c14), c11221eM12467k7, 0, 5);
                                            this.f43705H0 = null;
                                            r26 = r26;
                                        } else {
                                            r26 = r12;
                                        }
                                        weakReference2 = this.f43707J0;
                                        if (weakReference2 != null) {
                                            C13806c c13806c15 = (C13806c) this.f43707J0.get();
                                            C11221e c11221eM12467k8 = c11219c.m12467k(this.f43641M);
                                            C11219c c11219c13 = this.f43717x0;
                                            c11219c13.m12462f(c11221eM12467k8, c11219c13.m12467k(c13806c15), 0, 5);
                                            this.f43707J0 = null;
                                        }
                                        weakReference3 = this.f43706I0;
                                        if (weakReference3 != null) {
                                            C13806c c13806c16 = (C13806c) this.f43706I0.get();
                                            c13806c4 = c13806c;
                                            C11221e c11221eM12467k9 = c11219c.m12467k(c13806c4);
                                            C11219c c11219c14 = this.f43717x0;
                                            c13806c = c13806c4;
                                            c11219c14.m12462f(c11219c14.m12467k(c13806c16), c11221eM12467k9, 0, 5);
                                            this.f43706I0 = null;
                                        }
                                        weakReference4 = this.f43708K0;
                                        if (weakReference4 == null) {
                                        }
                                        c11219c.m12471p();
                                        z13 = true;
                                        r24 = r26;
                                    } else {
                                        r26 = r12;
                                        weakReference2 = this.f43707J0;
                                        if (weakReference2 != null) {
                                            C13806c c13806c17 = (C13806c) this.f43707J0.get();
                                            C11221e c11221eM12467k10 = c11219c.m12467k(this.f43641M);
                                            C11219c c11219c15 = this.f43717x0;
                                            c11219c15.m12462f(c11221eM12467k10, c11219c15.m12467k(c13806c17), 0, 5);
                                            this.f43707J0 = null;
                                        }
                                        weakReference3 = this.f43706I0;
                                        if (weakReference3 != null) {
                                            C13806c c13806c18 = (C13806c) this.f43706I0.get();
                                            c13806c4 = c13806c;
                                            C11221e c11221eM12467k11 = c11219c.m12467k(c13806c4);
                                            C11219c c11219c16 = this.f43717x0;
                                            c13806c = c13806c4;
                                            c11219c16.m12462f(c11219c16.m12467k(c13806c18), c11221eM12467k11, 0, 5);
                                            this.f43706I0 = null;
                                        }
                                        weakReference4 = this.f43708K0;
                                        if (weakReference4 == null) {
                                        }
                                        c11219c.m12471p();
                                        z13 = true;
                                        r24 = r26;
                                    }
                                    zArr = AbstractC13813j.f43782a;
                                    if (z13) {
                                        zArr[2] = false;
                                        zM15402a1 = m15402a0(64);
                                        mo15373T(c11219c, zM15402a1);
                                        size = this.f43711r0.size();
                                        i22 = 0;
                                        z20 = false;
                                        while (i22 < size) {
                                            c13807d = (C13807d) this.f43711r0.get(i22);
                                            c13807d.mo15373T(c11219c, zM15402a1);
                                            boolean z212 = zM15402a1;
                                            int i64 = size;
                                            if (c13807d.f43669h == -1) {
                                                z20 = true;
                                            } else {
                                                z20 = true;
                                            }
                                            i22++;
                                            zM15402a1 = z212;
                                            size = i64;
                                            z20 = z20;
                                        }
                                        z14 = z20;
                                    } else {
                                        mo15373T(c11219c, zM15402a0);
                                        while (i19 < i15) {
                                            ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                        }
                                        z14 = false;
                                    }
                                    if (z11) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i21 < i15) {
                                            C13807d c13807d17 = (C13807d) this.f43711r0.get(i21);
                                            iMax3 = Math.max(iMax3, c13807d17.m15387r() + c13807d17.f43654Z);
                                            iMax4 = Math.max(iMax4, c13807d17.m15383l() + c13807d17.f43656a0);
                                        }
                                        iMax5 = Math.max(this.f43660c0, iMax3);
                                        iMax6 = Math.max(this.f43662d0, iMax4);
                                        z14 = z14;
                                        r24 = r24;
                                        if (i14 == 2) {
                                            z14 = z14;
                                            r24 = r24;
                                            m15371R(iMax5);
                                            r23[0] = 2;
                                            z14 = true;
                                            r24 = 1;
                                        }
                                        if (i12 == 2) {
                                            m15366M(iMax6);
                                            r23[1] = 2;
                                            z14 = true;
                                            r24 = 1;
                                        }
                                    }
                                    iMax = Math.max(this.f43660c0, m15387r());
                                    if (iMax > m15387r()) {
                                        m15371R(iMax);
                                        r6 = 1;
                                        r23[0] = 1;
                                        z15 = true;
                                        r18 = 1;
                                    } else {
                                        r6 = 1;
                                        r18 = r24;
                                        z15 = z14;
                                    }
                                    iMax2 = Math.max(this.f43662d0, m15383l());
                                    if (iMax2 > m15383l()) {
                                        m15366M(iMax2);
                                        r23[r6] = r6;
                                        r15 = r6;
                                        z16 = r15 == true ? 1 : 0;
                                    } else {
                                        r10 = r18;
                                    }
                                    if (r10 == 0) {
                                        z16 = z15;
                                        if (r23[0] == 2) {
                                            r14 = r10;
                                            z19 = z16;
                                            if (m15387r() > i13) {
                                                this.f43703F0 = r6;
                                                r23[0] = r6;
                                                m15371R(i13);
                                                ?? r210 = r6;
                                                z19 = r210 == true ? 1 : 0;
                                                r14 = r210;
                                            }
                                        }
                                        r10 = r15;
                                        r14 = r10;
                                        r14 = r10;
                                        z19 = z16;
                                        z19 = z16;
                                        r11 = r14;
                                        r11 = r14;
                                        z17 = z19;
                                        z17 = z19;
                                        if (r23[r6] != 2) {
                                        }
                                        if (i18 > i20) {
                                            r11 = r14;
                                            z17 = z19;
                                            z18 = false;
                                        } else {
                                            r11 = r14;
                                            z17 = z19;
                                        }
                                        z12 = z18;
                                        i17 = i18;
                                        r12 = r13;
                                    } else {
                                        z16 = z15;
                                        r10 = r15;
                                        r11 = r10;
                                        z17 = z16;
                                    }
                                    r11 = r14;
                                    z17 = z19;
                                    r13 = r11;
                                    z18 = z17;
                                    i20 = 8;
                                    if (i18 > i20) {
                                        r11 = r14;
                                        z17 = z19;
                                        z18 = false;
                                    } else {
                                        r11 = r14;
                                        z17 = z19;
                                    }
                                    z12 = z18;
                                    i17 = i18;
                                    r12 = r13;
                                }
                                r21 = r12;
                                this.f43711r0 = arrayList11;
                                if (r21 != 0) {
                                    r23[0] = i14;
                                    r23[1] = i12;
                                }
                                mo15362G(c11219c.f33959l);
                            }
                            i28 = i10;
                            iM15383l = i28;
                            i10 = iM15383l;
                            i13 = iM15387r;
                            z6 = true;
                            if (m15402a0(64)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            c11219c.getClass();
                            c11219c.f33954g = false;
                            if (this.f43702E0 == 0) {
                                c9 = 1;
                            } else {
                                c9 = 1;
                            }
                            ArrayList arrayList12 = this.f43711r0;
                            if (r23[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            this.f43698A0 = 0;
                            this.f43699B0 = 0;
                            i15 = i11;
                            while (i16 < i15) {
                                c13807d2 = (C13807d) this.f43711r0.get(i16);
                                if (c13807d2 instanceof C13808e) {
                                    ((C13808e) c13807d2).m15400X();
                                }
                            }
                            zM15402a0 = m15402a0(64);
                            r12 = z6;
                            i17 = 0;
                            z12 = true;
                            while (z12) {
                                i18 = i17 + 1;
                                c11219c.m12475t();
                                this.f43698A0 = 0;
                                this.f43699B0 = 0;
                                m15379h(c11219c);
                                while (i23 < i15) {
                                    ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
                                }
                                m15398V(c11219c);
                                weakReference = this.f43705H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C13806c c13806c19 = (C13806c) this.f43705H0.get();
                                        c13806c3 = c13806c2;
                                        C11221e c11221eM12467k12 = c11219c.m12467k(c13806c3);
                                        C11219c c11219c17 = this.f43717x0;
                                        r26 = r12;
                                        c13806c2 = c13806c3;
                                        c11219c17.m12462f(c11219c17.m12467k(c13806c19), c11221eM12467k12, 0, 5);
                                        this.f43705H0 = null;
                                        r26 = r26;
                                    } else {
                                        r26 = r12;
                                    }
                                    weakReference2 = this.f43707J0;
                                    if (weakReference2 != null) {
                                        C13806c c13806c110 = (C13806c) this.f43707J0.get();
                                        C11221e c11221eM12467k13 = c11219c.m12467k(this.f43641M);
                                        C11219c c11219c18 = this.f43717x0;
                                        c11219c18.m12462f(c11221eM12467k13, c11219c18.m12467k(c13806c110), 0, 5);
                                        this.f43707J0 = null;
                                    }
                                    weakReference3 = this.f43706I0;
                                    if (weakReference3 != null) {
                                        C13806c c13806c111 = (C13806c) this.f43706I0.get();
                                        c13806c4 = c13806c;
                                        C11221e c11221eM12467k14 = c11219c.m12467k(c13806c4);
                                        C11219c c11219c19 = this.f43717x0;
                                        c13806c = c13806c4;
                                        c11219c19.m12462f(c11219c19.m12467k(c13806c111), c11221eM12467k14, 0, 5);
                                        this.f43706I0 = null;
                                    }
                                    weakReference4 = this.f43708K0;
                                    if (weakReference4 == null) {
                                    }
                                    c11219c.m12471p();
                                    z13 = true;
                                    r24 = r26;
                                } else {
                                    r26 = r12;
                                    weakReference2 = this.f43707J0;
                                    if (weakReference2 != null) {
                                        C13806c c13806c112 = (C13806c) this.f43707J0.get();
                                        C11221e c11221eM12467k15 = c11219c.m12467k(this.f43641M);
                                        C11219c c11219c110 = this.f43717x0;
                                        c11219c110.m12462f(c11221eM12467k15, c11219c110.m12467k(c13806c112), 0, 5);
                                        this.f43707J0 = null;
                                    }
                                    weakReference3 = this.f43706I0;
                                    if (weakReference3 != null) {
                                        C13806c c13806c113 = (C13806c) this.f43706I0.get();
                                        c13806c4 = c13806c;
                                        C11221e c11221eM12467k16 = c11219c.m12467k(c13806c4);
                                        C11219c c11219c111 = this.f43717x0;
                                        c13806c = c13806c4;
                                        c11219c111.m12462f(c11219c111.m12467k(c13806c113), c11221eM12467k16, 0, 5);
                                        this.f43706I0 = null;
                                    }
                                    weakReference4 = this.f43708K0;
                                    if (weakReference4 == null) {
                                    }
                                    c11219c.m12471p();
                                    z13 = true;
                                    r24 = r26;
                                }
                                zArr = AbstractC13813j.f43782a;
                                if (z13) {
                                    zArr[2] = false;
                                    zM15402a1 = m15402a0(64);
                                    mo15373T(c11219c, zM15402a1);
                                    size = this.f43711r0.size();
                                    i22 = 0;
                                    z20 = false;
                                    while (i22 < size) {
                                        c13807d = (C13807d) this.f43711r0.get(i22);
                                        c13807d.mo15373T(c11219c, zM15402a1);
                                        boolean z213 = zM15402a1;
                                        int i65 = size;
                                        if (c13807d.f43669h == -1) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        i22++;
                                        zM15402a1 = z213;
                                        size = i65;
                                        z20 = z20;
                                    }
                                    z14 = z20;
                                } else {
                                    mo15373T(c11219c, zM15402a0);
                                    while (i19 < i15) {
                                        ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                    }
                                    z14 = false;
                                }
                                if (z11) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i21 < i15) {
                                        C13807d c13807d18 = (C13807d) this.f43711r0.get(i21);
                                        iMax3 = Math.max(iMax3, c13807d18.m15387r() + c13807d18.f43654Z);
                                        iMax4 = Math.max(iMax4, c13807d18.m15383l() + c13807d18.f43656a0);
                                    }
                                    iMax5 = Math.max(this.f43660c0, iMax3);
                                    iMax6 = Math.max(this.f43662d0, iMax4);
                                    z14 = z14;
                                    r24 = r24;
                                    if (i14 == 2) {
                                        z14 = z14;
                                        r24 = r24;
                                        m15371R(iMax5);
                                        r23[0] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                    if (i12 == 2) {
                                        m15366M(iMax6);
                                        r23[1] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.f43660c0, m15387r());
                                if (iMax > m15387r()) {
                                    m15371R(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z15 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z15 = z14;
                                }
                                iMax2 = Math.max(this.f43662d0, m15383l());
                                if (iMax2 > m15383l()) {
                                    m15366M(iMax2);
                                    r23[r6] = r6;
                                    r15 = r6;
                                    z16 = r15 == true ? 1 : 0;
                                } else {
                                    r10 = r18;
                                }
                                if (r10 == 0) {
                                    z16 = z15;
                                    if (r23[0] == 2) {
                                        r14 = r10;
                                        z19 = z16;
                                        if (m15387r() > i13) {
                                            this.f43703F0 = r6;
                                            r23[0] = r6;
                                            m15371R(i13);
                                            ?? r211 = r6;
                                            z19 = r211 == true ? 1 : 0;
                                            r14 = r211;
                                        }
                                    }
                                    r10 = r15;
                                    r14 = r10;
                                    r14 = r10;
                                    z19 = z16;
                                    z19 = z16;
                                    r11 = r14;
                                    r11 = r14;
                                    z17 = z19;
                                    z17 = z19;
                                    if (r23[r6] != 2) {
                                    }
                                    if (i18 > i20) {
                                        r11 = r14;
                                        z17 = z19;
                                        z18 = false;
                                    } else {
                                        r11 = r14;
                                        z17 = z19;
                                    }
                                    z12 = z18;
                                    i17 = i18;
                                    r12 = r13;
                                } else {
                                    z16 = z15;
                                    r10 = r15;
                                    r11 = r10;
                                    z17 = z16;
                                }
                                r11 = r14;
                                z17 = z19;
                                r13 = r11;
                                z18 = z17;
                                i20 = 8;
                                if (i18 > i20) {
                                    r11 = r14;
                                    z17 = z19;
                                    z18 = false;
                                } else {
                                    r11 = r14;
                                    z17 = z19;
                                }
                                z12 = z18;
                                i17 = i18;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.f43711r0 = arrayList12;
                            if (r21 != 0) {
                                r23[0] = i14;
                                r23[1] = i12;
                            }
                            mo15362G(c11219c.f33959l);
                        }
                        i27 = i24;
                        iM15387r = i27;
                        i12 = i25;
                        if (i12 == 2) {
                            i28 = i10;
                            if (i28 < m15383l()) {
                            }
                            iM15383l = m15383l();
                            i10 = iM15383l;
                            i13 = iM15387r;
                            z6 = true;
                            if (m15402a0(64)) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            c11219c.getClass();
                            c11219c.f33954g = false;
                            if (this.f43702E0 == 0) {
                                c9 = 1;
                            } else {
                                c9 = 1;
                            }
                            ArrayList arrayList13 = this.f43711r0;
                            if (r23[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            this.f43698A0 = 0;
                            this.f43699B0 = 0;
                            i15 = i11;
                            while (i16 < i15) {
                                c13807d2 = (C13807d) this.f43711r0.get(i16);
                                if (c13807d2 instanceof C13808e) {
                                    ((C13808e) c13807d2).m15400X();
                                }
                            }
                            zM15402a0 = m15402a0(64);
                            r12 = z6;
                            i17 = 0;
                            z12 = true;
                            while (z12) {
                                i18 = i17 + 1;
                                c11219c.m12475t();
                                this.f43698A0 = 0;
                                this.f43699B0 = 0;
                                m15379h(c11219c);
                                while (i23 < i15) {
                                    ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
                                }
                                m15398V(c11219c);
                                weakReference = this.f43705H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C13806c c13806c114 = (C13806c) this.f43705H0.get();
                                        c13806c3 = c13806c2;
                                        C11221e c11221eM12467k17 = c11219c.m12467k(c13806c3);
                                        C11219c c11219c112 = this.f43717x0;
                                        r26 = r12;
                                        c13806c2 = c13806c3;
                                        c11219c112.m12462f(c11219c112.m12467k(c13806c114), c11221eM12467k17, 0, 5);
                                        this.f43705H0 = null;
                                        r26 = r26;
                                    } else {
                                        r26 = r12;
                                    }
                                    weakReference2 = this.f43707J0;
                                    if (weakReference2 != null) {
                                        C13806c c13806c115 = (C13806c) this.f43707J0.get();
                                        C11221e c11221eM12467k18 = c11219c.m12467k(this.f43641M);
                                        C11219c c11219c113 = this.f43717x0;
                                        c11219c113.m12462f(c11221eM12467k18, c11219c113.m12467k(c13806c115), 0, 5);
                                        this.f43707J0 = null;
                                    }
                                    weakReference3 = this.f43706I0;
                                    if (weakReference3 != null) {
                                        C13806c c13806c116 = (C13806c) this.f43706I0.get();
                                        c13806c4 = c13806c;
                                        C11221e c11221eM12467k19 = c11219c.m12467k(c13806c4);
                                        C11219c c11219c114 = this.f43717x0;
                                        c13806c = c13806c4;
                                        c11219c114.m12462f(c11219c114.m12467k(c13806c116), c11221eM12467k19, 0, 5);
                                        this.f43706I0 = null;
                                    }
                                    weakReference4 = this.f43708K0;
                                    if (weakReference4 == null) {
                                    }
                                    c11219c.m12471p();
                                    z13 = true;
                                    r24 = r26;
                                } else {
                                    r26 = r12;
                                    weakReference2 = this.f43707J0;
                                    if (weakReference2 != null) {
                                        C13806c c13806c117 = (C13806c) this.f43707J0.get();
                                        C11221e c11221eM12467k110 = c11219c.m12467k(this.f43641M);
                                        C11219c c11219c115 = this.f43717x0;
                                        c11219c115.m12462f(c11221eM12467k110, c11219c115.m12467k(c13806c117), 0, 5);
                                        this.f43707J0 = null;
                                    }
                                    weakReference3 = this.f43706I0;
                                    if (weakReference3 != null) {
                                        C13806c c13806c118 = (C13806c) this.f43706I0.get();
                                        c13806c4 = c13806c;
                                        C11221e c11221eM12467k111 = c11219c.m12467k(c13806c4);
                                        C11219c c11219c116 = this.f43717x0;
                                        c13806c = c13806c4;
                                        c11219c116.m12462f(c11219c116.m12467k(c13806c118), c11221eM12467k111, 0, 5);
                                        this.f43706I0 = null;
                                    }
                                    weakReference4 = this.f43708K0;
                                    if (weakReference4 == null) {
                                    }
                                    c11219c.m12471p();
                                    z13 = true;
                                    r24 = r26;
                                }
                                zArr = AbstractC13813j.f43782a;
                                if (z13) {
                                    zArr[2] = false;
                                    zM15402a1 = m15402a0(64);
                                    mo15373T(c11219c, zM15402a1);
                                    size = this.f43711r0.size();
                                    i22 = 0;
                                    z20 = false;
                                    while (i22 < size) {
                                        c13807d = (C13807d) this.f43711r0.get(i22);
                                        c13807d.mo15373T(c11219c, zM15402a1);
                                        boolean z214 = zM15402a1;
                                        int i66 = size;
                                        if (c13807d.f43669h == -1) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        i22++;
                                        zM15402a1 = z214;
                                        size = i66;
                                        z20 = z20;
                                    }
                                    z14 = z20;
                                } else {
                                    mo15373T(c11219c, zM15402a0);
                                    while (i19 < i15) {
                                        ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                    }
                                    z14 = false;
                                }
                                if (z11) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i21 < i15) {
                                        C13807d c13807d19 = (C13807d) this.f43711r0.get(i21);
                                        iMax3 = Math.max(iMax3, c13807d19.m15387r() + c13807d19.f43654Z);
                                        iMax4 = Math.max(iMax4, c13807d19.m15383l() + c13807d19.f43656a0);
                                    }
                                    iMax5 = Math.max(this.f43660c0, iMax3);
                                    iMax6 = Math.max(this.f43662d0, iMax4);
                                    z14 = z14;
                                    r24 = r24;
                                    if (i14 == 2) {
                                        z14 = z14;
                                        r24 = r24;
                                        m15371R(iMax5);
                                        r23[0] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                    if (i12 == 2) {
                                        m15366M(iMax6);
                                        r23[1] = 2;
                                        z14 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.f43660c0, m15387r());
                                if (iMax > m15387r()) {
                                    m15371R(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z15 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z15 = z14;
                                }
                                iMax2 = Math.max(this.f43662d0, m15383l());
                                if (iMax2 > m15383l()) {
                                    m15366M(iMax2);
                                    r23[r6] = r6;
                                    r15 = r6;
                                    z16 = r15 == true ? 1 : 0;
                                } else {
                                    r10 = r18;
                                }
                                if (r10 == 0) {
                                    z16 = z15;
                                    if (r23[0] == 2) {
                                        r14 = r10;
                                        z19 = z16;
                                        if (m15387r() > i13) {
                                            this.f43703F0 = r6;
                                            r23[0] = r6;
                                            m15371R(i13);
                                            ?? r212 = r6;
                                            z19 = r212 == true ? 1 : 0;
                                            r14 = r212;
                                        }
                                    }
                                    r10 = r15;
                                    r14 = r10;
                                    r14 = r10;
                                    z19 = z16;
                                    z19 = z16;
                                    r11 = r14;
                                    r11 = r14;
                                    z17 = z19;
                                    z17 = z19;
                                    if (r23[r6] != 2) {
                                    }
                                    if (i18 > i20) {
                                        r11 = r14;
                                        z17 = z19;
                                        z18 = false;
                                    } else {
                                        r11 = r14;
                                        z17 = z19;
                                    }
                                    z12 = z18;
                                    i17 = i18;
                                    r12 = r13;
                                } else {
                                    z16 = z15;
                                    r10 = r15;
                                    r11 = r10;
                                    z17 = z16;
                                }
                                r11 = r14;
                                z17 = z19;
                                r13 = r11;
                                z18 = z17;
                                i20 = 8;
                                if (i18 > i20) {
                                    r11 = r14;
                                    z17 = z19;
                                    z18 = false;
                                } else {
                                    r11 = r14;
                                    z17 = z19;
                                }
                                z12 = z18;
                                i17 = i18;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.f43711r0 = arrayList13;
                            if (r21 != 0) {
                                r23[0] = i14;
                                r23[1] = i12;
                            }
                            mo15362G(c11219c.f33959l);
                        }
                        i28 = i10;
                        iM15383l = i28;
                        i10 = iM15383l;
                        i13 = iM15387r;
                        z6 = true;
                        if (m15402a0(64)) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        c11219c.getClass();
                        c11219c.f33954g = false;
                        if (this.f43702E0 == 0) {
                            c9 = 1;
                        } else {
                            c9 = 1;
                        }
                        ArrayList arrayList14 = this.f43711r0;
                        if (r23[0] != 2) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        this.f43698A0 = 0;
                        this.f43699B0 = 0;
                        i15 = i11;
                        while (i16 < i15) {
                            c13807d2 = (C13807d) this.f43711r0.get(i16);
                            if (c13807d2 instanceof C13808e) {
                                ((C13808e) c13807d2).m15400X();
                            }
                        }
                        zM15402a0 = m15402a0(64);
                        r12 = z6;
                        i17 = 0;
                        z12 = true;
                        while (z12) {
                            i18 = i17 + 1;
                            c11219c.m12475t();
                            this.f43698A0 = 0;
                            this.f43699B0 = 0;
                            m15379h(c11219c);
                            while (i23 < i15) {
                                ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
                            }
                            m15398V(c11219c);
                            weakReference = this.f43705H0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    C13806c c13806c119 = (C13806c) this.f43705H0.get();
                                    c13806c3 = c13806c2;
                                    C11221e c11221eM12467k112 = c11219c.m12467k(c13806c3);
                                    C11219c c11219c117 = this.f43717x0;
                                    r26 = r12;
                                    c13806c2 = c13806c3;
                                    c11219c117.m12462f(c11219c117.m12467k(c13806c119), c11221eM12467k112, 0, 5);
                                    this.f43705H0 = null;
                                    r26 = r26;
                                } else {
                                    r26 = r12;
                                }
                                weakReference2 = this.f43707J0;
                                if (weakReference2 != null) {
                                    C13806c c13806c1110 = (C13806c) this.f43707J0.get();
                                    C11221e c11221eM12467k113 = c11219c.m12467k(this.f43641M);
                                    C11219c c11219c118 = this.f43717x0;
                                    c11219c118.m12462f(c11221eM12467k113, c11219c118.m12467k(c13806c1110), 0, 5);
                                    this.f43707J0 = null;
                                }
                                weakReference3 = this.f43706I0;
                                if (weakReference3 != null) {
                                    C13806c c13806c1111 = (C13806c) this.f43706I0.get();
                                    c13806c4 = c13806c;
                                    C11221e c11221eM12467k114 = c11219c.m12467k(c13806c4);
                                    C11219c c11219c119 = this.f43717x0;
                                    c13806c = c13806c4;
                                    c11219c119.m12462f(c11219c119.m12467k(c13806c1111), c11221eM12467k114, 0, 5);
                                    this.f43706I0 = null;
                                }
                                weakReference4 = this.f43708K0;
                                if (weakReference4 == null) {
                                }
                                c11219c.m12471p();
                                z13 = true;
                                r24 = r26;
                            } else {
                                r26 = r12;
                                weakReference2 = this.f43707J0;
                                if (weakReference2 != null) {
                                    C13806c c13806c1112 = (C13806c) this.f43707J0.get();
                                    C11221e c11221eM12467k115 = c11219c.m12467k(this.f43641M);
                                    C11219c c11219c1110 = this.f43717x0;
                                    c11219c1110.m12462f(c11221eM12467k115, c11219c1110.m12467k(c13806c1112), 0, 5);
                                    this.f43707J0 = null;
                                }
                                weakReference3 = this.f43706I0;
                                if (weakReference3 != null) {
                                    C13806c c13806c1113 = (C13806c) this.f43706I0.get();
                                    c13806c4 = c13806c;
                                    C11221e c11221eM12467k116 = c11219c.m12467k(c13806c4);
                                    C11219c c11219c1111 = this.f43717x0;
                                    c13806c = c13806c4;
                                    c11219c1111.m12462f(c11219c1111.m12467k(c13806c1113), c11221eM12467k116, 0, 5);
                                    this.f43706I0 = null;
                                }
                                weakReference4 = this.f43708K0;
                                if (weakReference4 == null) {
                                }
                                c11219c.m12471p();
                                z13 = true;
                                r24 = r26;
                            }
                            zArr = AbstractC13813j.f43782a;
                            if (z13) {
                                zArr[2] = false;
                                zM15402a1 = m15402a0(64);
                                mo15373T(c11219c, zM15402a1);
                                size = this.f43711r0.size();
                                i22 = 0;
                                z20 = false;
                                while (i22 < size) {
                                    c13807d = (C13807d) this.f43711r0.get(i22);
                                    c13807d.mo15373T(c11219c, zM15402a1);
                                    boolean z215 = zM15402a1;
                                    int i67 = size;
                                    if (c13807d.f43669h == -1) {
                                        z20 = true;
                                    } else {
                                        z20 = true;
                                    }
                                    i22++;
                                    zM15402a1 = z215;
                                    size = i67;
                                    z20 = z20;
                                }
                                z14 = z20;
                            } else {
                                mo15373T(c11219c, zM15402a0);
                                while (i19 < i15) {
                                    ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                                }
                                z14 = false;
                            }
                            if (z11) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i21 < i15) {
                                    C13807d c13807d110 = (C13807d) this.f43711r0.get(i21);
                                    iMax3 = Math.max(iMax3, c13807d110.m15387r() + c13807d110.f43654Z);
                                    iMax4 = Math.max(iMax4, c13807d110.m15383l() + c13807d110.f43656a0);
                                }
                                iMax5 = Math.max(this.f43660c0, iMax3);
                                iMax6 = Math.max(this.f43662d0, iMax4);
                                z14 = z14;
                                r24 = r24;
                                if (i14 == 2) {
                                    z14 = z14;
                                    r24 = r24;
                                    m15371R(iMax5);
                                    r23[0] = 2;
                                    z14 = true;
                                    r24 = 1;
                                }
                                if (i12 == 2) {
                                    m15366M(iMax6);
                                    r23[1] = 2;
                                    z14 = true;
                                    r24 = 1;
                                }
                            }
                            iMax = Math.max(this.f43660c0, m15387r());
                            if (iMax > m15387r()) {
                                m15371R(iMax);
                                r6 = 1;
                                r23[0] = 1;
                                z15 = true;
                                r18 = 1;
                            } else {
                                r6 = 1;
                                r18 = r24;
                                z15 = z14;
                            }
                            iMax2 = Math.max(this.f43662d0, m15383l());
                            if (iMax2 > m15383l()) {
                                m15366M(iMax2);
                                r23[r6] = r6;
                                r15 = r6;
                                z16 = r15 == true ? 1 : 0;
                            } else {
                                r10 = r18;
                            }
                            if (r10 == 0) {
                                z16 = z15;
                                if (r23[0] == 2) {
                                    r14 = r10;
                                    z19 = z16;
                                    if (m15387r() > i13) {
                                        this.f43703F0 = r6;
                                        r23[0] = r6;
                                        m15371R(i13);
                                        ?? r213 = r6;
                                        z19 = r213 == true ? 1 : 0;
                                        r14 = r213;
                                    }
                                }
                                r10 = r15;
                                r14 = r10;
                                r14 = r10;
                                z19 = z16;
                                z19 = z16;
                                r11 = r14;
                                r11 = r14;
                                z17 = z19;
                                z17 = z19;
                                if (r23[r6] != 2) {
                                }
                                if (i18 > i20) {
                                    r11 = r14;
                                    z17 = z19;
                                    z18 = false;
                                } else {
                                    r11 = r14;
                                    z17 = z19;
                                }
                                z12 = z18;
                                i17 = i18;
                                r12 = r13;
                            } else {
                                z16 = z15;
                                r10 = r15;
                                r11 = r10;
                                z17 = z16;
                            }
                            r11 = r14;
                            z17 = z19;
                            r13 = r11;
                            z18 = z17;
                            i20 = 8;
                            if (i18 > i20) {
                                r11 = r14;
                                z17 = z19;
                                z18 = false;
                            } else {
                                r11 = r14;
                                z17 = z19;
                            }
                            z12 = z18;
                            i17 = i18;
                            r12 = r13;
                        }
                        r21 = r12;
                        this.f43711r0 = arrayList14;
                        if (r21 != 0) {
                            r23[0] = i14;
                            r23[1] = i12;
                        }
                        mo15362G(c11219c.f33959l);
                    }
                    c11219c = c11219c4;
                }
                i12 = i25;
                i13 = i24;
                i14 = i26;
            }
        }
        z6 = false;
        if (m15402a0(64)) {
            z10 = true;
        } else {
            z10 = true;
        }
        c11219c.getClass();
        c11219c.f33954g = false;
        if (this.f43702E0 == 0) {
            c9 = 1;
        } else {
            c9 = 1;
        }
        ArrayList arrayList15 = this.f43711r0;
        if (r23[0] != 2) {
            z11 = true;
        } else {
            z11 = true;
        }
        this.f43698A0 = 0;
        this.f43699B0 = 0;
        i15 = i11;
        while (i16 < i15) {
            c13807d2 = (C13807d) this.f43711r0.get(i16);
            if (c13807d2 instanceof C13808e) {
                ((C13808e) c13807d2).m15400X();
            }
        }
        zM15402a0 = m15402a0(64);
        r12 = z6;
        i17 = 0;
        z12 = true;
        while (z12) {
            i18 = i17 + 1;
            c11219c.m12475t();
            this.f43698A0 = 0;
            this.f43699B0 = 0;
            m15379h(c11219c);
            while (i23 < i15) {
                ((C13807d) this.f43711r0.get(i23)).m15379h(c11219c);
            }
            m15398V(c11219c);
            weakReference = this.f43705H0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    C13806c c13806c1114 = (C13806c) this.f43705H0.get();
                    c13806c3 = c13806c2;
                    C11221e c11221eM12467k117 = c11219c.m12467k(c13806c3);
                    C11219c c11219c1112 = this.f43717x0;
                    r26 = r12;
                    c13806c2 = c13806c3;
                    c11219c1112.m12462f(c11219c1112.m12467k(c13806c1114), c11221eM12467k117, 0, 5);
                    this.f43705H0 = null;
                    r26 = r26;
                } else {
                    r26 = r12;
                }
                weakReference2 = this.f43707J0;
                if (weakReference2 != null) {
                    C13806c c13806c1115 = (C13806c) this.f43707J0.get();
                    C11221e c11221eM12467k118 = c11219c.m12467k(this.f43641M);
                    C11219c c11219c1113 = this.f43717x0;
                    c11219c1113.m12462f(c11221eM12467k118, c11219c1113.m12467k(c13806c1115), 0, 5);
                    this.f43707J0 = null;
                }
                weakReference3 = this.f43706I0;
                if (weakReference3 != null) {
                    C13806c c13806c1116 = (C13806c) this.f43706I0.get();
                    c13806c4 = c13806c;
                    C11221e c11221eM12467k119 = c11219c.m12467k(c13806c4);
                    C11219c c11219c1114 = this.f43717x0;
                    c13806c = c13806c4;
                    c11219c1114.m12462f(c11219c1114.m12467k(c13806c1116), c11221eM12467k119, 0, 5);
                    this.f43706I0 = null;
                }
                weakReference4 = this.f43708K0;
                if (weakReference4 == null) {
                }
                c11219c.m12471p();
                z13 = true;
                r24 = r26;
            } else {
                r26 = r12;
                weakReference2 = this.f43707J0;
                if (weakReference2 != null) {
                    C13806c c13806c1117 = (C13806c) this.f43707J0.get();
                    C11221e c11221eM12467k1110 = c11219c.m12467k(this.f43641M);
                    C11219c c11219c1115 = this.f43717x0;
                    c11219c1115.m12462f(c11221eM12467k1110, c11219c1115.m12467k(c13806c1117), 0, 5);
                    this.f43707J0 = null;
                }
                weakReference3 = this.f43706I0;
                if (weakReference3 != null) {
                    C13806c c13806c1118 = (C13806c) this.f43706I0.get();
                    c13806c4 = c13806c;
                    C11221e c11221eM12467k1111 = c11219c.m12467k(c13806c4);
                    C11219c c11219c1116 = this.f43717x0;
                    c13806c = c13806c4;
                    c11219c1116.m12462f(c11219c1116.m12467k(c13806c1118), c11221eM12467k1111, 0, 5);
                    this.f43706I0 = null;
                }
                weakReference4 = this.f43708K0;
                if (weakReference4 == null) {
                }
                c11219c.m12471p();
                z13 = true;
                r24 = r26;
            }
            zArr = AbstractC13813j.f43782a;
            if (z13) {
                zArr[2] = false;
                zM15402a1 = m15402a0(64);
                mo15373T(c11219c, zM15402a1);
                size = this.f43711r0.size();
                i22 = 0;
                z20 = false;
                while (i22 < size) {
                    c13807d = (C13807d) this.f43711r0.get(i22);
                    c13807d.mo15373T(c11219c, zM15402a1);
                    boolean z216 = zM15402a1;
                    int i68 = size;
                    if (c13807d.f43669h == -1) {
                        z20 = true;
                    } else {
                        z20 = true;
                    }
                    i22++;
                    zM15402a1 = z216;
                    size = i68;
                    z20 = z20;
                }
                z14 = z20;
            } else {
                mo15373T(c11219c, zM15402a0);
                while (i19 < i15) {
                    ((C13807d) this.f43711r0.get(i19)).mo15373T(c11219c, zM15402a0);
                }
                z14 = false;
            }
            if (z11) {
                iMax3 = 0;
                iMax4 = 0;
                while (i21 < i15) {
                    C13807d c13807d111 = (C13807d) this.f43711r0.get(i21);
                    iMax3 = Math.max(iMax3, c13807d111.m15387r() + c13807d111.f43654Z);
                    iMax4 = Math.max(iMax4, c13807d111.m15383l() + c13807d111.f43656a0);
                }
                iMax5 = Math.max(this.f43660c0, iMax3);
                iMax6 = Math.max(this.f43662d0, iMax4);
                z14 = z14;
                r24 = r24;
                if (i14 == 2) {
                    z14 = z14;
                    r24 = r24;
                    m15371R(iMax5);
                    r23[0] = 2;
                    z14 = true;
                    r24 = 1;
                }
                if (i12 == 2) {
                    m15366M(iMax6);
                    r23[1] = 2;
                    z14 = true;
                    r24 = 1;
                }
            }
            iMax = Math.max(this.f43660c0, m15387r());
            if (iMax > m15387r()) {
                m15371R(iMax);
                r6 = 1;
                r23[0] = 1;
                z15 = true;
                r18 = 1;
            } else {
                r6 = 1;
                r18 = r24;
                z15 = z14;
            }
            iMax2 = Math.max(this.f43662d0, m15383l());
            if (iMax2 > m15383l()) {
                m15366M(iMax2);
                r23[r6] = r6;
                r15 = r6;
                z16 = r15 == true ? 1 : 0;
            } else {
                r10 = r18;
            }
            if (r10 == 0) {
                z16 = z15;
                if (r23[0] == 2) {
                    r14 = r10;
                    z19 = z16;
                    if (m15387r() > i13) {
                        this.f43703F0 = r6;
                        r23[0] = r6;
                        m15371R(i13);
                        ?? r214 = r6;
                        z19 = r214 == true ? 1 : 0;
                        r14 = r214;
                    }
                }
                r10 = r15;
                r14 = r10;
                r14 = r10;
                z19 = z16;
                z19 = z16;
                r11 = r14;
                r11 = r14;
                z17 = z19;
                z17 = z19;
                if (r23[r6] != 2) {
                }
                if (i18 > i20) {
                    r11 = r14;
                    z17 = z19;
                    z18 = false;
                } else {
                    r11 = r14;
                    z17 = z19;
                }
                z12 = z18;
                i17 = i18;
                r12 = r13;
            } else {
                z16 = z15;
                r10 = r15;
                r11 = r10;
                z17 = z16;
            }
            r11 = r14;
            z17 = z19;
            r13 = r11;
            z18 = z17;
            i20 = 8;
            if (i18 > i20) {
                r11 = r14;
                z17 = z19;
                z18 = false;
            } else {
                r11 = r14;
                z17 = z19;
            }
            z12 = z18;
            i17 = i18;
            r12 = r13;
        }
        r21 = r12;
        this.f43711r0 = arrayList15;
        if (r21 != 0) {
            r23[0] = i14;
            r23[1] = i12;
        }
        mo15362G(c11219c.f33959l);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:341:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x03af A[SYNTHETIC] */
    /* JADX INFO: renamed from: Y */
    public final void m15401Y(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z6;
        InterfaceC14373c interfaceC14373c;
        int i17;
        boolean zM15399W;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c9;
        ArrayList arrayList;
        int i23;
        int i24;
        InterfaceC14373c interfaceC14373c2;
        int i25;
        C14382l c14382l;
        C14384n c14384n;
        int i26;
        int i27;
        int i28;
        int[] iArr;
        int i29;
        int i30;
        boolean z10;
        Iterator it;
        boolean z11;
        AbstractC14386p abstractC14386p;
        this.f43718y0 = i15;
        this.f43719z0 = i16;
        C11242m c11242m = this.f43712s0;
        c11242m.getClass();
        InterfaceC14373c interfaceC14373c3 = this.f43715v0;
        int size = this.f43711r0.size();
        int iM15387r = m15387r();
        int iM15383l = m15383l();
        boolean zM15419c = AbstractC13813j.m15419c(i10, 128);
        boolean z12 = zM15419c || AbstractC13813j.m15419c(i10, 64);
        if (z12) {
            for (int i31 = 0; i31 < size; i31++) {
                C13807d c13807d = (C13807d) this.f43711r0.get(i31);
                int[] iArr2 = c13807d.f43688q0;
                boolean z13 = (iArr2[0] == 3) && (iArr2[1] == 3) && c13807d.f43652X > 0.0f;
                if ((c13807d.m15394y() && z13) || ((c13807d.m15395z() && z13) || (c13807d instanceof C13810g) || c13807d.m15394y() || c13807d.m15395z())) {
                    z12 = false;
                    break;
                }
            }
        }
        boolean z14 = z12 & ((i11 == 1073741824 && i13 == 1073741824) || zM15419c);
        if (z14) {
            int[] iArr3 = this.f43632D;
            int iMin = Math.min(iArr3[0], i12);
            int iMin2 = Math.min(iArr3[1], i14);
            if (i11 == 1073741824 && m15387r() != iMin) {
                m15371R(iMin);
                this.f43713t0.f1983b = true;
            }
            if (i13 == 1073741824 && m15383l() != iMin2) {
                m15366M(iMin2);
                this.f43713t0.f1983b = true;
            }
            C0681o c0681o = this.f43713t0;
            if (i11 == 1073741824 && i13 == 1073741824) {
                boolean z15 = c0681o.f1983b;
                C13808e c13808e = (C13808e) c0681o.f1985d;
                if (z15 || c0681o.f1984c) {
                    for (C13807d c13807d2 : c13808e.f43711r0) {
                        c13807d2.m15380i();
                        c13807d2.f43655a = false;
                        c13807d2.f43661d.m15876n();
                        c13807d2.f43663e.m15879m();
                    }
                    c13808e.m15380i();
                    c13808e.f43655a = false;
                    c13808e.f43661d.m15876n();
                    c13808e.f43663e.m15879m();
                    c0681o.f1984c = false;
                }
                c0681o.m1455b((C13808e) c0681o.f1986e);
                c13808e.f43654Z = 0;
                c13808e.f43656a0 = 0;
                int iM15382k = c13808e.m15382k(0);
                int iM15382k2 = c13808e.m15382k(1);
                if (c0681o.f1983b) {
                    c0681o.m1456c();
                }
                int iM15388s = c13808e.m15388s();
                int iM15389t = c13808e.m15389t();
                z6 = z14;
                c13808e.f43661d.f45111h.mo15863d(iM15388s);
                c13808e.f43663e.f45111h.mo15863d(iM15389t);
                c0681o.m1460g();
                ArrayList<AbstractC14386p> arrayList2 = (ArrayList) c0681o.f1987f;
                interfaceC14373c = interfaceC14373c3;
                if (iM15382k == 2 || iM15382k2 == 2) {
                    if (zM15419c) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC14386p) it2.next()).mo15819k()) {
                                zM15419c = false;
                                break;
                            }
                        }
                    }
                    if (zM15419c && iM15382k == 2) {
                        c13808e.m15367N(1);
                        c13808e.m15371R(c0681o.m1457d(c13808e, 0));
                        c13808e.f43661d.f45108e.mo15863d(c13808e.m15387r());
                    }
                    if (zM15419c && iM15382k2 == 2) {
                        i28 = 1;
                        c13808e.m15369P(1);
                        c13808e.m15366M(c0681o.m1457d(c13808e, 1));
                        c13808e.f43663e.f45108e.mo15863d(c13808e.m15383l());
                    }
                    iArr = c13808e.f43688q0;
                    i17 = iM15383l;
                    i29 = iArr[0];
                    if (i29 != i28 || i29 == 4) {
                        int iM15387r2 = c13808e.m15387r() + iM15388s;
                        c13808e.f43661d.f45112i.mo15863d(iM15387r2);
                        c13808e.f43661d.f45108e.mo15863d(iM15387r2 - iM15388s);
                        c0681o.m1460g();
                        i30 = iArr[1];
                        if (i30 != 1 || i30 == 4) {
                            int iM15383l2 = c13808e.m15383l() + iM15389t;
                            c13808e.f43663e.f45112i.mo15863d(iM15383l2);
                            c13808e.f43663e.f45108e.mo15863d(iM15383l2 - iM15389t);
                        }
                        c0681o.m1460g();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    for (AbstractC14386p abstractC14386p2 : arrayList2) {
                        if (abstractC14386p2.f45105b == c13808e || abstractC14386p2.f45110g) {
                            abstractC14386p2.mo15816e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z11 = true;
                            break;
                        }
                        abstractC14386p = (AbstractC14386p) it.next();
                        if (!z10 || abstractC14386p.f45105b != c13808e) {
                            if (abstractC14386p.f45111h.f45088j || ((!abstractC14386p.f45112i.f45088j && !(abstractC14386p instanceof C14380j)) || (!abstractC14386p.f45108e.f45088j && !(abstractC14386p instanceof C14374d) && !(abstractC14386p instanceof C14380j)))) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    c13808e.m15367N(iM15382k);
                    c13808e.m15369P(iM15382k2);
                    zM15399W = z11;
                    i27 = 1073741824;
                    i18 = 2;
                } else {
                    iM15387r = iM15387r;
                }
                i28 = 1;
                iArr = c13808e.f43688q0;
                i17 = iM15383l;
                i29 = iArr[0];
                if (i29 != i28) {
                    int iM15387r3 = c13808e.m15387r() + iM15388s;
                    c13808e.f43661d.f45112i.mo15863d(iM15387r3);
                    c13808e.f43661d.f45108e.mo15863d(iM15387r3 - iM15388s);
                    c0681o.m1460g();
                    i30 = iArr[1];
                    if (i30 != 1) {
                        int iM15383l3 = c13808e.m15383l() + iM15389t;
                        c13808e.f43663e.f45112i.mo15863d(iM15383l3);
                        c13808e.f43663e.f45108e.mo15863d(iM15383l3 - iM15389t);
                    } else {
                        int iM15383l4 = c13808e.m15383l() + iM15389t;
                        c13808e.f43663e.f45112i.mo15863d(iM15383l4);
                        c13808e.f43663e.f45108e.mo15863d(iM15383l4 - iM15389t);
                    }
                    c0681o.m1460g();
                    z10 = true;
                } else {
                    int iM15387r4 = c13808e.m15387r() + iM15388s;
                    c13808e.f43661d.f45112i.mo15863d(iM15387r4);
                    c13808e.f43661d.f45108e.mo15863d(iM15387r4 - iM15388s);
                    c0681o.m1460g();
                    i30 = iArr[1];
                    if (i30 != 1) {
                        int iM15383l5 = c13808e.m15383l() + iM15389t;
                        c13808e.f43663e.f45112i.mo15863d(iM15383l5);
                        c13808e.f43663e.f45108e.mo15863d(iM15383l5 - iM15389t);
                    } else {
                        int iM15383l6 = c13808e.m15383l() + iM15389t;
                        c13808e.f43663e.f45112i.mo15863d(iM15383l6);
                        c13808e.f43663e.f45108e.mo15863d(iM15383l6 - iM15389t);
                    }
                    c0681o.m1460g();
                    z10 = true;
                }
                while (r7.hasNext()) {
                    if (abstractC14386p2.f45105b == c13808e) {
                    }
                    abstractC14386p2.mo15816e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z11 = true;
                        break;
                    }
                    abstractC14386p = (AbstractC14386p) it.next();
                    if (!z10) {
                    }
                    if (abstractC14386p.f45111h.f45088j) {
                    }
                    z11 = false;
                    break;
                }
                c13808e.m15367N(iM15382k);
                c13808e.m15369P(iM15382k2);
                zM15399W = z11;
                i27 = 1073741824;
                i18 = 2;
            } else {
                z6 = z14;
                interfaceC14373c = interfaceC14373c3;
                iM15387r = iM15387r;
                i17 = iM15383l;
                boolean z16 = c0681o.f1983b;
                C13808e c13808e2 = (C13808e) c0681o.f1985d;
                if (z16) {
                    for (C13807d c13807d3 : c13808e2.f43711r0) {
                        c13807d3.m15380i();
                        c13807d3.f43655a = false;
                        C14382l c14382l2 = c13807d3.f43661d;
                        c14382l2.f45108e.f45088j = false;
                        c14382l2.f45110g = false;
                        c14382l2.m15876n();
                        C14384n c14384n2 = c13807d3.f43663e;
                        c14384n2.f45108e.f45088j = false;
                        c14384n2.f45110g = false;
                        c14384n2.m15879m();
                    }
                    i26 = 0;
                    c13808e2.m15380i();
                    c13808e2.f43655a = false;
                    C14382l c14382l3 = c13808e2.f43661d;
                    c14382l3.f45108e.f45088j = false;
                    c14382l3.f45110g = false;
                    c14382l3.m15876n();
                    C14384n c14384n3 = c13808e2.f43663e;
                    c14384n3.f45108e.f45088j = false;
                    c14384n3.f45110g = false;
                    c14384n3.m15879m();
                    c0681o.m1456c();
                } else {
                    i26 = 0;
                }
                c0681o.m1455b((C13808e) c0681o.f1986e);
                c13808e2.f43654Z = i26;
                c13808e2.f43656a0 = i26;
                c13808e2.f43661d.f45111h.mo15863d(i26);
                c13808e2.f43663e.f45111h.mo15863d(i26);
                i27 = 1073741824;
                if (i11 == 1073741824) {
                    zM15399W = m15399W(i26, zM15419c);
                    i18 = 1;
                } else {
                    zM15399W = true;
                    i18 = 0;
                }
                if (i13 == 1073741824) {
                    zM15399W &= m15399W(1, zM15419c);
                    i18++;
                }
            }
            if (zM15399W) {
                mo15372S(i11 == i27, i13 == i27);
            }
        } else {
            z6 = z14;
            interfaceC14373c = interfaceC14373c3;
            iM15387r = iM15387r;
            i17 = iM15383l;
            zM15399W = false;
            i18 = 0;
        }
        if (zM15399W && i18 == 2) {
            return;
        }
        int i32 = this.f43702E0;
        if (size > 0) {
            int size2 = this.f43711r0.size();
            boolean zM15402a0 = m15402a0(64);
            InterfaceC14373c interfaceC14373c4 = this.f43715v0;
            for (int i33 = 0; i33 < size2; i33++) {
                C13807d c13807d4 = (C13807d) this.f43711r0.get(i33);
                if (!(c13807d4 instanceof C13811h) && !(c13807d4 instanceof C13804a) && !c13807d4.f43635G && (!zM15402a0 || (c14382l = c13807d4.f43661d) == null || (c14384n = c13807d4.f43663e) == null || !c14382l.f45108e.f45088j || !c14384n.f45108e.f45088j)) {
                    int iM15382k3 = c13807d4.m15382k(0);
                    int iM15382k4 = c13807d4.m15382k(1);
                    boolean z17 = iM15382k3 == 3 && c13807d4.f43690s != 1 && iM15382k4 == 3 && c13807d4.f43691t != 1;
                    if (!z17 && m15402a0(1) && !(c13807d4 instanceof C13810g)) {
                        if (iM15382k3 == 3 && c13807d4.f43690s == 0 && iM15382k4 != 3 && !c13807d4.m15394y()) {
                            z17 = true;
                        }
                        if (iM15382k4 == 3 && c13807d4.f43691t == 0 && iM15382k3 != 3 && !c13807d4.m15394y()) {
                            z17 = true;
                        }
                        if (iM15382k3 == 3 || iM15382k4 == 3) {
                            if (c13807d4.f43652X > 0.0f) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            c11242m.m12605F(0, c13807d4, interfaceC14373c4);
                        }
                    }
                    if (z17) {
                        c11242m.m12605F(0, c13807d4, interfaceC14373c4);
                    }
                }
            }
            interfaceC14373c4.mo10945a();
        }
        c11242m.m12610L(this);
        ArrayList arrayList3 = (ArrayList) c11242m.f34018Y;
        int size3 = arrayList3.size();
        if (size > 0) {
            i19 = iM15387r;
            i20 = i17;
            i21 = 0;
            c11242m.m12608J(this, 0, i19, i20);
        } else {
            i19 = iM15387r;
            i20 = i17;
            i21 = 0;
        }
        if (size3 > 0) {
            int[] iArr4 = this.f43688q0;
            if (iArr4[i21] == 2) {
                c9 = 1;
                i22 = 1;
            } else {
                i22 = i21;
                c9 = 1;
            }
            int i34 = iArr4[c9] == 2 ? 1 : i21;
            int iM15387r5 = m15387r();
            C13808e c13808e3 = (C13808e) c11242m.f34020o0;
            int iMax = Math.max(iM15387r5, c13808e3.f43660c0);
            int iMax2 = Math.max(m15383l(), c13808e3.f43662d0);
            int i35 = i21;
            int i36 = i35;
            while (i35 < size3) {
                C13807d c13807d5 = (C13807d) arrayList3.get(i35);
                if (c13807d5 instanceof C13810g) {
                    int iM15387r6 = c13807d5.m15387r();
                    int iM15383l7 = c13807d5.m15383l();
                    interfaceC14373c2 = interfaceC14373c;
                    int i37 = i36 | (c11242m.m12605F(1, c13807d5, interfaceC14373c2) ? 1 : 0);
                    int iM15387r7 = c13807d5.m15387r();
                    int iM15383l8 = c13807d5.m15383l();
                    if (iM15387r7 != iM15387r6) {
                        c13807d5.m15371R(iM15387r7);
                        if (i22 != 0 && c13807d5.m15388s() + c13807d5.f43650V > iMax) {
                            iMax = Math.max(iMax, c13807d5.mo15381j(4).m15346e() + c13807d5.m15388s() + c13807d5.f43650V);
                        }
                        i25 = 1;
                    } else {
                        i25 = i37;
                    }
                    if (iM15383l8 != iM15383l7) {
                        c13807d5.m15366M(iM15383l8);
                        if (i34 != 0 && c13807d5.m15389t() + c13807d5.f43651W > iMax2) {
                            iMax2 = Math.max(iMax2, c13807d5.mo15381j(5).m15346e() + c13807d5.m15389t() + c13807d5.f43651W);
                        }
                        i25 = 1;
                    }
                    i36 = (((C13810g) c13807d5).f43773z0 ? 1 : 0) | i25;
                } else {
                    interfaceC14373c2 = interfaceC14373c;
                }
                i35++;
                interfaceC14373c = interfaceC14373c2;
                i32 = i32;
            }
            int i38 = i32;
            InterfaceC14373c interfaceC14373c5 = interfaceC14373c;
            int i39 = 2;
            int i40 = 0;
            while (i40 < i39) {
                int i41 = 0;
                while (i41 < size3) {
                    C13807d c13807d6 = (C13807d) arrayList3.get(i41);
                    if (((c13807d6 instanceof AbstractC13812i) && !(c13807d6 instanceof C13810g)) || (c13807d6 instanceof C13811h) || c13807d6.f43670h0 == 8 || ((z6 && c13807d6.f43661d.f45108e.f45088j && c13807d6.f43663e.f45108e.f45088j) || (c13807d6 instanceof C13810g))) {
                        arrayList = arrayList3;
                        i23 = size3;
                        i24 = i36;
                    } else {
                        int iM15387r8 = c13807d6.m15387r();
                        int iM15383l9 = c13807d6.m15383l();
                        arrayList = arrayList3;
                        int i42 = c13807d6.f43658b0;
                        i23 = size3;
                        int i43 = (c11242m.m12605F(i40 == 1 ? 2 : 1, c13807d6, interfaceC14373c5) ? 1 : 0) | i36;
                        int iM15387r9 = c13807d6.m15387r();
                        int iM15383l10 = c13807d6.m15383l();
                        if (iM15387r9 != iM15387r8) {
                            c13807d6.m15371R(iM15387r9);
                            if (i22 != 0 && c13807d6.m15388s() + c13807d6.f43650V > iMax) {
                                iMax = Math.max(iMax, c13807d6.mo15381j(4).m15346e() + c13807d6.m15388s() + c13807d6.f43650V);
                            }
                            i24 = 1;
                        } else {
                            i24 = i43;
                        }
                        if (iM15383l10 != iM15383l9) {
                            c13807d6.m15366M(iM15383l10);
                            if (i34 != 0 && c13807d6.m15389t() + c13807d6.f43651W > iMax2) {
                                iMax2 = Math.max(iMax2, c13807d6.mo15381j(5).m15346e() + c13807d6.m15389t() + c13807d6.f43651W);
                            }
                            i24 = 1;
                        }
                        if (c13807d6.f43634F && i42 != c13807d6.f43658b0) {
                            i24 = 1;
                        }
                    }
                    i41++;
                    arrayList3 = arrayList;
                    size3 = i23;
                    i36 = i24;
                }
                ArrayList arrayList4 = arrayList3;
                int i44 = size3;
                if (i36 == 0) {
                    break;
                }
                i40++;
                c11242m.m12608J(this, i40, i19, i20);
                arrayList3 = arrayList4;
                size3 = i44;
                i39 = 2;
                i36 = 0;
            }
            i32 = i38;
        }
        this.f43702E0 = i32;
        C11219c.f33946p = m15402a0(512);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m15402a0(int i10) {
        return (this.f43702E0 & i10) == i10;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: o */
    public final void mo15386o(StringBuilder sb2) {
        sb2.append(this.f43675k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f43650V);
        sb2.append(sb3.toString());
        sb2.append(Separators.RETURN);
        sb2.append(CxcULo.jyqtEtQRf + this.f43651W);
        sb2.append(Separators.RETURN);
        Iterator it = this.f43711r0.iterator();
        while (it.hasNext()) {
            ((C13807d) it.next()).mo15386o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
