package p658b5;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.work.impl.WorkDatabase_Impl;
import com.auth0.android.request.internal.C11850i;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.AbstractC15152P0;
import io.sentry.EnumC15147N1;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.EnumC15260x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.WebrtcBuildVersion;
import mo.C17354u;
import p001A.C0030P;
import p026Ao.C0678l;
import p031B3.C0799c;
import p079D.AbstractC1762b;
import p1016t3.AbstractC19754D;
import p1016t3.C19757G;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1024tb.C19834e;
import p1031u3.C20104g;
import p1031u3.C20105h;
import p1031u3.InterfaceC20101d;
import p1031u3.InterfaceC20102e;
import p1055v4.InterfaceC20454y;
import p105E.C2223b;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p109E3.C2273N;
import p167Gb.C3032c;
import p178H.C3145g;
import p178H.InterfaceC3125S;
import p178H.InterfaceC3127U;
import p182H3.C3200a;
import p182H3.C3218s;
import p182H3.InterfaceC3210k;
import p200Hm.C3508g;
import p228J.AbstractC3794B0;
import p228J.EnumC3848m;
import p228J.EnumC3850n;
import p228J.EnumC3852o;
import p228J.InterfaceC3854p;
import p228J.InterfaceC3870x;
import p233J4.C4262h;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p326N.C5561c;
import p329N3.C5621k;
import p349O0.AbstractC5993b;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p414R.C6776j;
import p414R.C6777k;
import p414R.C6778l;
import p421R6.C6815a;
import p465T.C7166b;
import p497U6.InterfaceC7569a;
import p521V6.AbstractC7801D;
import p521V6.C7808a;
import p521V6.C7829v;
import p523V9.AbstractC8072d6;
import p537W0.AbstractC8411c;
import p537W0.C8415g;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p544W9.C8622e;
import p544W9.C8628f;
import p544W9.C8674m3;
import p562X0.C9017l;
import p562X0.InterfaceC9015j;
import p571X9.AbstractC9106B3;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9915k0;
import p594Y9.C9741I;
import p594Y9.C9747J;
import p594Y9.C9978u3;
import p615Z6.C10252z0;
import p734ep.C13458b;
import p760g2.C13807d;
import p760g2.C13808e;
import p775h2.C14372b;
import p775h2.InterfaceC14373c;
import p913o2.AbstractC17803d;
import p938p2.C18287a;
import p955q2.AbstractC18619k;
import p959q8.C18639a;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p999s.C19310O;
import p999s.C19372q;
import sb.C19514a;

/* JADX INFO: renamed from: b5.m */
/* JADX INFO: loaded from: classes.dex */
public class C11242m implements InterfaceC20102e, InterfaceC3210k, InterfaceC7569a, InterfaceC9015j, InterfaceC20454y {

    /* JADX INFO: renamed from: Y */
    public Object f34018Y;

    /* JADX INFO: renamed from: Z */
    public Object f34019Z;

    /* JADX INFO: renamed from: o0 */
    public Object f34020o0;

    public /* synthetic */ C11242m(Object obj, Object obj2, Object obj3) {
        this.f34018Y = obj;
        this.f34019Z = obj2;
        this.f34020o0 = obj3;
    }

