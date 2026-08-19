package p057C3;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.javax.sip.C10808o;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import io.sentry.hints.C15370i;
import io.sentry.instrumentation.file.C15379d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import p003A1.C0284r0;
import p030B2.AbstractC0718B;
import p083D3.C1868f;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1061vb.C20513d;
import p1073w3.AbstractC20817s;
import p1073w3.C20815q;
import p1139z0.C21585H;
import p1142z3.InterfaceC21730C;
import p117Eb.C2392v;
import p133F3.C2657c;
import p133F3.C2658d;
import p140Fa.C2685e;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p140Fa.C2693m;
import p140Fa.C2700t;
import p140Fa.InterfaceC2683c;
import p178H.AbstractC3182z;
import p178H.C3124Q;
import p178H.C3143f;
import p178H.C3150i0;
import p178H.C3152j0;
import p178H.InterfaceC3127U;
import p202I.C3526b;
import p202I.C3527c;
import p202I.C3528d;
import p202I.C3535k;
import p228J.C3847l0;
import p228J.InterfaceC3854p;
import p232J3.AbstractC4226a;
import p232J3.C4202B;
import p232J3.C4222W;
import p232J3.C4245q;
import p232J3.C4248t;
import p232J3.InterfaceC4251w;
import p232J3.InterfaceC4254z;
import p253K.AbstractC4503n;
import p253K.C4494e;
import p277L.ExecutorC4836i;
import p283L5.AbstractC4941g;
import p348O.AbstractC5939a;
import p414R.C6768b;
import p451Sb.C7102a;
import p499U9.C7591u;
import p523V9.AbstractC8064c6;
import p523V9.AbstractC8143m5;
import p525Vb.C8258a;
import p538W2.C8422g;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9288g0;
import p720e6.C13287b;
import p720e6.C13288c;
import p817j$.util.Objects;
import p959q8.C18639a;
import p960q9.C18655i;

