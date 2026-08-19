package p110E4;

import ac.C10539a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Image;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import ec.C13360b;
import ec.C13362d;
import ec.C13363e;
import fj.C13671c;
import fj.C13672d;
import fj.C13673e;
import fj.C13676h;
import fj.C13677i;
import fj.InterfaceC13670b;
import io.sentry.android.core.AbstractC15256t;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mm.C17314q;
import p001A.C0099y0;
import p001A.RunnableC0101z0;
import p007A5.AbstractC0371f;
import p025An.AbstractC0575H;
import p025An.C0569E;
import p025An.EnumC0573G;
import p026Ao.C0654C;
import p046Bk.ViewOnClickListenerC1330I;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p073Cj.RunnableC1713a;
import p077Cn.C1743k;
import p077Cn.C1749q;
import p077Cn.C1750r;
import p1016t3.C19778e;
import p1016t3.C19788o;
import p1037ub.InterfaceC20182b;
import p1060v9.AbstractC20502t;
import p1066vk.C20639g;
import p1066vk.C20640h;
import p1066vk.C20642j;
import p1073w3.AbstractC20817s;
import p110E4.C2307e;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p117Eb.C2385o;
import p135F5.C2665a;
import p135F5.C2669e;
import p139F9.BinderC2679b;
import p153Fn.AbstractC2941s;
import p165G9.C3016b;
import p165G9.C3020f;
import p239Ja.C4322y;
import p247Jj.C4399O;
import p301M.RunnableC5228j;
import p372P3.C6337s;
import p401Qb.C6584a;
import p501Ub.AbstractC7606h;
import p501Ub.C7616r;
import p523V9.AbstractC7862C5;
import p523V9.AbstractC7897H0;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8199t5;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9185O4;
import p571X9.AbstractC9227W;
import p594Y9.AbstractBinderC9726F2;
import p594Y9.AbstractC10009z4;
import p594Y9.AbstractC9710C4;
import p594Y9.AbstractC9722E4;
import p594Y9.AbstractC9950q;
import p594Y9.AbstractC9986w;
import p594Y9.C10002y3;
import p594Y9.C9700B0;
import p594Y9.C9713D1;
import p594Y9.C9835X4;
import p594Y9.C9879e2;
import p594Y9.C9938o;
import p594Y9.C9998y;
import p594Y9.InterfaceC9880e3;
import p658b5.C11248s;
import p729ej.AbstractC13422m;
import p729ej.AbstractC13431v;
import p729ej.C13415f;
import p729ej.C13425p;
import p729ej.InterfaceC13410a;
import p729ej.InterfaceC13418i;
import p748fc.C13611c;
import p748fc.C13612d;
import p748fc.InterfaceC13613e;
import p813ij.C15026j;
import p832jb.C16187g;
import p860l0.C16663C;
import p887m7.C17176b;
import p890mb.C17214k;
import p893n.AbstractActivityC17375g;
import p916o5.C17826d;
import p916o5.C17828f;
import p916o5.C17830h;
import p972qm.InterfaceC18776i;
import p979r2.AbstractC18861b;
import p994rk.InterfaceC19099L0;
import p999s.C19341c1;
import uk.C20371a;