    /* JADX INFO: renamed from: G */
    public static C11242m m12599G(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new C11242m(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    /* JADX INFO: renamed from: A */
    public ColorStateList m12600A(int i10) {
        int resourceId;
        ColorStateList colorStateListM19556c;
        TypedArray typedArray = (TypedArray) this.f34019Z;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM19556c = AbstractC17803d.m19556c((Context) this.f34018Y, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListM19556c;
    }

    /* JADX INFO: renamed from: B */
    public Drawable m12601B(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f34019Z;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : AbstractC9106B3.m9636b((Context) this.f34018Y, resourceId);
    }

    /* JADX INFO: renamed from: C */
    public Drawable m12602C(int i10) {
        int resourceId;
        Drawable drawableM20385g;
        if (!((TypedArray) this.f34019Z).hasValue(i10) || (resourceId = ((TypedArray) this.f34019Z).getResourceId(i10, 0)) == 0) {
            return null;
        }
        C19372q c19372qM20473a = C19372q.m20473a();
        Context context = (Context) this.f34018Y;
        synchronized (c19372qM20473a) {
            drawableM20385g = c19372qM20473a.f61354a.m20385g(context, resourceId, true);
        }
        return drawableM20385g;
    }

    /* JADX INFO: renamed from: D */
    public Typeface m12603D(int i10, int i11, C19310O c19310o) {
        int resourceId = ((TypedArray) this.f34019Z).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f34020o0) == null) {
            this.f34020o0 = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f34020o0;
        ThreadLocal threadLocal = AbstractC18619k.f59299a;
        Context context = (Context) this.f34018Y;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC18619k.m19976c(context, resourceId, typedValue, i11, c19310o, true, false);
    }

    /* JADX INFO: renamed from: E */
    public Size[] m12604E(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List listEmptyList;
        HashMap map = (HashMap) this.f34020o0;
        if (map.containsKey(Integer.valueOf(i10))) {
            if (((Size[]) map.get(Integer.valueOf(i10))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i10))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((C3032c) this.f34018Y).f9127Z).getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            AbstractC8072d6.m8492i("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
            return outputSizes;
        }
        C11248s c11248s = (C11248s) this.f34019Z;
        c11248s.getClass();
        ArrayList arrayList6 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) c11248s.f34081Z) != null) {
            Size[] sizeArr = (i10 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList6.addAll(Arrays.asList(sizeArr));
            }
        }
        C2223b c2223b = (C2223b) c11248s.f34082o0;
        c2223b.getClass();
        if (((ExcludedSupportedSizesQuirk) AbstractC1762b.f5032a.m4579f(ExcludedSupportedSizesQuirk.class)) == null) {
            listEmptyList = new ArrayList();
        } else {
            String str = c2223b.f6807Y;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList5 = new ArrayList();
                if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
                    arrayList5.add(new Size(4160, 3120));
                    arrayList5.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList5 = new ArrayList();
                if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
                    arrayList5.add(new Size(4160, 3120));
                    arrayList5.add(new Size(4000, 3000));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList4 = new ArrayList();
                    if (str.equals(WebrtcBuildVersion.maint_version) && (i10 == 34 || i10 == 35)) {
                        arrayList4.add(new Size(720, 720));
                        arrayList4.add(new Size(RCHTTPStatusCodes.BAD_REQUEST, RCHTTPStatusCodes.BAD_REQUEST));
                        listEmptyList = arrayList4;
                    }
                } else if (ExcludedSupportedSizesQuirk.m11177c()) {
                    arrayList3 = new ArrayList();
                    if (str.equals(WebrtcBuildVersion.maint_version)) {
                        if (i10 == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                            listEmptyList = arrayList3;
                        } else if (i10 == 35) {
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                            listEmptyList = arrayList3;
                        }
                    } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(2448, 2448));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                        listEmptyList = arrayList3;
                    }
                } else if (ExcludedSupportedSizesQuirk.m11176b()) {
                    arrayList2 = new ArrayList();
                    if (str.equals(WebrtcBuildVersion.maint_version)) {
                        if (i10 == 34) {
                            arrayList2.add(new Size(4128, 3096));
                            arrayList2.add(new Size(4128, 2322));
                            arrayList2.add(new Size(3088, 3088));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3264, 1836));
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                            listEmptyList = arrayList2;
                        } else if (i10 == 35) {
                            arrayList2.add(new Size(2048, 1536));
                            arrayList2.add(new Size(2048, 1152));
                            arrayList2.add(new Size(1920, 1080));
                            listEmptyList = arrayList2;
                        }
                    } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                        arrayList2.add(new Size(2576, 1932));
                        arrayList2.add(new Size(2560, 1440));
                        arrayList2.add(new Size(1920, 1920));
                        arrayList2.add(new Size(2048, 1536));
                        arrayList2.add(new Size(2048, 1152));
                        arrayList2.add(new Size(1920, 1080));
                        listEmptyList = arrayList2;
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals(WebrtcBuildVersion.maint_version) && i10 == 256) {
                        listEmptyList = arrayList;
                        listEmptyList = arrayList;
                        arrayList.add(new Size(9280, 6944));
                        listEmptyList = arrayList;
                    }
                } else {
                    AbstractC8072d6.m8492i("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    listEmptyList = Collections.emptyList();
                }
            }
            listEmptyList = arrayList5;
        }
        listEmptyList = arrayList;
        listEmptyList = arrayList;
        listEmptyList = arrayList;
        listEmptyList = arrayList2;
        listEmptyList = arrayList2;
        listEmptyList = arrayList2;
        listEmptyList = arrayList3;
        listEmptyList = arrayList3;
        listEmptyList = arrayList3;
        listEmptyList = arrayList4;
        listEmptyList = arrayList4;
        if (!listEmptyList.isEmpty()) {
            arrayList6.removeAll(listEmptyList);
        }
        if (arrayList6.isEmpty()) {
            AbstractC8072d6.m8492i("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList6.toArray(new Size[0]);
        map.put(Integer.valueOf(i10), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    /* JADX INFO: renamed from: F */
    public boolean m12605F(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c) {
        int[] iArr = c13807d.f43688q0;
        int i11 = iArr[0];
        C14372b c14372b = (C14372b) this.f34019Z;
        c14372b.f45067a = i11;
        c14372b.f45068b = iArr[1];
        c14372b.f45069c = c13807d.m15387r();
        c14372b.f45070d = c13807d.m15383l();
        c14372b.f45075i = false;
        c14372b.f45076j = i10;
        boolean z6 = c14372b.f45067a == 3;
        boolean z10 = c14372b.f45068b == 3;
        boolean z11 = z6 && c13807d.f43652X > 0.0f;
        boolean z12 = z10 && c13807d.f43652X > 0.0f;
        int[] iArr2 = c13807d.f43692u;
        if (z11 && iArr2[0] == 4) {
            c14372b.f45067a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            c14372b.f45068b = 1;
        }
        interfaceC14373c.mo10946b(c13807d, c14372b);
        c13807d.m15371R(c14372b.f45071e);
        c13807d.m15366M(c14372b.f45072f);
        c13807d.f43634F = c14372b.f45074h;
        c13807d.m15363J(c14372b.f45073g);
        c14372b.f45076j = 0;
        return c14372b.f45075i;
    }

    /* JADX INFO: renamed from: H */
    public void m12606H() {
        ((TypedArray) this.f34019Z).recycle();
    }

    /* JADX INFO: renamed from: I */
    public void m12607I(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC5993b.f19470a) {
            this.f34020o0 = obj;
            return;
        }
        synchronized (this.f34019Z) {
            C8415g c8415g = (C8415g) ((AtomicReference) this.f34018Y).get();
            int iM8972a = c8415g.m8972a(id2);
            if (iM8972a < 0) {
                ((AtomicReference) this.f34018Y).set(c8415g.m8973b(id2, obj));
            } else {
                c8415g.f26163c[iM8972a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m12608J(C13808e c13808e, int i10, int i11, int i12) {
        int i13 = c13808e.f43660c0;
        int i14 = c13808e.f43662d0;
        c13808e.f43660c0 = 0;
        c13808e.f43662d0 = 0;
        c13808e.m15371R(i11);
        c13808e.m15366M(i12);
        if (i13 < 0) {
            c13808e.f43660c0 = 0;
        } else {
            c13808e.f43660c0 = i13;
        }
        if (i14 < 0) {
            c13808e.f43662d0 = 0;
        } else {
            c13808e.f43662d0 = i14;
        }
        C13808e c13808e2 = (C13808e) this.f34020o0;
        c13808e2.f43714u0 = i10;
        c13808e2.m15400X();
    }

    /* JADX INFO: renamed from: K */
    public void m12609K() {
        C9017l c9017l = (C9017l) this.f34018Y;
        LinkedHashMap linkedHashMap = c9017l.f27516c;
        String str = (String) this.f34019Z;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((AbstractC16546n) this.f34020o0);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c9017l.f27516c.put(str, list);
    }

    /* JADX INFO: renamed from: L */
    public void m12610L(C13808e c13808e) {
        ArrayList arrayList = (ArrayList) this.f34018Y;
        arrayList.clear();
        int size = c13808e.f43711r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C13807d c13807d = (C13807d) c13808e.f43711r0.get(i10);
            int[] iArr = c13807d.f43688q0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c13807d);
            }
        }
        c13808e.f43713t0.f1983b = true;
    }

    /* JADX INFO: renamed from: M */
    public byte[] m12611M(C8674m3 c8674m3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f34018Y;
            C8628f c8628f = new C8628f(byteArrayOutputStream, map, (HashMap) this.f34019Z, (C8622e) this.f34020o0);
            InterfaceC18663d interfaceC18663d = (InterfaceC18663d) map.get(C8674m3.class);
            if (interfaceC18663d == null) {
                throw new C18661b("No encoder for ".concat(String.valueOf(C8674m3.class)));
            }
            interfaceC18663d.mo3472a(c8674m3, c8628f);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    public byte[] m12612N(C9978u3 c9978u3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f34018Y;
            C9747J c9747j = new C9747J(byteArrayOutputStream, map, (HashMap) this.f34019Z, (C9741I) this.f34020o0);
            InterfaceC18663d interfaceC18663d = (InterfaceC18663d) map.get(C9978u3.class);
            if (interfaceC18663d == null) {
                throw new C18661b("No encoder for ".concat(String.valueOf(C9978u3.class)));
            }
            interfaceC18663d.mo3472a(c9978u3, c9747j);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: a */
    public C19757G mo2433a(C19757G c19757g) {
        float f10 = c19757g.f62564a;
        C20105h c20105h = (C20105h) this.f34020o0;
        if (c20105h.f63677c != f10) {
            c20105h.f63677c = f10;
            c20105h.f63683i = true;
        }
        float f11 = c20105h.f63678d;
        float f12 = c19757g.f62565b;
        if (f11 != f12) {
            c20105h.f63678d = f12;
            c20105h.f63683i = true;
        }
        return c19757g;
    }

    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: b */
    public void mo3067b(C20811m c20811m) {
        long jM21383d;
        AbstractC20800b.m21321i((C20816r) this.f34019Z);
        int i10 = AbstractC20817s.f66106a;
        C20816r c20816r = (C20816r) this.f34019Z;
        synchronized (c20816r) {
            try {
                long j10 = c20816r.f66104c;
                jM21383d = j10 != -9223372036854775807L ? j10 + c20816r.f66103b : c20816r.m21383d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long jM21384e = ((C20816r) this.f34019Z).m21384e();
        if (jM21383d == -9223372036854775807L || jM21384e == -9223372036854775807L) {
            return;
        }
        C19788o c19788o = (C19788o) this.f34018Y;
        if (jM21384e != c19788o.f62757r) {
            C19787n c19787nM20747a = c19788o.m20747a();
            c19787nM20747a.f62719q = jM21384e;
            C19788o c19788o2 = new C19788o(c19787nM20747a);
            this.f34018Y = c19788o2;
            ((InterfaceC6316H) this.f34020o0).mo4971d(c19788o2);
        }
        int iM21346a = c20811m.m21346a();
        ((InterfaceC6316H) this.f34020o0).mo4970c(iM21346a, c20811m);
        ((InterfaceC6316H) this.f34020o0).mo4968a(jM21383d, 1, iM21346a, 0, null);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: c */
    public void mo4057c(int i10, C0799c c0799c, long j10, int i11) {
        ((MediaCodec) this.f34018Y).queueSecureInputBuffer(i10, 0, c0799c.f2222i, j10, i11);
    }

    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: d */
    public void mo3069d(C20816r c20816r, InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        this.f34019Z = c20816r;
        c13458b.m14981c();
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 5);
        this.f34020o0 = interfaceC6316HMo3044D;
        interfaceC6316HMo3044D.mo4971d((C19788o) this.f34018Y);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: e */
    public void mo4058e(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f34018Y).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a c6815a) {
        AbstractC7801D error = (AbstractC7801D) c6815a;
        AbstractC16544l.m18094g(error, "error");
        ((C11248s) this.f34018Y).mo7759f(error);
    }

    @Override // p182H3.InterfaceC3210k
    public void flush() {
        ((MediaCodec) this.f34018Y).flush();
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: g */
    public long mo2435g(long j10) {
        C20105h c20105h = (C20105h) this.f34020o0;
        if (!c20105h.mo3352a()) {
            return j10;
        }
        if (c20105h.f63689o < 1024) {
            return (long) (((double) c20105h.f63677c) * j10);
        }
        long j11 = c20105h.f63688n;
        C20104g c20104g = c20105h.f63684j;
        c20104g.getClass();
        long j12 = j11 - ((long) ((c20104g.f63664k * c20104g.f63655b) * 2));
        int i10 = c20105h.f63682h.f63642a;
        int i11 = c20105h.f63681g.f63642a;
        return i10 == i11 ? AbstractC20817s.m21396J(j10, j12, c20105h.f63689o, RoundingMode.FLOOR) : AbstractC20817s.m21396J(j10, j12 * ((long) i10), c20105h.f63689o * ((long) i11), RoundingMode.FLOOR);
    }

    @Override // p182H3.InterfaceC3210k
    public ByteBuffer getInputBuffer(int i10) {
        return AbstractC20817s.f66106a >= 21 ? ((MediaCodec) this.f34018Y).getInputBuffer(i10) : ((ByteBuffer[]) this.f34019Z)[i10];
    }

    @Override // p182H3.InterfaceC3210k
    public ByteBuffer getOutputBuffer(int i10) {
        return AbstractC20817s.f66106a >= 21 ? ((MediaCodec) this.f34018Y).getOutputBuffer(i10) : ((ByteBuffer[]) this.f34020o0)[i10];
    }

    @Override // p182H3.InterfaceC3210k
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.f34018Y).getOutputFormat();
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: h */
    public void mo4059h(int i10, long j10) {
        ((MediaCodec) this.f34018Y).releaseOutputBuffer(i10, j10);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: i */
    public int mo4060i() {
        return ((MediaCodec) this.f34018Y).dequeueInputBuffer(0L);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean mo4061j(C3218s c3218s) {
        return false;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: k */
    public int mo4062k(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f34018Y;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && AbstractC20817s.f66106a < 21) {
                this.f34020o0 = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: l */
    public void mo4063l(C5621k c5621k, Handler handler) {
        ((MediaCodec) this.f34018Y).setOnFrameRenderedListener(new C3200a(this, c5621k, 1), handler);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: m */
    public void mo4064m(int i10) {
        ((MediaCodec) this.f34018Y).setVideoScalingMode(i10);
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: n */
    public long mo2436n() {
        return ((C2273N) this.f34019Z).f7032q;
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: o */
    public boolean mo2437o(boolean z6) {
        ((C2273N) this.f34019Z).f7030o = z6;
        return z6;
    }

    @Override // p497U6.InterfaceC7569a
    public void onSuccess(Object obj) {
        C7808a result = (C7808a) obj;
        C11248s c11248s = (C11248s) this.f34018Y;
        AbstractC16544l.m18094g(result, "result");
        C7829v c7829v = (C7829v) this.f34019Z;
        String str = c7829v.f24725h;
        AbstractC16544l.m18091d(str);
        c7829v.f24723f.f22451a.getClass();
        C10252z0 c10252z0 = new C10252z0(str, result);
        LinkedHashMap linkedHashMap = c7829v.f24720c;
        String str2 = (String) linkedHashMap.get("max_age");
        if (!TextUtils.isEmpty(str2)) {
            AbstractC16544l.m18091d(str2);
            c10252z0.f30458q0 = Integer.valueOf(str2);
        }
        c10252z0.f30457p0 = (String) linkedHashMap.get("nonce");
        c10252z0.f30459r0 = new Date(System.currentTimeMillis());
        c10252z0.f30456o0 = (String) linkedHashMap.get("organization");
        try {
            AbstractC9915k0.m10572b((C11850i) this.f34020o0, c10252z0, true);
            c11248s.onSuccess(null);
        } catch (AbstractC7801D e10) {
            c11248s.mo7759f(e10);
        }
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: p */
    public void mo4065p(Surface surface) {
        ((MediaCodec) this.f34018Y).setOutputSurface(surface);
    }

    @Override // p1031u3.InterfaceC20102e
    /* JADX INFO: renamed from: q */
    public InterfaceC20101d[] mo2438q() {
        return (InterfaceC20101d[]) this.f34018Y;
    }

    /* JADX INFO: renamed from: r */
    public void m12613r(List list) {
        if (((HashSet) this.f34019Z) == null) {
            this.f34019Z = new HashSet();
        }
        ((HashSet) this.f34019Z).add("actions.intent.OPEN_APP_FEATURE");
        if (list.isEmpty()) {
            return;
        }
        if (((HashMap) this.f34020o0) == null) {
            this.f34020o0 = new HashMap();
        }
        if (((HashMap) this.f34020o0).get("actions.intent.OPEN_APP_FEATURE") == null) {
            ((HashMap) this.f34020o0).put("actions.intent.OPEN_APP_FEATURE", new HashMap());
        }
        ((Map) ((HashMap) this.f34020o0).get("actions.intent.OPEN_APP_FEATURE")).put("feature", list);
    }

    @Override // p182H3.InterfaceC3210k
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.f34018Y;
        this.f34019Z = null;
        this.f34020o0 = null;
        try {
            int i10 = AbstractC20817s.f66106a;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // p182H3.InterfaceC3210k
    public void releaseOutputBuffer(int i10, boolean z6) {
        ((MediaCodec) this.f34018Y).releaseOutputBuffer(i10, z6);
    }

    /* JADX INFO: renamed from: s */
    public C18287a m12614s() {
        C18287a c18287a = (C18287a) this.f34018Y;
        if (TextUtils.isEmpty(c18287a.f58380d)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = c18287a.f58379c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        if (((HashSet) this.f34019Z) != null) {
            if (c18287a.f58382f == null) {
                c18287a.f58382f = new HashSet();
            }
            c18287a.f58382f.addAll((HashSet) this.f34019Z);
        }
        if (((HashMap) this.f34020o0) != null) {
            if (c18287a.f58384h == null) {
                c18287a.f58384h = new PersistableBundle();
            }
            for (String str : ((HashMap) this.f34020o0).keySet()) {
                Map map = (Map) ((HashMap) this.f34020o0).get(str);
                c18287a.f58384h.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                for (String str2 : map.keySet()) {
                    List list = (List) map.get(str2);
                    c18287a.f58384h.putStringArray(AbstractC9306j0.m9890i(str, Separators.SLASH, str2), list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                }
            }
        }
        return c18287a;
    }

    @Override // p182H3.InterfaceC3210k
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f34018Y).setParameters(bundle);
    }

    /* JADX INFO: renamed from: t */
    public void m12615t(C6778l c6778l, Map.Entry entry) {
        C6778l c6778l2 = (C6778l) entry.getValue();
        C3145g c3145g = null;
        C3145g c3145g2 = new C3145g(c6778l.f21768g.f11606a, ((C7166b) entry.getKey()).f22777d, c6778l.f21764c ? (InterfaceC3870x) this.f34019Z : null, ((C7166b) entry.getKey()).f22779f, ((C7166b) entry.getKey()).f22780g);
        int i10 = ((C7166b) entry.getKey()).f22776c;
        c6778l2.getClass();
        AbstractC8488H2.m9140a();
        c6778l2.m7223a();
        AbstractC4941g.m5559R("Consumer can only be linked once.", !c6778l2.f21771j);
        c6778l2.f21771j = true;
        C6777k c6777k = c6778l2.f21773l;
        RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c6777k.m4509c(), new C6776j(c6778l2, c6777k, i10, c3145g2, c3145g), AbstractC8577W2.m9243e());
        runnableC5220bM5782f.mo5766a(new RunnableC5228j(runnableC5220bM5782f, 0, new C11241l((Object) this, (Object) c6778l2, false)), AbstractC8577W2.m9243e());
    }

    /* JADX INFO: renamed from: u */
    public void m12616u(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkProgressDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34018Y;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34019Z;
        C4262h c4262hM1928a = c11237h.m1928a();
        if (str == null) {
            c4262hM1928a.mo3426s0(1);
        } else {
            c4262hM1928a.mo3422c(1, str);
        }
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m12617v() {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.WorkProgressDao") : null;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f34018Y;
        workDatabase_Impl.m12339b();
        C11237h c11237h = (C11237h) this.f34020o0;
        C4262h c4262hM1928a = c11237h.m1928a();
        workDatabase_Impl.m12340c();
        try {
            c4262hM1928a.m5034e();
            workDatabase_Impl.m12352o();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16272c(EnumC15147N1.OK);
            }
        } finally {
            workDatabase_Impl.m12348k();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c11237h.m1942o(c4262hM1928a);
        }
    }

    /* JADX INFO: renamed from: w */
    public Object m12618w() {
        Object objRemoveLast;
        synchronized (this.f34019Z) {
            objRemoveLast = ((ArrayDeque) this.f34018Y).removeLast();
        }
        return objRemoveLast;
    }

    /* JADX INFO: renamed from: x */
    public void m12619x(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f34019Z;
        HashMap map2 = (HashMap) this.f34018Y;
        C19834e c19834e = new C19834e(byteArrayOutputStream, map2, map, (C19514a) this.f34020o0);
        if (obj == null) {
            return;
        }
        InterfaceC18663d interfaceC18663d = (InterfaceC18663d) map2.get(obj.getClass());
        if (interfaceC18663d != null) {
            interfaceC18663d.mo3472a(obj, c19834e);
        } else {
            throw new C18661b("No encoder for " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m12620y(InterfaceC3127U interfaceC3127U) throws Exception {
        Object objM12618w;
        InterfaceC3125S interfaceC3125SMo3968k0 = interfaceC3127U.mo3968k0();
        InterfaceC3854p interfaceC3854p = interfaceC3125SMo3968k0 instanceof C5561c ? ((C5561c) interfaceC3125SMo3968k0).f18029a : null;
        if ((interfaceC3854p.mo4352w() != EnumC3850n.f11642r0 && interfaceC3854p.mo4352w() != EnumC3850n.f11640p0) || interfaceC3854p.mo4350q() != EnumC3848m.f11634q0 || interfaceC3854p.mo4348l() != EnumC3852o.f11650p0) {
            ((C0030P) this.f34020o0).getClass();
            interfaceC3127U.close();
            return;
        }
        synchronized (this.f34019Z) {
            try {
                objM12618w = ((ArrayDeque) this.f34018Y).size() >= 3 ? m12618w() : null;
                ((ArrayDeque) this.f34018Y).addFirst(interfaceC3127U);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((C0030P) this.f34020o0) == null || objM12618w == null) {
            return;
        }
        ((InterfaceC3127U) objM12618w).close();
    }

    /* JADX INFO: renamed from: z */
    public Object m12621z() {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC5993b.f19470a) {
            return this.f34020o0;
        }
        C8415g c8415g = (C8415g) ((AtomicReference) this.f34018Y).get();
        int iM8972a = c8415g.m8972a(id2);
        if (iM8972a >= 0) {
            return c8415g.f26163c[iM8972a];
        }
        return null;
    }

    public C11242m(String str) {
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i(str);
        this.f34018Y = new C19788o(c19787n);
    }

    public C11242m(int i10) {
        switch (i10) {
            case 24:
                String strM4498w = AbstractC3794B0.m4498w("randomUUID().toString()");
                C0678l c0678l = C0678l.f1971p0;
                this.f34018Y = C18639a.m19996n(strM4498w);
                this.f34019Z = C17354u.f55304e;
                this.f34020o0 = new ArrayList();
                break;
            default:
                this.f34018Y = new AtomicReference(AbstractC8411c.f26157b);
                this.f34019Z = new Object();
                break;
        }
    }

    public C11242m(Context context, TypedArray typedArray) {
        this.f34018Y = context;
        this.f34019Z = typedArray;
    }

    public C11242m(C3508g argumentRange, List[] listArr, Method method) {
        AbstractC16544l.m18094g(argumentRange, "argumentRange");
        this.f34018Y = argumentRange;
        this.f34019Z = listArr;
        this.f34020o0 = method;
    }

    public C11242m(C13808e c13808e) {
        this.f34018Y = new ArrayList();
        this.f34019Z = new C14372b();
        this.f34020o0 = c13808e;
    }

    public C11242m(EnumC15260x enumC15260x) {
        this.f34018Y = enumC15260x;
        this.f34019Z = null;
        this.f34020o0 = null;
    }

    public C11242m(Application application, String str) {
        C18287a c18287a = new C18287a();
        this.f34018Y = c18287a;
        c18287a.f58377a = application;
        c18287a.f58378b = str;
    }
}
