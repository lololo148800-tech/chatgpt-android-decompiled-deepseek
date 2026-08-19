package p698d6;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0010F;
import p003A1.C0284r0;
import p117Eb.C2392v;
import p520V5.C7767E;
import p520V5.C7794w;
import p540W5.C8430a;
import p567X5.InterfaceC9055e;
import p591Y5.AbstractC9653d;
import p591Y5.C9656g;
import p591Y5.C9661l;
import p591Y5.C9664o;
import p591Y5.InterfaceC9650a;
import p604Yk.C10077b;
import p640a6.C10510e;
import p640a6.InterfaceC10511f;
import p658b5.C11242m;
import p660b6.C11252d;
import p675c6.C11671f;
import p692d0.C12962a;
import p692d0.C12967f;
import p779h6.AbstractC14418g;
import p779h6.C14416e;
import p979r2.AbstractC18860a;
import p979r2.AbstractC18863d;

/* JADX INFO: renamed from: d6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13029b implements InterfaceC9055e, InterfaceC9650a, InterfaceC10511f {

    /* JADX INFO: renamed from: A */
    public float f41332A;

    /* JADX INFO: renamed from: B */
    public BlurMaskFilter f41333B;

    /* JADX INFO: renamed from: C */
    public C8430a f41334C;

    /* JADX INFO: renamed from: a */
    public final Path f41335a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f41336b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f41337c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final C8430a f41338d = new C8430a(1, 0);

    /* JADX INFO: renamed from: e */
    public final C8430a f41339e;

    /* JADX INFO: renamed from: f */
    public final C8430a f41340f;

    /* JADX INFO: renamed from: g */
    public final C8430a f41341g;

    /* JADX INFO: renamed from: h */
    public final C8430a f41342h;

    /* JADX INFO: renamed from: i */
    public final RectF f41343i;

    /* JADX INFO: renamed from: j */
    public final RectF f41344j;

    /* JADX INFO: renamed from: k */
    public final RectF f41345k;

    /* JADX INFO: renamed from: l */
    public final RectF f41346l;

    /* JADX INFO: renamed from: m */
    public final RectF f41347m;

    /* JADX INFO: renamed from: n */
    public final Matrix f41348n;

    /* JADX INFO: renamed from: o */
    public final C7794w f41349o;

    /* JADX INFO: renamed from: p */
    public final C13032e f41350p;

    /* JADX INFO: renamed from: q */
    public final C11242m f41351q;

    /* JADX INFO: renamed from: r */
    public final C9656g f41352r;

    /* JADX INFO: renamed from: s */
    public AbstractC13029b f41353s;

    /* JADX INFO: renamed from: t */
    public AbstractC13029b f41354t;

    /* JADX INFO: renamed from: u */
    public List f41355u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f41356v;

    /* JADX INFO: renamed from: w */
    public final C9664o f41357w;

    /* JADX INFO: renamed from: x */
    public boolean f41358x;

    /* JADX INFO: renamed from: y */
    public boolean f41359y;

    /* JADX INFO: renamed from: z */
    public C8430a f41360z;

    public AbstractC13029b(C7794w c7794w, C13032e c13032e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f41339e = new C8430a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f41340f = new C8430a(mode2);
        C8430a c8430a = new C8430a(1, 0);
        this.f41341g = c8430a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C8430a c8430a2 = new C8430a();
        c8430a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f41342h = c8430a2;
        this.f41343i = new RectF();
        this.f41344j = new RectF();
        this.f41345k = new RectF();
        this.f41346l = new RectF();
        this.f41347m = new RectF();
        this.f41348n = new Matrix();
        this.f41356v = new ArrayList();
        this.f41358x = true;
        this.f41332A = 0.0f;
        this.f41349o = c7794w;
        this.f41350p = c13032e;
        if (c13032e.f41396u == 3) {
            c8430a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c8430a.setXfermode(new PorterDuffXfermode(mode));
        }
        C11252d c11252d = c13032e.f41384i;
        c11252d.getClass();
        C9664o c9664o = new C9664o(c11252d);
        this.f41357w = c9664o;
        c9664o.m10249b(this);
        List list = c13032e.f41383h;
        if (list != null && !list.isEmpty()) {
            C11242m c11242m = new C11242m();
            c11242m.f34020o0 = list;
            c11242m.f34018Y = new ArrayList(list.size());
            c11242m.f34019Z = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((ArrayList) c11242m.f34018Y).add(new C9661l((List) ((C11671f) list.get(i10)).f35355b.f11539Z));
                ((ArrayList) c11242m.f34019Z).add(((C11671f) list.get(i10)).f35356c.mo10670p());
            }
            this.f41351q = c11242m;
            Iterator it = ((ArrayList) c11242m.f34018Y).iterator();
            while (it.hasNext()) {
                ((AbstractC9653d) it.next()).m10230a(this);
            }
            for (AbstractC9653d abstractC9653d : (ArrayList) this.f41351q.f34019Z) {
                m14772d(abstractC9653d);
                abstractC9653d.m10230a(this);
            }
        }
        C13032e c13032e2 = this.f41350p;
        if (c13032e2.f41395t.isEmpty()) {
            if (true != this.f41358x) {
                this.f41358x = true;
                this.f41349o.invalidateSelf();
                return;
            }
            return;
        }
        C9656g c9656g = new C9656g(c13032e2.f41395t);
        this.f41352r = c9656g;
        c9656g.f29083b = true;
        c9656g.m10230a(new InterfaceC9650a() { // from class: d6.a
            @Override // p591Y5.InterfaceC9650a
            /* JADX INFO: renamed from: a */
            public final void mo9610a() {
                AbstractC13029b abstractC13029b = this.f41331a;
                boolean z6 = abstractC13029b.f41352r.m10243k() == 1.0f;
                if (z6 != abstractC13029b.f41358x) {
                    abstractC13029b.f41358x = z6;
                    abstractC13029b.f41349o.invalidateSelf();
                }
            }
        });
        boolean z6 = ((Float) this.f41352r.mo10234e()).floatValue() == 1.0f;
        if (z6 != this.f41358x) {
            this.f41358x = z6;
            this.f41349o.invalidateSelf();
        }
        m14772d(this.f41352r);
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f41349o.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        this.f41343i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m14773h();
        Matrix matrix2 = this.f41348n;
        matrix2.set(matrix);
        if (z6) {
            List list = this.f41355u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC13029b) this.f41355u.get(size)).f41357w.m10252e());
                }
            } else {
                AbstractC13029b abstractC13029b = this.f41354t;
                if (abstractC13029b != null) {
                    matrix2.preConcat(abstractC13029b.f41357w.m10252e());
                }
            }
        }
        matrix2.preConcat(this.f41357w.m10252e());
    }

    /* JADX INFO: renamed from: d */
    public final void m14772d(AbstractC9653d abstractC9653d) {
        if (abstractC9653d == null) {
            return;
        }
        this.f41356v.add(abstractC9653d);
    }

    /* JADX WARN: Code duplicated, block: B:194:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: e */
    public final void mo9613e(Canvas canvas, Matrix matrix, int i10) {
        float f10;
        RectF rectF;
        int i11;
        C8430a c8430a;
        int i12;
        PorterDuff.Mode mode;
        C11242m c11242m;
        int i13;
        int i14;
        int i15;
        Integer num;
        int i16 = 1;
        if (this.f41358x) {
            C13032e c13032e = this.f41350p;
            if (c13032e.f41397v) {
                return;
            }
            m14773h();
            Matrix matrix2 = this.f41336b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.f41355u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((AbstractC13029b) this.f41355u.get(size)).f41357w.m10252e());
            }
            C9664o c9664o = this.f41357w;
            AbstractC9653d abstractC9653d = c9664o.f29135j;
            int iIntValue = (int) ((((i10 / 255.0f) * ((abstractC9653d == null || (num = (Integer) abstractC9653d.mo10234e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            Object[] objArr = this.f41353s != null;
            int i17 = c13032e.f41400y;
            if (objArr != true && !m14778m() && i17 == 1) {
                matrix2.preConcat(c9664o.m10252e());
                mo14775j(canvas, matrix2, iIntValue);
                m14779o();
                return;
            }
            RectF rectF2 = this.f41343i;
            mo9612c(rectF2, matrix2, false);
            if (this.f41353s != null && c13032e.f41396u != 3) {
                RectF rectF3 = this.f41346l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f41353s.mo9612c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(c9664o.m10252e());
            RectF rectF4 = this.f41345k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM14778m = m14778m();
            Path path = this.f41335a;
            C11242m c11242m2 = this.f41351q;
            int i18 = 2;
            if (zM14778m) {
                int size2 = ((List) c11242m2.f34020o0).size();
                int i19 = 0;
                while (true) {
                    if (i19 < size2) {
                        C11671f c11671f = (C11671f) ((List) c11242m2.f34020o0).get(i19);
                        Path path2 = (Path) ((AbstractC9653d) ((ArrayList) c11242m2.f34018Y).get(i19)).mo10234e();
                        if (path2 == null) {
                            i11 = i16;
                        } else {
                            path.set(path2);
                            path.transform(matrix2);
                            int iM24h = AbstractC0010F.m24h(c11671f.f35354a);
                            if (iM24h == 0) {
                                if (c11671f.f35357d) {
                                }
                                rectF = this.f41347m;
                                path.computeBounds(rectF, false);
                                if (i19 == 0) {
                                    rectF4.set(rectF);
                                    i11 = i16;
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                    i11 = 1;
                                }
                            } else if (iM24h != i16) {
                                if (iM24h != i18) {
                                    if (iM24h == 3) {
                                    }
                                    rectF = this.f41347m;
                                    path.computeBounds(rectF, false);
                                    if (i19 == 0) {
                                        rectF4.set(rectF);
                                        i11 = i16;
                                    } else {
                                        rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        i11 = 1;
                                    }
                                } else {
                                    if (c11671f.f35357d) {
                                    }
                                    rectF = this.f41347m;
                                    path.computeBounds(rectF, false);
                                    if (i19 == 0) {
                                        rectF4.set(rectF);
                                        i11 = i16;
                                    } else {
                                        rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        i11 = 1;
                                    }
                                }
                            }
                        }
                        i19 += i11;
                        i16 = i11;
                        size2 = size2;
                        i18 = 2;
                    } else if (!rectF2.intersect(rectF4)) {
                        f10 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f10 = 0.0f;
                    break;
                }
            } else {
                f10 = 0.0f;
            }
            RectF rectF5 = this.f41344j;
            rectF5.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.f41337c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f10, f10, f10, f10);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                C8430a c8430a2 = this.f41338d;
                c8430a2.setAlpha(255);
                int iM24h2 = AbstractC0010F.m24h(i17);
                if (iM24h2 == 1) {
                    i12 = 14;
                } else if (iM24h2 != 2) {
                    i12 = 16;
                    if (iM24h2 != 3) {
                        if (iM24h2 == 4) {
                            i12 = 17;
                        } else if (iM24h2 != 5) {
                            i12 = iM24h2 != 16 ? 0 : 13;
                        } else {
                            i12 = 18;
                        }
                    }
                } else {
                    i12 = 15;
                }
                int i20 = AbstractC18863d.f60090a;
                int i21 = Build.VERSION.SDK_INT;
                if (i21 >= 29) {
                    AbstractC18860a.m20162c(c8430a2, i12 != 0 ? AbstractC18860a.m20160a(i12) : null);
                } else if (i12 != 0) {
                    switch (AbstractC0010F.m24h(i12)) {
                        case 0:
                            mode = PorterDuff.Mode.CLEAR;
                            break;
                        case 1:
                            mode = PorterDuff.Mode.SRC;
                            break;
                        case 2:
                            mode = PorterDuff.Mode.DST;
                            break;
                        case 3:
                            mode = PorterDuff.Mode.SRC_OVER;
                            break;
                        case 4:
                            mode = PorterDuff.Mode.DST_OVER;
                            break;
                        case 5:
                            mode = PorterDuff.Mode.SRC_IN;
                            break;
                        case 6:
                            mode = PorterDuff.Mode.DST_IN;
                            break;
                        case 7:
                            mode = PorterDuff.Mode.SRC_OUT;
                            break;
                        case 8:
                            mode = PorterDuff.Mode.DST_OUT;
                            break;
                        case 9:
                            mode = PorterDuff.Mode.SRC_ATOP;
                            break;
                        case 10:
                            mode = PorterDuff.Mode.DST_ATOP;
                            break;
                        case 11:
                            mode = PorterDuff.Mode.XOR;
                            break;
                        case 12:
                            mode = PorterDuff.Mode.ADD;
                            break;
                        case 13:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 14:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.OVERLAY;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.DARKEN;
                            break;
                        case 17:
                            mode = PorterDuff.Mode.LIGHTEN;
                            break;
                        default:
                            mode = null;
                            break;
                    }
                    c8430a2.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
                } else {
                    c8430a2.setXfermode(null);
                }
                C0284r0 c0284r0 = AbstractC14418g.f45308a;
                canvas.saveLayer(rectF2, c8430a2);
                if (i17 != 2) {
                    m14774i(canvas);
                    c11242m = c11242m2;
                } else {
                    if (this.f41334C == null) {
                        C8430a c8430a3 = new C8430a();
                        this.f41334C = c8430a3;
                        c8430a3.setColor(-1);
                    }
                    c11242m = c11242m2;
                    canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f41334C);
                }
                mo14775j(canvas, matrix2, iIntValue);
                if (m14778m()) {
                    Paint paint = this.f41339e;
                    canvas.saveLayer(rectF2, paint);
                    if (i21 < 28) {
                        m14774i(canvas);
                    }
                    int i22 = 0;
                    while (i22 < ((List) c11242m.f34020o0).size()) {
                        List list = (List) c11242m.f34020o0;
                        C11671f c11671f2 = (C11671f) list.get(i22);
                        ArrayList arrayList = (ArrayList) c11242m.f34018Y;
                        AbstractC9653d abstractC9653d2 = (AbstractC9653d) arrayList.get(i22);
                        AbstractC9653d abstractC9653d3 = (AbstractC9653d) ((ArrayList) c11242m.f34019Z).get(i22);
                        C11242m c11242m3 = c11242m;
                        int iM24h3 = AbstractC0010F.m24h(c11671f2.f35354a);
                        Paint paint2 = this.f41340f;
                        boolean z6 = c11671f2.f35357d;
                        if (iM24h3 != 0) {
                            i14 = iIntValue;
                            if (iM24h3 == 1) {
                                if (i22 == 0) {
                                    c8430a2.setColor(-16777216);
                                    c8430a2.setAlpha(255);
                                    canvas.drawRect(rectF2, c8430a2);
                                }
                                if (z6) {
                                    C0284r0 c0284r1 = AbstractC14418g.f45308a;
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, c8430a2);
                                    paint2.setAlpha((int) (((Integer) abstractC9653d3.mo10234e()).intValue() * 2.55f));
                                    path.set((Path) abstractC9653d2.mo10234e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, paint2);
                                    canvas.restore();
                                } else {
                                    path.set((Path) abstractC9653d2.mo10234e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, paint2);
                                }
                            } else if (iM24h3 != 2) {
                                if (iM24h3 != 3) {
                                    i15 = 1;
                                } else if (!arrayList.isEmpty()) {
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= list.size()) {
                                            c8430a2.setAlpha(255);
                                            canvas.drawRect(rectF2, c8430a2);
                                        } else if (((C11671f) list.get(i23)).f35354a == 4) {
                                            i23++;
                                        }
                                    }
                                }
                                i22 += i15;
                                c11242m = c11242m3;
                                iIntValue = i14;
                            } else if (z6) {
                                C0284r0 c0284r2 = AbstractC14418g.f45308a;
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, c8430a2);
                                paint2.setAlpha((int) (((Integer) abstractC9653d3.mo10234e()).intValue() * 2.55f));
                                path.set((Path) abstractC9653d2.mo10234e());
                                path.transform(matrix2);
                                canvas.drawPath(path, paint2);
                                canvas.restore();
                            } else {
                                C0284r0 c0284r3 = AbstractC14418g.f45308a;
                                canvas.saveLayer(rectF2, paint);
                                path.set((Path) abstractC9653d2.mo10234e());
                                path.transform(matrix2);
                                c8430a2.setAlpha((int) (((Integer) abstractC9653d3.mo10234e()).intValue() * 2.55f));
                                canvas.drawPath(path, c8430a2);
                                canvas.restore();
                            }
                        } else {
                            i14 = iIntValue;
                            if (z6) {
                                C0284r0 c0284r4 = AbstractC14418g.f45308a;
                                canvas.saveLayer(rectF2, c8430a2);
                                canvas.drawRect(rectF2, c8430a2);
                                path.set((Path) abstractC9653d2.mo10234e());
                                path.transform(matrix2);
                                c8430a2.setAlpha((int) (((Integer) abstractC9653d3.mo10234e()).intValue() * 2.55f));
                                canvas.drawPath(path, paint2);
                                canvas.restore();
                            } else {
                                path.set((Path) abstractC9653d2.mo10234e());
                                path.transform(matrix2);
                                c8430a2.setAlpha((int) (((Integer) abstractC9653d3.mo10234e()).intValue() * 2.55f));
                                canvas.drawPath(path, c8430a2);
                            }
                        }
                        i15 = 1;
                        i22 += i15;
                        c11242m = c11242m3;
                        iIntValue = i14;
                    }
                    i13 = iIntValue;
                    canvas.restore();
                } else {
                    i13 = iIntValue;
                }
                if (this.f41353s != null) {
                    canvas.saveLayer(rectF2, this.f41341g);
                    m14774i(canvas);
                    this.f41353s.mo9613e(canvas, matrix, i13);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.f41359y && (c8430a = this.f41360z) != null) {
                c8430a.setStyle(Paint.Style.STROKE);
                this.f41360z.setColor(-251901);
                this.f41360z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.f41360z);
                this.f41360z.setStyle(Paint.Style.FILL);
                this.f41360z.setColor(1357638635);
                canvas.drawRect(rectF2, this.f41360z);
            }
            m14779o();
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public void mo9614f(C15384c c15384c, Object obj) {
        this.f41357w.m10250c(c15384c, obj);
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC13029b abstractC13029b = this.f41353s;
        C13032e c13032e = this.f41350p;
        if (abstractC13029b != null) {
            String str = abstractC13029b.f41350p.f41378c;
            c10510e2.getClass();
            C10510e c10510e3 = new C10510e(c10510e2);
            c10510e3.f31151a.add(str);
            if (c10510e.m10966a(i10, this.f41353s.f41350p.f41378c)) {
                AbstractC13029b abstractC13029b2 = this.f41353s;
                C10510e c10510e4 = new C10510e(c10510e3);
                c10510e4.f31152b = abstractC13029b2;
                arrayList.add(c10510e4);
            }
            if (c10510e.m10969d(i10, c13032e.f41378c)) {
                this.f41353s.mo14781q(c10510e, c10510e.m10967b(i10, this.f41353s.f41350p.f41378c) + i10, arrayList, c10510e3);
            }
        }
        if (c10510e.m10968c(i10, c13032e.f41378c)) {
            String str2 = c13032e.f41378c;
            if (!"__container".equals(str2)) {
                c10510e2.getClass();
                C10510e c10510e5 = new C10510e(c10510e2);
                c10510e5.f31151a.add(str2);
                if (c10510e.m10966a(i10, str2)) {
                    C10510e c10510e6 = new C10510e(c10510e5);
                    c10510e6.f31152b = this;
                    arrayList.add(c10510e6);
                }
                c10510e2 = c10510e5;
            }
            if (c10510e.m10969d(i10, str2)) {
                mo14781q(c10510e, c10510e.m10967b(i10, str2) + i10, arrayList, c10510e2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14773h() {
        if (this.f41355u != null) {
            return;
        }
        if (this.f41354t == null) {
            this.f41355u = Collections.emptyList();
            return;
        }
        this.f41355u = new ArrayList();
        for (AbstractC13029b abstractC13029b = this.f41354t; abstractC13029b != null; abstractC13029b = abstractC13029b.f41354t) {
            this.f41355u.add(abstractC13029b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14774i(Canvas canvas) {
        RectF rectF = this.f41343i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f41342h);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo14775j(Canvas canvas, Matrix matrix, int i10);

    /* JADX INFO: renamed from: k */
    public C10077b mo14776k() {
        return this.f41350p.f41398w;
    }

    /* JADX INFO: renamed from: l */
    public C2392v mo14777l() {
        return this.f41350p.f41399x;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14778m() {
        C11242m c11242m = this.f41351q;
        return (c11242m == null || ((ArrayList) c11242m.f34018Y).isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public final void m14779o() {
        C7767E c7767e = this.f41349o.f24658Y.f24580a;
        String str = this.f41350p.f41378c;
        if (c7767e.f24548a) {
            HashMap map = c7767e.f24550c;
            C14416e c14416e = (C14416e) map.get(str);
            if (c14416e == null) {
                c14416e = new C14416e();
                map.put(str, c14416e);
            }
            int i10 = c14416e.f45306a + 1;
            c14416e.f45306a = i10;
            if (i10 == Integer.MAX_VALUE) {
                c14416e.f45306a = i10 / 2;
            }
            if (str.equals("__container")) {
                C12967f c12967f = c7767e.f24549b;
                c12967f.getClass();
                C12962a c12962a = new C12962a(c12967f);
                if (c12962a.hasNext()) {
                    c12962a.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14780p(AbstractC9653d abstractC9653d) {
        this.f41356v.remove(abstractC9653d);
    }

    /* JADX INFO: renamed from: r */
    public void mo14782r(boolean z6) {
        if (z6 && this.f41360z == null) {
            this.f41360z = new C8430a();
        }
        this.f41359y = z6;
    }

    /* JADX INFO: renamed from: s */
    public void mo14783s(float f10) {
        C9664o c9664o = this.f41357w;
        AbstractC9653d abstractC9653d = c9664o.f29135j;
        if (abstractC9653d != null) {
            abstractC9653d.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d2 = c9664o.f29138m;
        if (abstractC9653d2 != null) {
            abstractC9653d2.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d3 = c9664o.f29139n;
        if (abstractC9653d3 != null) {
            abstractC9653d3.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d4 = c9664o.f29131f;
        if (abstractC9653d4 != null) {
            abstractC9653d4.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d5 = c9664o.f29132g;
        if (abstractC9653d5 != null) {
            abstractC9653d5.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d6 = c9664o.f29133h;
        if (abstractC9653d6 != null) {
            abstractC9653d6.mo10238i(f10);
        }
        AbstractC9653d abstractC9653d7 = c9664o.f29134i;
        if (abstractC9653d7 != null) {
            abstractC9653d7.mo10238i(f10);
        }
        C9656g c9656g = c9664o.f29136k;
        if (c9656g != null) {
            c9656g.mo10238i(f10);
        }
        C9656g c9656g2 = c9664o.f29137l;
        if (c9656g2 != null) {
            c9656g2.mo10238i(f10);
        }
        C11242m c11242m = this.f41351q;
        int i10 = 0;
        if (c11242m != null) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c11242m.f34018Y;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((AbstractC9653d) arrayList.get(i11)).mo10238i(f10);
                i11++;
            }
        }
        C9656g c9656g3 = this.f41352r;
        if (c9656g3 != null) {
            c9656g3.mo10238i(f10);
        }
        AbstractC13029b abstractC13029b = this.f41353s;
        if (abstractC13029b != null) {
            abstractC13029b.mo14783s(f10);
        }
        while (true) {
            ArrayList arrayList2 = this.f41356v;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((AbstractC9653d) arrayList2.get(i10)).mo10238i(f10);
            i10++;
        }
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
    }

    /* JADX INFO: renamed from: q */
    public void mo14781q(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
    }
}