/* JADX INFO: renamed from: E4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2307e implements InterfaceC13613e, InterfaceC13410a, InterfaceC13418i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7157Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7158Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f7159o0;

    /* JADX INFO: renamed from: p0 */
    public Object f7160p0;

    /* JADX INFO: renamed from: q0 */
    public Object f7161q0;

    public C2307e(Context context) {
        this.f7157Y = 7;
        this.f7160p0 = new C9835X4(null);
        this.f7159o0 = context;
    }

    /* JADX INFO: renamed from: g */
    private final void m3391g(boolean z6) {
        C2669e c2669e = (C2669e) this.f7161q0;
        synchronized (c2669e.f8200t0) {
            try {
                if (this.f7158Z) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC16544l.m18089b(((C2665a) this.f7159o0).f8182g, this)) {
                    C2669e.m3641a(c2669e, this, z6);
                }
                this.f7158Z = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final C0654C m3392i(int i10) {
        C0654C c0654c;
        C2669e c2669e = (C2669e) this.f7161q0;
        synchronized (c2669e.f8200t0) {
            if (this.f7158Z) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f7160p0)[i10] = true;
            Object obj = ((C2665a) this.f7159o0).f8179d.get(i10);
            AbstractC9185O4.m9742a(c2669e.f8192C0, (C0654C) obj);
            c0654c = (C0654C) obj;
        }
        return c0654c;
    }

    @Override // p729ej.InterfaceC13418i
    /* JADX INFO: renamed from: B */
    public void mo3393B(Object obj) throws Throwable {
        Throwable thM2559a;
        AbstractC13431v value = (AbstractC13431v) obj;
        AbstractC16544l.m18094g(value, "value");
        if (!this.f7158Z) {
            throw new UnsupportedOperationException(AbstractC16544l.m18100m(value, "Expected sink to not be sent to until after the render pass. Received action: "));
        }
        Object objMo2524p = ((C1743k) this.f7161q0).mo2524p(value);
        if ((objMo2524p instanceof C1749q) && (thM2559a = C1750r.m2559a(objMo2524p)) != null) {
            int i10 = AbstractC2941s.f8805a;
            throw thM2559a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x031c  */
    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: a */
    public C13363e mo2430a(C10539a c10539a) throws C6584a {
        Bitmap bitmapM8268i;
        int iM8194b;
        String str;
        Object[] objArrCopyOf;
        Object[] objArrCopyOf2;
        int i10 = 0;
        int i11 = 4;
        int i12 = 1;
        if (((C9713D1) this.f7161q0) == null) {
            mo2431b();
        }
        if (((C9713D1) this.f7161q0) == null) {
            throw new C6584a("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i13 = c10539a.f31260g;
        if (i13 == -1) {
            bitmapM8268i = c10539a.f31254a;
            iM8194b = AbstractC7897H0.m8194b(c10539a.f31259f);
        } else {
            if (i13 == -1) {
                Bitmap bitmap = c10539a.f31254a;
                AbstractC20502t.m21157h(bitmap);
                bitmapM8268i = AbstractC7972Q3.m8268i(bitmap, c10539a.f31259f, c10539a.f31257d, c10539a.f31258e);
            } else if (i13 == 17) {
                ByteBuffer byteBuffer = c10539a.f31255b;
                AbstractC20502t.m21157h(byteBuffer);
                bitmapM8268i = AbstractC7972Q3.m8262c(byteBuffer, c10539a.f31257d, c10539a.f31258e, c10539a.f31259f);
            } else if (i13 == 35) {
                Image.Plane[] planeArrM10980a = c10539a.m10980a();
                AbstractC20502t.m21157h(planeArrM10980a);
                bitmapM8268i = AbstractC7972Q3.m8262c(AbstractC7972Q3.m8266g(planeArrM10980a, c10539a.f31257d, c10539a.f31258e), c10539a.f31257d, c10539a.f31258e, c10539a.f31259f);
            } else {
                if (i13 != 842094169) {
                    throw new C6584a("Unsupported image format", 13);
                }
                ByteBuffer byteBuffer2 = c10539a.f31255b;
                AbstractC20502t.m21157h(byteBuffer2);
                int i14 = c10539a.f31257d;
                int i15 = c10539a.f31258e;
                int i16 = c10539a.f31259f;
                byte[] bArrM8269j = AbstractC7972Q3.m8269j(AbstractC7972Q3.m8267h(byteBuffer2, true).array(), i14, i15);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM8269j, 0, bArrM8269j.length);
                bitmapM8268i = AbstractC7972Q3.m8268i(bitmapDecodeByteArray, i16, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            }
            iM8194b = 0;
        }
        BinderC2679b binderC2679b = new BinderC2679b(bitmapM8268i);
        int i17 = c10539a.f31257d;
        int i18 = c10539a.f31258e;
        try {
            C9713D1 c9713d1 = (C9713D1) this.f7161q0;
            AbstractC20502t.m21157h(c9713d1);
            Parcel parcelM6116m = c9713d1.m6116m();
            AbstractC9986w.m10629a(parcelM6116m, binderC2679b);
            parcelM6116m.writeInt(1);
            int iM8811j = AbstractC8199t5.m8811j(parcelM6116m, 20293);
            AbstractC8199t5.m8813l(parcelM6116m, 2, 4);
            parcelM6116m.writeInt(i17);
            AbstractC8199t5.m8813l(parcelM6116m, 3, 4);
            parcelM6116m.writeInt(i18);
            AbstractC8199t5.m8813l(parcelM6116m, 4, 4);
            parcelM6116m.writeInt(0);
            AbstractC8199t5.m8813l(parcelM6116m, 5, 8);
            parcelM6116m.writeLong(0L);
            AbstractC8199t5.m8813l(parcelM6116m, 6, 4);
            parcelM6116m.writeInt(iM8194b);
            AbstractC8199t5.m8812k(parcelM6116m, iM8811j);
            Parcel parcelM6117n = c9713d1.m6117n(parcelM6116m, 1);
            C10002y3[] c10002y3Arr = (C10002y3[]) parcelM6117n.createTypedArray(C10002y3.CREATOR);
            parcelM6117n.recycle();
            SparseArray sparseArray = new SparseArray();
            for (C10002y3 c10002y3 : c10002y3Arr) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(c10002y3.f29676v0);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(c10002y3.f29676v0, sparseArray2);
                }
                sparseArray2.append(c10002y3.f29677w0, c10002y3);
            }
            C9938o c9938o = AbstractC9950q.f29506Z;
            Object[] objArr = new Object[4];
            int i19 = 0;
            int i20 = 0;
            boolean z6 = false;
            while (i19 < sparseArray.size()) {
                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i19);
                Object[] objArr2 = new Object[i11];
                int i21 = i10;
                int i22 = i21;
                int i23 = i22;
                while (i21 < sparseArray3.size()) {
                    C10002y3 c10002y4 = (C10002y3) sparseArray3.valueAt(i21);
                    c10002y4.getClass();
                    int i24 = i22 + 1;
                    int length = objArr2.length;
                    if (length < i24) {
                        int i25 = length + (length >> 1) + i12;
                        if (i25 < i24) {
                            int iHighestOneBit = Integer.highestOneBit(i22);
                            i25 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i25 < 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf2 = Arrays.copyOf(objArr2, i25);
                    } else {
                        if (i23 != 0) {
                            objArrCopyOf2 = (Object[]) objArr2.clone();
                        }
                        objArr2[i22] = c10002y4;
                        i21 += i12;
                        i22++;
                    }
                    objArr2 = objArrCopyOf2;
                    i23 = 0;
                    objArr2[i22] = c10002y4;
                    i21 += i12;
                    i22++;
                }
                C9938o c9938o2 = AbstractC9950q.f29506Z;
                C9998y c9998y = i22 == 0 ? C9998y.f29584q0 : new C9998y(i22, objArr2);
                AbstractList abstractListM10304b = AbstractC9710C4.m10304b(c9998y, new C13611c(i11));
                C9700B0 c9700b0 = ((C10002y3) c9998y.get(0)).f29668Z;
                C9938o c9938oListIterator = c9998y.listIterator(0);
                int i26 = Integer.MIN_VALUE;
                int iMax = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                while (c9938oListIterator.hasNext()) {
                    C9700B0 c9700b1 = ((C10002y3) c9938oListIterator.next()).f29668Z;
                    int i27 = c9700b0.f29228Y;
                    SparseArray sparseArray4 = sparseArray;
                    double d10 = c9700b0.f29232q0;
                    double dSin = Math.sin(Math.toRadians(d10));
                    double dCos = Math.cos(Math.toRadians(d10));
                    C9938o c9938o3 = c9938oListIterator;
                    int i28 = i19;
                    boolean z10 = z6;
                    Point point = new Point(c9700b1.f29228Y, c9700b1.f29229Z);
                    point.offset(-i27, -c9700b0.f29229Z);
                    Point[] pointArr = {point, new Point(i, i), new Point(i, i), new Point(i, i)};
                    Point point2 = pointArr[0];
                    int i29 = point2.x;
                    Object[] objArr3 = objArr;
                    int i30 = i20;
                    double d11 = point2.y;
                    int i31 = (int) ((d11 * dSin) + (((double) i29) * dCos));
                    AbstractList abstractList = abstractListM10304b;
                    int i32 = (int) ((d11 * dCos) + (((double) (-i29)) * dSin));
                    point2.x = i31;
                    point2.y = i32;
                    int i33 = c9700b1.f29230o0 + i31;
                    int i34 = i32 + c9700b1.f29231p0;
                    int iMax2 = i26;
                    int i35 = 0;
                    for (int i36 = 4; i35 < i36; i36 = 4) {
                        Point point3 = pointArr[i35];
                        iMin = Math.min(iMin, point3.x);
                        iMax2 = Math.max(iMax2, point3.x);
                        iMin2 = Math.min(iMin2, point3.y);
                        iMax = Math.max(iMax, point3.y);
                        i35++;
                    }
                    i26 = iMax2;
                    abstractListM10304b = abstractList;
                    c9938oListIterator = c9938o3;
                    i19 = i28;
                    z6 = z10;
                    objArr = objArr3;
                    i20 = i30;
                    sparseArray = sparseArray4;
                }
                SparseArray sparseArray5 = sparseArray;
                int i37 = i26;
                Object[] objArr4 = objArr;
                int i38 = i19;
                int i39 = i20;
                boolean z11 = z6;
                AbstractList abstractList2 = abstractListM10304b;
                int i40 = c9700b0.f29228Y;
                double d12 = c9700b0.f29232q0;
                double dSin2 = Math.sin(Math.toRadians(d12));
                double dCos2 = Math.cos(Math.toRadians(d12));
                Point[] pointArr2 = {new Point(iMin, iMin2), new Point(i37, iMin2), new Point(i37, iMax), new Point(iMin, iMax)};
                int i41 = 0;
                for (int i42 = 4; i41 < i42; i42 = 4) {
                    Point point4 = pointArr2[i41];
                    double d13 = point4.x;
                    double d14 = point4.y;
                    C9700B0 c9700b2 = c9700b0;
                    point4.x = (int) ((d13 * dCos2) - (d14 * dSin2));
                    point4.y = (int) ((d14 * dCos2) + (d13 * dSin2));
                    point4.offset(i40, c9700b2.f29229Z);
                    i41++;
                    c9700b0 = c9700b2;
                }
                List listAsList = Arrays.asList(pointArr2);
                String strM10314b = AbstractC9722E4.m10314b(AbstractC9710C4.m10304b(abstractList2, C13611c.f42997Z));
                Rect rectM8138c = AbstractC7862C5.m8138c(listAsList);
                HashMap map = new HashMap();
                Iterator it = abstractList2.iterator();
                while (it.hasNext()) {
                    String str2 = ((C13360b) it.next()).f42401b;
                    map.put(str2, Integer.valueOf((map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : 0) + 1));
                }
                Set setEntrySet = map.entrySet();
                if (setEntrySet.isEmpty()) {
                    str = "und";
                } else {
                    String str3 = (String) ((Map.Entry) Collections.max(setEntrySet, C13612d.f43002Y)).getKey();
                    if (AbstractC10009z4.m10651d(str3)) {
                        str = "und";
                    } else {
                        str = str3;
                    }
                }
                C13362d c13362d = new C13362d(strM10314b, rectM8138c, listAsList, str, abstractList2);
                int i43 = i39 + 1;
                objArr = objArr4;
                int length2 = objArr.length;
                if (length2 < i43) {
                    int i44 = length2 + (length2 >> 1) + 1;
                    if (i44 < i43) {
                        int iHighestOneBit2 = Integer.highestOneBit(i39);
                        i44 = iHighestOneBit2 + iHighestOneBit2;
                    }
                    if (i44 < 0) {
                        i44 = Integer.MAX_VALUE;
                    }
                    objArrCopyOf = Arrays.copyOf(objArr, i44);
                } else {
                    if (z11) {
                        objArrCopyOf = (Object[]) objArr.clone();
                    } else {
                        z6 = z11;
                    }
                    objArr[i39] = c13362d;
                    i19 = i38 + 1;
                    sparseArray = sparseArray5;
                    i12 = 1;
                    i20 = i39 + 1;
                    i10 = 0;
                    i11 = 4;
                }
                objArr = objArrCopyOf;
                z6 = false;
                objArr[i39] = c13362d;
                i19 = i38 + 1;
                sparseArray = sparseArray5;
                i12 = 1;
                i20 = i39 + 1;
                i10 = 0;
                i11 = 4;
            }
            int i45 = i20;
            C9938o c9938o4 = AbstractC9950q.f29506Z;
            C9998y c9998y2 = i45 == 0 ? C9998y.f29584q0 : new C9998y(i45, objArr);
            return new C13363e(AbstractC9722E4.m10314b(AbstractC9710C4.m10304b(c9998y2, C13611c.f42998o0)), c9998y2);
        } catch (RemoteException e10) {
            throw new C6584a(13, e10, "Failed to run legacy text recognizer.");
        }
    }

    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: b */
    public void mo2431b() throws C6584a {
        InterfaceC9880e3 c9879e2;
        Context context = (Context) this.f7159o0;
        if (((C9713D1) this.f7161q0) == null) {
            try {
                IBinder iBinderM3872b = C3020f.m3866c(context, C3020f.f9095b, "com.google.android.gms.vision.dynamite").m3872b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
                int i10 = AbstractBinderC9726F2.f29251b;
                if (iBinderM3872b == null) {
                    c9879e2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderM3872b.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    c9879e2 = iInterfaceQueryLocalInterface instanceof InterfaceC9880e3 ? (InterfaceC9880e3) iInterfaceQueryLocalInterface : new C9879e2(iBinderM3872b, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", 5);
                }
                C9713D1 c9713d1M10533s = ((C9879e2) c9879e2).m10533s(new BinderC2679b(context), (C9835X4) this.f7160p0);
                this.f7161q0 = c9713d1M10533s;
                if (c9713d1M10533s != null || this.f7158Z) {
                    return;
                }
                Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                AbstractC7606h.m7953a(context, "ocr");
                this.f7158Z = true;
            } catch (C3016b e10) {
                throw new C6584a(13, e10, "Failed to load deprecated vision dynamite module.");
            } catch (RemoteException e11) {
                throw new C6584a(13, e11, "Failed to create legacy text recognizer.");
            }
        }
    }

    @Override // p748fc.InterfaceC13613e
    /* JADX INFO: renamed from: c */
    public void mo2432c() {
        switch (this.f7157Y) {
            case 6:
                synchronized (this.f7159o0) {
                    try {
                        if (((ArrayDeque) this.f7160p0).isEmpty()) {
                            this.f7158Z = false;
                            return;
                        }
                        C7616r c7616r = (C7616r) ((ArrayDeque) this.f7160p0).remove();
                        m3409u(c7616r.f24075b, c7616r.f24074a);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                C9713D1 c9713d1 = (C9713D1) this.f7161q0;
                if (c9713d1 != null) {
                    try {
                        c9713d1.m6118o(c9713d1.m6116m(), 2);
                        break;
                    } catch (RemoteException e10) {
                        AbstractC15256t.m16466d("LegacyTextDelegate", "Failed to release legacy text recognizer.", e10);
                    }
                    this.f7161q0 = null;
                    return;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m3394d(C19778e c19778e, C19788o c19788o) {
        boolean zEquals = "audio/eac3-joc".equals(c19788o.f62752m);
        int i10 = c19788o.f62729A;
        if (zEquals && i10 == 16) {
            i10 = 12;
        }
        int iM21415p = AbstractC20817s.m21415p(i10);
        if (iM21415p == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM21415p);
        int i11 = c19788o.f62730B;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return ((Spatializer) this.f7159o0).canBeSpatialized((AudioAttributes) c19778e.m20736a().f45413Y, channelMask.build());
    }

    /* JADX INFO: renamed from: e */
    public boolean m3395e() {
        if (!((C17314q) this.f7160p0).isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(m3398j().f64400b);
        AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
        ViewGroup viewGroup = (ViewGroup) this.f7159o0;
        Context context = viewGroup.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        AbstractC8012V5.m8331d(context);
        viewGroup.postDelayed(new RunnableC1713a(bottomSheetBehaviorM13584v, 3), 100L);
        return bottomSheetBehaviorM13584v.f36423M != 5;
    }

    /* JADX INFO: renamed from: f */
    public void m3396f(boolean z6) {
        switch (this.f7157Y) {
            case 2:
                m3391g(z6);
                return;
            default:
                C17830h c17830h = (C17830h) this.f7161q0;
                synchronized (c17830h) {
                    try {
                        if (this.f7158Z) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (AbstractC16544l.m18089b(((C17826d) this.f7159o0).f56870g, this)) {
                            C17830h.m19576a(c17830h, this, z6);
                        }
                        this.f7158Z = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: h */
    public C0654C m3397h(int i10) {
        C0654C c0654c;
        switch (this.f7157Y) {
            case 2:
                return m3392i(i10);
            default:
                C17830h c17830h = (C17830h) this.f7161q0;
                synchronized (c17830h) {
                    if (this.f7158Z) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.f7160p0)[i10] = true;
                    Object obj = ((C17826d) this.f7159o0).f56867d.get(i10);
                    C17828f c17828f = c17830h.f56879B0;
                    C0654C c0654c2 = (C0654C) obj;
                    if (!c17828f.m1463d(c0654c2)) {
                        AbstractC0371f.m1001a(c17828f.mo1399i(c0654c2, false));
                    }
                    c0654c = (C0654C) obj;
                }
                return c0654c;
        }
    }

    /* JADX INFO: renamed from: j */
    public C20371a m3398j() {
        return (C20371a) ((C17314q) this.f7160p0).getValue();
    }

    /* JADX INFO: renamed from: k */
    public int[] m3399k() {
        synchronized (this) {
            try {
                if (!this.f7158Z) {
                    return null;
                }
                long[] jArr = (long[]) this.f7159o0;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z6 = jArr[i10] > 0;
                    boolean[] zArr = (boolean[]) this.f7160p0;
                    if (z6 != zArr[i11]) {
                        int[] iArr = (int[]) this.f7161q0;
                        if (!z6) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        ((int[]) this.f7161q0)[i11] = 0;
                    }
                    zArr[i11] = z6;
                    i10++;
                    i11 = i12;
                }
                this.f7158Z = false;
                return (int[]) ((int[]) this.f7161q0).clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m3401m() {
        try {
            if (this.f7158Z) {
                return;
            }
            Boolean boolM3405q = m3405q();
            this.f7160p0 = boolM3405q;
            if (boolM3405q == null) {
                ((C17214k) ((InterfaceC20182b) this.f7159o0)).m18951a(new C2385o(0));
            }
            this.f7158Z = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean m3402n() {
        Boolean bool;
        try {
            m3401m();
            bool = (Boolean) this.f7160p0;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f7161q0).f36852a.m17797g();
    }

    /* JADX INFO: renamed from: o */
    public boolean m3403o() {
        boolean z6;
        synchronized (this.f7159o0) {
            z6 = this.f7158Z;
        }
        return z6;
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: p */
    public Object mo3404p(AbstractC13422m child, Object obj, String key, InterfaceC1436k handler) {
        AbstractC16544l.m18094g(child, "child");
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(handler, "handler");
        if (this.f7158Z) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
        C19341c1 c19341c1 = (C19341c1) this.f7159o0;
        c19341c1.getClass();
        C11248s c11248s = (C11248s) c19341c1.f61260s0;
        for (InterfaceC13670b interfaceC13670bMo15160a = (InterfaceC13670b) ((C15026j) c11248s.f34082o0).f46724Y; interfaceC13670bMo15160a != null; interfaceC13670bMo15160a = interfaceC13670bMo15160a.mo15160a()) {
            if (((C13673e) interfaceC13670bMo15160a).m15162c(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + AbstractC8215v5.m8842d(child) + ": key=\"" + key + '\"').toString());
            }
        }
        C15026j c15026j = (C15026j) c11248s.f34081Z;
        InterfaceC13670b c13673e = (InterfaceC13670b) c15026j.f46724Y;
        InterfaceC13670b interfaceC13670b = null;
        while (true) {
            if (c13673e == null) {
                c13673e = null;
                break;
            }
            if (((C13673e) c13673e).m15162c(child, key)) {
                if (interfaceC13670b == null) {
                    c15026j.f46724Y = c13673e.mo15160a();
                } else {
                    interfaceC13670b.mo15161b(c13673e.mo15160a());
                }
                if (AbstractC16544l.m18089b((InterfaceC13670b) c15026j.f46725Z, c13673e)) {
                    c15026j.f46725Z = interfaceC13670b;
                }
                c13673e.mo15161b(null);
                break;
            }
            interfaceC13670b = c13673e;
            c13673e = c13673e.mo15160a();
        }
        if (c13673e == null) {
            C13677i c13677i = new C13677i(AbstractC8215v5.m8842d(child), key);
            C16525B c16525b = new C16525B();
            Map map = (Map) c19341c1.f61254Y;
            c13673e = new C13673e(child, handler, new C13676h(c13677i, child, obj, map != null ? (C13425p) map.get(c13677i) : null, (InterfaceC18776i) c19341c1.f61255Z, new C13672d(c16525b, c19341c1), (C13676h) c19341c1.f61257p0, (C13415f) c19341c1.f61258q0, (C6337s) c19341c1.f61259r0));
            c16525b.f51262Y = c13673e;
        }
        ((C15026j) c11248s.f34082o0).m16150n(c13673e);
        C13673e c13673e2 = (C13673e) c13673e;
        AbstractC16529F.m18081e(1, handler);
        c13673e2.f43153b = handler;
        return c13673e2.f43154c.m15164b(child, obj);
    }

    /* JADX INFO: renamed from: q */
    public Boolean m3405q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C16187g c16187g = ((FirebaseMessaging) this.f7161q0).f36852a;
        c16187g.m17794a();
        Context context = c16187g.f50235a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m3406r(boolean z6, boolean z10) {
        View currentFocus;
        if (z6) {
            m3398j().f64407i.setVisibility(8);
            m3398j().f64405g.setVisibility(0);
            m3398j().f64408j.getMenu().setGroupVisible(0, false);
            m3398j().f64404f.requestFocus();
            Context context = m3398j().f64404f.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            AbstractActivityC17375g abstractActivityC17375gM8328a = AbstractC8012V5.m8328a(context);
            if (abstractActivityC17375gM8328a != null && (currentFocus = abstractActivityC17375gM8328a.getCurrentFocus()) != null) {
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(currentFocus, 1);
                }
            }
        } else {
            Context context2 = m3398j().f64404f.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            AbstractC8012V5.m8331d(context2);
            m3398j().f64405g.setVisibility(8);
            m3398j().f64407i.setVisibility(0);
            m3398j().f64408j.getMenu().setGroupVisible(0, true);
            m3398j().f64404f.setText("");
        }
        if (z6 && z10) {
            m3398j().f64408j.setNavigationIcon(R.drawable.pi2_shared_arrow_back_24);
        } else {
            m3398j().f64408j.setNavigationIcon(R.drawable.pi2_shared_close_icon);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3407s(InterfaceC19099L0 component, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(component, "component");
        if (!this.f7158Z) {
            this.f7158Z = true;
            BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(m3398j().f64400b);
            AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
            bottomSheetBehaviorM13584v.f36441c = true;
            AbstractC9710C4.m10303a(bottomSheetBehaviorM13584v, C20639g.f65506Y, m3398j().f64400b, m3398j().f64401c, m3398j().f64406h);
            C20640h c20640h = new C20640h(this);
            ArrayList arrayList = bottomSheetBehaviorM13584v.f36434X;
            if (!arrayList.contains(c20640h)) {
                arrayList.add(c20640h);
            }
        }
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = interfaceC1436k;
        String strMo1130d = component.mo1130d();
        boolean z6 = strMo1130d == null || AbstractC21322p.m21681O(strMo1130d);
        final boolean z10 = !z6;
        BottomSheetBehavior bottomSheetBehaviorM13584v2 = BottomSheetBehavior.m13584v(m3398j().f64400b);
        AbstractC16544l.m18093f(bottomSheetBehaviorM13584v2, "from(...)");
        Context context = m3398j().f64403e.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        C20642j c20642j = new C20642j(context, component.mo1132j(), component.mo1128a(), component.mo1131g(), component.mo1129c(), new C16663C(component, c16525b, this, 12));
        this.f7161q0 = new C16663C(c16525b, c20642j, this, 11);
        m3406r(z6, z10);
        m3398j().f64408j.setOnMenuItemClickListener(new C0099y0(this, z10, 3));
        m3398j().f64407i.setText(component.mo1130d());
        m3398j().f64403e.setAdapter(c20642j);
        m3398j().f64406h.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v2, 7));
        UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyleMo1128a = component.mo1128a();
        if (inputSelectComponentStyleMo1128a != null) {
            AbstractC21295r.m21637c(m3398j().f64407i, inputSelectComponentStyleMo1128a.getTextBasedStyle());
            Integer baseBackgroundColorValue = inputSelectComponentStyleMo1128a.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                m3398j().f64401c.setBackgroundColor(iIntValue);
                m3398j().f64403e.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = inputSelectComponentStyleMo1128a.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                m3398j().f64402d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = inputSelectComponentStyleMo1128a.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                m3398j().f64408j.setNavigationIconTint(iIntValue2);
                m3398j().f64405g.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = inputSelectComponentStyleMo1128a.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(AbstractC18861b.m20169g(iIntValue3, 128));
                AbstractC16544l.m18093f(colorStateListValueOf, "valueOf(...)");
                m3398j().f64404f.setHintTextColor(colorStateListValueOf);
                m3398j().f64404f.setTextColor(iIntValue3);
            }
        }
        RecyclerView recyclerView = m3398j().f64403e;
        m3398j().f64399a.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        m3398j().f64403e.setHasFixedSize(true);
        m3398j().f64404f.addTextChangedListener(new C4322y(c20642j, 3));
        m3398j().f64408j.setNavigationOnClickListener(new View.OnClickListener() { // from class: vk.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2307e this$0 = this;
                AbstractC16544l.m18094g(this$0, "this$0");
                boolean z11 = z10;
                if (z11) {
                    TextInputLayout textInputLayout = this$0.m3398j().f64405g;
                    AbstractC16544l.m18093f(textInputLayout, HJrCuD.AlGjJxD);
                    if (textInputLayout.getVisibility() == 0) {
                        this$0.m3406r(false, z11);
                        return;
                    }
                }
                this$0.m3395e();
            }
        });
        m3398j().f64404f.setText("");
        m3398j().f64400b.setTranslationY(0.0f);
        ((ViewGroup) this.f7159o0).postDelayed(new RunnableC0101z0(z6, this, bottomSheetBehaviorM13584v2), 100L);
    }

    /* JADX INFO: renamed from: t */
    public void m3408t(Runnable runnable, Executor executor) {
        synchronized (this.f7159o0) {
            try {
                if (this.f7158Z) {
                    ((ArrayDeque) this.f7160p0).add(new C7616r(runnable, executor));
                } else {
                    this.f7158Z = true;
                    m3409u(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3409u(Runnable runnable, Executor executor) {
        try {
            executor.execute(new RunnableC5228j(this, 14, runnable));
        } catch (RejectedExecutionException unused) {
            mo2432c();
        }
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: z */
    public void mo3410z(String key, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(key, "key");
        if (this.f7158Z) {
            throw new IllegalStateException("RenderContext cannot be used after render method returns.");
        }
        C13676h c13676h = (C13676h) this.f7160p0;
        c13676h.getClass();
        C11248s c11248s = c13676h.f43166t0;
        for (InterfaceC13670b interfaceC13670bMo15160a = (InterfaceC13670b) ((C15026j) c11248s.f34082o0).f46724Y; interfaceC13670bMo15160a != null; interfaceC13670bMo15160a = interfaceC13670bMo15160a.mo15160a()) {
            if (key.equals(((C13671c) interfaceC13670bMo15160a).f43147a)) {
                throw new IllegalArgumentException(AbstractC10763a.m11047e('\"', "Expected side effect keys to be unique: \"", key).toString());
            }
        }
        C15026j c15026j = (C15026j) c11248s.f34081Z;
        InterfaceC13670b c13671c = (InterfaceC13670b) c15026j.f46724Y;
        InterfaceC13670b interfaceC13670b = null;
        while (true) {
            if (c13671c == null) {
                c13671c = null;
                break;
            }
            if (key.equals(((C13671c) c13671c).f43147a)) {
                if (interfaceC13670b == null) {
                    c15026j.f46724Y = c13671c.mo15160a();
                } else {
                    interfaceC13670b.mo15161b(c13671c.mo15160a());
                }
                if (AbstractC16544l.m18089b((InterfaceC13670b) c15026j.f46725Z, c13671c)) {
                    c15026j.f46725Z = interfaceC13670b;
                }
                c13671c.mo15161b(null);
                break;
            }
            interfaceC13670b = c13671c;
            c13671c = c13671c.mo15160a();
        }
        if (c13671c == null) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("sideEffect[", key, "] for ");
            sbM11058p.append(c13676h.f43159Y);
            c13671c = new C13671c(key, AbstractC0575H.m1156D(AbstractC0575H.m1158F(c13676h, new C0569E(sbM11058p.toString())), null, EnumC0573G.f1791Z, interfaceC1439n, 1));
        }
        ((C15026j) c11248s.f34082o0).m16150n(c13671c);
    }

    public C2307e(C19341c1 renderer, C13676h sideEffectRunner, C1743k eventActionsChannel) {
        this.f7157Y = 8;
        AbstractC16544l.m18094g(renderer, "renderer");
        AbstractC16544l.m18094g(sideEffectRunner, "sideEffectRunner");
        AbstractC16544l.m18094g(eventActionsChannel, "eventActionsChannel");
        this.f7159o0 = renderer;
        this.f7160p0 = sideEffectRunner;
        this.f7161q0 = eventActionsChannel;
    }

    public C2307e(int i10, byte b) {
        this.f7157Y = i10;
        switch (i10) {
            case 6:
                this.f7159o0 = new Object();
                this.f7160p0 = new ArrayDeque();
                this.f7161q0 = new AtomicReference();
                break;
            default:
                this.f7159o0 = new Object();
                this.f7160p0 = new ArrayList();
                this.f7161q0 = new ArrayList();
                this.f7158Z = true;
                break;
        }
    }

    public C2307e(ViewGroup contentView) {
        this.f7157Y = 10;
        AbstractC16544l.m18094g(contentView, "contentView");
        this.f7159o0 = contentView;
        this.f7160p0 = AbstractC9227W.m9800c(new C17176b(this, 26));
    }

    public C2307e(C4399O c4399o) {
        this.f7157Y = 3;
        this.f7159o0 = c4399o.m5185R().f40713g;
        this.f7160p0 = c4399o.m5185R().f40714h;
        this.f7161q0 = c4399o.m5185R().f40715i;
        Bundle bundle = c4399o.m5184Q().f14246a;
        this.f7158Z = bundle != null ? bundle.getBoolean("IS_NAV_BAR_ENABLED", true) : true;
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: l */
    public InterfaceC13418i mo3400l() {
        return this;
    }

    public C2307e(int i10) {
        this.f7157Y = 0;
        this.f7159o0 = new long[i10];
        this.f7160p0 = new boolean[i10];
        this.f7161q0 = new int[i10];
    }

    public C2307e(C2669e c2669e, C2665a c2665a) {
        this.f7157Y = 2;
        this.f7161q0 = c2669e;
        this.f7159o0 = c2665a;
        c2669e.getClass();
        this.f7160p0 = new boolean[2];
    }

    public C2307e(C17830h c17830h, C17826d c17826d) {
        this.f7157Y = 9;
        this.f7161q0 = c17830h;
        this.f7159o0 = c17826d;
        c17830h.getClass();
        this.f7160p0 = new boolean[2];
    }

    public C2307e(FirebaseMessaging firebaseMessaging, InterfaceC20182b interfaceC20182b) {
        this.f7157Y = 1;
        this.f7161q0 = firebaseMessaging;
        this.f7159o0 = interfaceC20182b;
    }

    public C2307e(Spatializer spatializer) {
        this.f7157Y = 4;
        this.f7159o0 = spatializer;
        this.f7158Z = spatializer.getImmersiveAudioLevel() != 0;
    }
}