/* JADX INFO: renamed from: C3.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1546Y {

    /* JADX INFO: renamed from: a */
    public boolean f4237a;

    /* JADX INFO: renamed from: b */
    public final Object f4238b;

    /* JADX INFO: renamed from: c */
    public Object f4239c;

    /* JADX INFO: renamed from: d */
    public Object f4240d;

    /* JADX INFO: renamed from: e */
    public Object f4241e;

    /* JADX INFO: renamed from: f */
    public Object f4242f;

    /* JADX INFO: renamed from: g */
    public Object f4243g;

    /* JADX INFO: renamed from: h */
    public Object f4244h;

    /* JADX INFO: renamed from: i */
    public Object f4245i;

    /* JADX INFO: renamed from: j */
    public Object f4246j;

    /* JADX INFO: renamed from: k */
    public Object f4247k;

    /* JADX INFO: renamed from: l */
    public Object f4248l;

    public C1546Y(Executor executor) {
        C3847l0 c3847l0 = AbstractC5939a.f19323a;
        if (AbstractC5939a.f19323a.m4579f(LowMemoryQuirk.class) != null) {
            this.f4238b = new ExecutorC4836i(executor);
        } else {
            this.f4238b = executor;
        }
        this.f4248l = c3847l0;
        this.f4237a = c3847l0.m4578e(IncorrectJpegMetadataQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC19764N m2361a(int i10, ArrayList arrayList, C4222W c4222w) {
        if (!arrayList.isEmpty()) {
            this.f4247k = c4222w;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                C1545X c1545x = (C1545X) arrayList.get(i11 - i10);
                ArrayList arrayList2 = (ArrayList) this.f4239c;
                if (i11 > 0) {
                    C1545X c1545x2 = (C1545X) arrayList2.get(i11 - 1);
                    c1545x.f4235d = c1545x2.f4232a.f13886o.f13864b.mo2420o() + c1545x2.f4235d;
                    c1545x.f4236e = false;
                    c1545x.f4234c.clear();
                } else {
                    c1545x.f4235d = 0;
                    c1545x.f4236e = false;
                    c1545x.f4234c.clear();
                }
                int iMo2420o = c1545x.f4232a.f13886o.f13864b.mo2420o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((C1545X) arrayList2.get(i12)).f4235d += iMo2420o;
                }
                arrayList2.add(i11, c1545x);
                ((HashMap) this.f4241e).put(c1545x.f4233b, c1545x);
                if (this.f4237a) {
                    m2367g(c1545x);
                    if (((IdentityHashMap) this.f4240d).isEmpty()) {
                        ((HashSet) this.f4244h).add(c1545x);
                    } else {
                        C1544W c1544w = (C1544W) ((HashMap) this.f4242f).get(c1545x);
                        if (c1544w != null) {
                            c1544w.f4229a.m4988b(c1544w.f4230b);
                        }
                    }
                }
            }
        }
        return m2363c();
    }

    /* JADX INFO: renamed from: b */
    public void m2362b(C2691k c2691k, float f10, RectF rectF, C10808o c10808o, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C2700t[] c2700tArr;
        int i10;
        float[] fArr;
        C2685e c2685e;
        InterfaceC2683c interfaceC2683c;
        AbstractC8143m5 abstractC8143m5;
        C1546Y c1546y = this;
        path.rewind();
        Path path2 = (Path) c1546y.f4242f;
        path2.rewind();
        Path path3 = (Path) c1546y.f4243g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = (Matrix[]) c1546y.f4240d;
            matrixArr2 = (Matrix[]) c1546y.f4239c;
            c2700tArr = (C2700t[]) c1546y.f4238b;
            i10 = 4;
            fArr = (float[]) c1546y.f4245i;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                interfaceC2683c = c2691k.f8280g;
            } else if (i11 != 2) {
                interfaceC2683c = i11 != 3 ? c2691k.f8279f : c2691k.f8278e;
            } else {
                interfaceC2683c = c2691k.f8281h;
            }
            if (i11 == 1) {
                abstractC8143m5 = c2691k.f8276c;
            } else if (i11 != 2) {
                abstractC8143m5 = i11 != 3 ? c2691k.f8275b : c2691k.f8274a;
            } else {
                abstractC8143m5 = c2691k.f8277d;
            }
            C2700t c2700t = c2700tArr[i11];
            abstractC8143m5.getClass();
            abstractC8143m5.mo3658b(c2700t, f10, interfaceC2683c.mo3657a(rectF));
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = (PointF) c1546y.f4241e;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            C2700t c2700t2 = c2700tArr[i11];
            fArr[0] = c2700t2.f8306b;
            fArr[1] = c2700t2.f8307c;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < i10) {
            C2700t c2700t3 = c2700tArr[i13];
            c2700t3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c2700t3.f8305a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c2700tArr[i13].m3699b(matrixArr2[i13], path);
            if (c10808o != null) {
                C2700t c2700t4 = c2700tArr[i13];
                Matrix matrix = matrixArr2[i13];
                C2687g c2687g = (C2687g) c10808o.f32040Z;
                BitSet bitSet = c2687g.f8249p0;
                c2700t4.getClass();
                bitSet.set(i13, false);
                c2700t4.m3698a(c2700t4.f8309e);
                c2687g.f8247Z[i13] = new C2693m(new ArrayList((ArrayList) c2700t4.f8311g), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            C2700t c2700t5 = c2700tArr[i13];
            fArr[0] = c2700t5.f8306b;
            fArr[1] = c2700t5.f8307c;
            matrixArr2[i13].mapPoints(fArr);
            C2700t c2700t6 = c2700tArr[i15];
            c2700t6.getClass();
            float[] fArr2 = (float[]) c1546y.f4246j;
            fArr2[0] = 0.0f;
            fArr2[1] = c2700t6.f8305a;
            matrixArr2[i15].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2700t c2700t7 = c2700tArr[i13];
            fArr[0] = c2700t7.f8306b;
            fArr[1] = c2700t7.f8307c;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C2700t c2700t8 = (C2700t) c1546y.f4244h;
            c2700t8.m3701d(0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                c2685e = c2691k.f8284k;
            } else if (i13 != 2) {
                c2685e = i13 != 3 ? c2691k.f8283j : c2691k.f8282i;
            } else {
                c2685e = c2691k.f8285l;
            }
            c2685e.getClass();
            c2700t8.m3700c(fMax, 0.0f);
            Path path4 = (Path) c1546y.f4247k;
            path4.reset();
            c2700t8.m3699b(matrixArr[i13], path4);
            if (c1546y.f4237a && (c1546y.m2366f(path4, i13) || c1546y.m2366f(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c2700t8.f8305a;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c2700t8.m3699b(matrixArr[i13], path2);
            } else {
                c2700t8.m3699b(matrixArr[i13], path);
            }
            if (c10808o != null) {
                Matrix matrix2 = matrixArr[i13];
                C2687g c2687g2 = (C2687g) c10808o.f32040Z;
                c2687g2.f8249p0.set(i13 + 4, false);
                c2700t8.m3698a(c2700t8.f8309e);
                c2687g2.f8248o0[i13] = new C2693m(new ArrayList((ArrayList) c2700t8.f8311g), new Matrix(matrix2));
            }
            i10 = 4;
            c1546y = this;
            i13 = i14;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC19764N m2363c() {
        ArrayList arrayList = (ArrayList) this.f4239c;
        if (arrayList.isEmpty()) {
            return AbstractC19764N.f62601a;
        }
        int iMo2420o = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C1545X c1545x = (C1545X) arrayList.get(i10);
            c1545x.f4235d = iMo2420o;
            iMo2420o += c1545x.f4232a.f13886o.f13864b.mo2420o();
        }
        return new C1557e0(arrayList, (C4222W) this.f4247k);
    }

    /* JADX INFO: renamed from: d */
    public void m2364d() {
        Iterator it = ((HashSet) this.f4244h).iterator();
        while (it.hasNext()) {
            C1545X c1545x = (C1545X) it.next();
            if (c1545x.f4234c.isEmpty()) {
                C1544W c1544w = (C1544W) ((HashMap) this.f4242f).get(c1545x);
                if (c1544w != null) {
                    c1544w.f4229a.m4988b(c1544w.f4230b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2365e(C1545X c1545x) {
        if (c1545x.f4236e && c1545x.f4234c.isEmpty()) {
            C1544W c1544w = (C1544W) ((HashMap) this.f4242f).remove(c1545x);
            c1544w.getClass();
            C1541T c1541t = c1544w.f4230b;
            AbstractC4226a abstractC4226a = c1544w.f4229a;
            abstractC4226a.m4996n(c1541t);
            C21585H c21585h = c1544w.f4231c;
            abstractC4226a.m4998q(c21585h);
            abstractC4226a.m4997p(c21585h);
            ((HashSet) this.f4244h).remove(c1545x);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m2366f(Path path, int i10) {
        Path path2 = (Path) this.f4248l;
        path2.reset();
        ((C2700t[]) this.f4238b)[i10].m3699b(((Matrix[]) this.f4239c)[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [C3.T, J3.z] */
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
    /* JADX INFO: renamed from: g */
    public void m2367g(C1545X c1545x) {
        C4248t c4248t = c1545x.f4232a;
        ?? r6 = new InterfaceC4254z() { // from class: C3.T
            @Override // p232J3.InterfaceC4254z
            /* JADX INFO: renamed from: a */
            public final void mo2360a(AbstractC4226a abstractC4226a, AbstractC19764N abstractC19764N) {
                C20815q c20815q = ((C1532J) this.f4216a.f4243g).f4161t0;
                c20815q.m21378d(2);
                c20815q.m21379e(22);
            }
        };
        C21585H c21585h = new C21585H(this, c1545x);
        ((HashMap) this.f4242f).put(c1545x, new C1544W(c4248t, r6, c21585h));
        int i10 = AbstractC20817s.f66106a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c4248t.getClass();
        C2658d c2658d = c4248t.f13809c;
        c2658d.getClass();
        C4202B c4202b = new C4202B();
        c4202b.f13657a = handler;
        c4202b.f13658b = c21585h;
        c2658d.f8170c.add(c4202b);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        C2658d c2658d2 = c4248t.f13810d;
        c2658d2.getClass();
        C2657c c2657c = new C2657c();
        c2657c.f8167a = c21585h;
        c2658d2.f8170c.add(c2657c);
        c4248t.m4994j(r6, (InterfaceC21730C) this.f4248l, (C1875m) this.f4238b);
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC3127U m2368h(C3528d c3528d) {
        C3535k c3535k = c3528d.f10668a;
        C6768b c6768b = (C6768b) ((C18639a) this.f4240d).m19999h(c3528d);
        if ((c6768b.f21710c == 35 || this.f4237a) && ((C3527c) this.f4239c).f10667d == 256) {
            C6768b c6768b2 = (C6768b) ((C18655i) this.f4241e).m20027g(new C3526b(c6768b, c3535k.f10693e));
            ((C8258a) this.f4246j).getClass();
            Size size = c6768b2.f21711d;
            C3150i0 c3150i0 = new C3150i0(AbstractC8064c6.m8472c(size.getWidth(), size.getHeight(), 256, 2));
            InterfaceC3127U interfaceC3127UM11183b = ImageProcessingUtil.m11183b(c3150i0, (byte[]) c6768b2.f21708a);
            c3150i0.m3987a();
            Objects.requireNonNull(interfaceC3127UM11183b);
            C4494e c4494e = c6768b2.f21709b;
            Objects.requireNonNull(c4494e);
            Matrix matrix = c6768b2.f21714g;
            AbstractC3182z abstractC3182z = (AbstractC3182z) interfaceC3127UM11183b;
            Size size2 = new Size(abstractC3182z.getWidth(), abstractC3182z.getHeight());
            abstractC3182z.mo3969t();
            c6768b = new C6768b(interfaceC3127UM11183b, c4494e, abstractC3182z.mo3969t(), size2, c6768b2.f21712e, c6768b2.f21713f, matrix, c6768b2.f21715h);
        }
        ((C15370i) this.f4245i).getClass();
        InterfaceC3127U interfaceC3127U = (InterfaceC3127U) c6768b.f21708a;
        C3152j0 c3152j0 = new C3152j0(interfaceC3127U, c6768b.f21711d, new C3143f(interfaceC3127U.mo3968k0().mo3964c(), interfaceC3127U.mo3968k0().mo3966f(), c6768b.f21713f, c6768b.f21714g));
        c3152j0.m3988e(c6768b.f21712e);
        return c3152j0;
    }

    /* JADX INFO: renamed from: i */
    public C13288c m2369i(C3528d c3528d) throws Throwable {
        File fileCreateTempFile;
        int i10;
        Uri uriM7934H = null;
        int i11 = ((C3527c) this.f4239c).f10667d;
        AbstractC4941g.m5554M("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + i11, AbstractC9288g0.m9866c(i11));
        C3535k c3535k = c3528d.f10668a;
        C6768b c6768b = (C6768b) ((C18655i) this.f4241e).m20027g(new C3526b((C6768b) ((C18639a) this.f4240d).m19999h(c3528d), c3535k.f10693e));
        if (AbstractC4503n.m5246b(c6768b.f21712e, c6768b.f21711d)) {
            int i12 = c3535k.f10693e;
            AbstractC4941g.m5559R(null, AbstractC9288g0.m9866c(c6768b.f21710c));
            ((C7102a) this.f4244h).getClass();
            byte[] bArr = (byte[]) c6768b.f21708a;
            try {
                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
                BitmapFactory.Options options = new BitmapFactory.Options();
                Rect rect = c6768b.f21712e;
                Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                C4494e c4494e = c6768b.f21709b;
                Objects.requireNonNull(c4494e);
                Rect rect2 = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                Matrix matrix = c6768b.f21714g;
                RectF rectF = AbstractC4503n.f14693a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                Size size = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                InterfaceC3854p interfaceC3854p = c6768b.f21715h;
                if (interfaceC3854p == null) {
                    throw new NullPointerException("Null cameraCaptureResult");
                }
                ((C20513d) this.f4242f).getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                c6768b = new C6768b(byteArrayOutputStream.toByteArray(), c4494e, (Build.VERSION.SDK_INT < 34 || !AbstractC0718B.m1499j(bitmapDecodeRegion)) ? 256 : 4101, size, rect2, c6768b.f21713f, matrix2, interfaceC3854p);
            } catch (IOException e10) {
                throw new C3124Q("Failed to decode JPEG.", e10);
            }
        }
        C7591u c7591u = (C7591u) this.f4243g;
        C2392v c2392v = c3535k.f10690b;
        Objects.requireNonNull(c2392v);
        c7591u.getClass();
        File file = (File) c2392v.f7436Z;
        try {
            if (file != null) {
                String parent = file.getParent();
                StringBuilder sb2 = new StringBuilder("CameraX");
                sb2.append(UUID.randomUUID().toString());
                String name = file.getName();
                int iLastIndexOf = name.lastIndexOf(46);
                sb2.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
                fileCreateTempFile = new File(parent, sb2.toString());
            } else {
                fileCreateTempFile = File.createTempFile("CameraX", ".tmp");
            }
            byte[] bArr2 = (byte[]) c6768b.f21708a;
            try {
                C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                try {
                    c15379dM9509d.write(bArr2, 0, new C13287b(21).m14904k(bArr2));
                    c15379dM9509d.close();
                    C4494e c4494e2 = c6768b.f21709b;
                    Objects.requireNonNull(c4494e2);
                    try {
                        C0284r0 c0284r0 = C4494e.f14655b;
                        C4494e c4494e3 = new C4494e(new C8422g(fileCreateTempFile.toString()));
                        c4494e2.m5227a(c4494e3);
                        if (c4494e3.m5228b() == 0 && (i10 = c6768b.f21713f) != 0) {
                            c4494e3.m5229c(i10);
                        }
                        try {
                            c4494e3.m5230d();
                            try {
                                if (((Uri) c2392v.f7438p0) != null && ((ContentResolver) c2392v.f7437o0) != null && ((ContentValues) c2392v.f7439q0) != null) {
                                    uriM7934H = C7591u.m7935I(fileCreateTempFile, c2392v);
                                } else if (file != null) {
                                    uriM7934H = C7591u.m7934H(fileCreateTempFile, file);
                                }
                                fileCreateTempFile.delete();
                                return new C13288c(uriM7934H);
                            } catch (IOException unused) {
                                throw new C3124Q("Failed to write to OutputStream.", null);
                            }
                        } catch (Throwable th2) {
                            fileCreateTempFile.delete();
                            throw th2;
                        }
                    } catch (IOException e11) {
                        throw new C3124Q("Failed to update Exif data", e11);
                    }
                } catch (Throwable th3) {
                    try {
                        c15379dM9509d.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e12) {
                throw new C3124Q("Failed to write to temp file", e12);
            }
        } catch (IOException e13) {
            throw new C3124Q("Failed to create temp file.", e13);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2370j(InterfaceC4251w interfaceC4251w) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f4240d;
        C1545X c1545x = (C1545X) identityHashMap.remove(interfaceC4251w);
        c1545x.getClass();
        c1545x.f4232a.mo4933m(interfaceC4251w);
        c1545x.f4234c.remove(((C4245q) interfaceC4251w).f13872Y);
        if (!identityHashMap.isEmpty()) {
            m2364d();
        }
        m2365e(c1545x);
    }

    /* JADX INFO: renamed from: k */
    public void m2371k(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = (ArrayList) this.f4239c;
            C1545X c1545x = (C1545X) arrayList.remove(i12);
            ((HashMap) this.f4241e).remove(c1545x.f4233b);
            int i13 = -c1545x.f4232a.f13886o.f13864b.mo2420o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((C1545X) arrayList.get(i14)).f4235d += i13;
            }
            c1545x.f4236e = true;
            if (this.f4237a) {
                m2365e(c1545x);
            }
        }
    }

    public C1546Y() {
        this.f4238b = new C2700t[4];
        this.f4239c = new Matrix[4];
        this.f4240d = new Matrix[4];
        this.f4241e = new PointF();
        this.f4242f = new Path();
        this.f4243g = new Path();
        this.f4244h = new C2700t();
        this.f4245i = new float[2];
        this.f4246j = new float[2];
        this.f4247k = new Path();
        this.f4248l = new Path();
        this.f4237a = true;
        for (int i10 = 0; i10 < 4; i10++) {
            ((C2700t[]) this.f4238b)[i10] = new C2700t();
            ((Matrix[]) this.f4239c)[i10] = new Matrix();
            ((Matrix[]) this.f4240d)[i10] = new Matrix();
        }
    }

    public C1546Y(C1532J c1532j, C1868f c1868f, C20815q c20815q, C1875m c1875m) {
        this.f4238b = c1875m;
        this.f4243g = c1532j;
        this.f4247k = new C4222W();
        this.f4240d = new IdentityHashMap();
        this.f4241e = new HashMap();
        this.f4239c = new ArrayList();
        this.f4245i = c1868f;
        this.f4246j = c20815q;
        this.f4242f = new HashMap();
        this.f4244h = new HashSet();
    }
}
