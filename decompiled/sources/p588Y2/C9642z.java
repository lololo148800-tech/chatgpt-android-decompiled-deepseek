package p588Y2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.work.impl.utils.p651oZ.HhJS;
import bb.AbstractC11320m;
import bb.C11289N;
import bb.C11290O;
import coil.compose.AsyncImagePainter;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.interfaces.Callback;
import io.sentry.C15109B;
import io.sentry.C15457r;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15143M0;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.C15243l;
import io.sentry.android.replay.util.InterfaceC15308a;
import io.sentry.clientreport.C15333a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.C16617xf95ade76;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import mm.C17296C;
import p001A.C0031P0;
import p001A.C0093v0;
import p001A.C0099y0;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p025An.C0644w;
import p030B2.RunnableC0758g0;
import p082D2.InterfaceC1860g;
import p082D2.InterfaceC1862i;
import p1007s7.InterfaceC19466e;
import p1014t1.C19738o;
import p1014t1.C19739p;
import p1014t1.C19740q;
import p1016t3.C19755E;
import p1016t3.C19781h;
import p1027tp.C20063g;
import p1027tp.C20077u;
import p1027tp.InterfaceC20061e;
import p1030u1.C20095b;
import p1036u9.InterfaceC20165k;
import p103Dn.AbstractC2124C;
import p1060v9.C20493k;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1087wj.InterfaceC20971B;
import p1098x5.InterfaceC21130i;
import p1102x9.C21157a;
import p1102x9.C21159c;
import p110E4.C2307e;
import p1113xn.C21307a;
import p112E6.C2350i;
import p1139z0.InputConnectionC21601Y;
import p124Ei.C2484W0;
import p179H0.C3183a;
import p214Ib.C3677t;
import p349O0.C5996c0;
import p372P3.C6315G;
import p372P3.C6330l;
import p372P3.C6338t;
import p377P9.AbstractC6375a;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7941M4;
import p523V9.C8026X5;
import p544W9.AbstractC8483G3;
import p596Yb.InterfaceC10011a;
import p604Yk.C10077b;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p692d0.C12977p;
import p700d8.C13042c;
import p720e6.C13287b;
import p736f0.AbstractC13471I;
import p736f0.AbstractC13481T;
import p736f0.AbstractC13484b;
import p736f0.C13470H;
import p746fa.C13599h;
import p758g0.InterfaceC13728D;
import p774h1.AbstractC14332J;
import p774h1.C14329G;
import p774h1.C14353i;
import p774h1.InterfaceC14339Q;
import p775h2.AbstractC14376f;
import p777h4.C14407c;
import p777h4.C14408d;
import p777h4.C14409e;
import p784hb.C14438g;
import p796i0.C14895b;
import p796i0.C14898e;
import p817j$.util.Objects;
import p820j0.C16031b;
import p841k.C16281a;
import p841k.InterfaceC16282b;
import p864l5.C16823j;
import p893n.C17389u;
import p893n.LayoutInflaterFactory2C17390v;
import p909nm.AbstractC17680n;
import p916o5.C17826d;
import p916o5.C17827e;
import p916o5.C17830h;
import p936p0.C18272l;
import p936p0.C18273m;
import p936p0.C18280t;
import p953q0.InterfaceC18590l;
import p972qm.C18778k;
import p976r.C18807e;
import p976r.C18816n;
import p976r.InterfaceC18812j;
import p976r.InterfaceC18825w;
import p976r.MenuC18814l;
import p976r.ViewOnKeyListenerC18808f;
import p999s.C19341c1;
import p999s.InterfaceC19287C0;
import p999s.InterfaceC19324V0;
import p999s.InterfaceC19362l;
import sj.hJY.CsqksqyPE;
import sk.C19662a;

/* JADX INFO: renamed from: Y2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9642z implements InterfaceC16282b, InterfaceC10011a, Callback, InterfaceC19466e, InterfaceC13728D, DeclarationDescriptorVisitor, InterfaceC15143M0, InterfaceC15308a, InterfaceC21130i, InterfaceC18825w, InterfaceC18590l, InterfaceC19287C0, InterfaceC18812j, InterfaceC20061e, InterfaceC14339Q, InterfaceC20165k, InterfaceC1860g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29063Y;

    /* JADX INFO: renamed from: Z */
    public final Object f29064Z;

    public /* synthetic */ C9642z(Object obj, int i10) {
        this.f29063Y = i10;
        this.f29064Z = obj;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: A */
    public int mo357A(int i10) {
        return ((Layout) this.f29064Z).getLineVisibleEnd(i10);
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: B */
    public long mo4028B(float f10) {
        return ((long) (Math.exp(((C3183a) this.f29064Z).m4031b(f10) / (((double) AbstractC13471I.f42631a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: C */
    public Object mo10193C(C20077u c20077u) {
        C20063g c20063g = new C20063g(c20077u);
        c20077u.mo20893E(new C10077b(c20063g, 21));
        return c20063g;
    }

    @Override // p596Yb.InterfaceC10011a
    /* JADX INFO: renamed from: D */
    public Point[] mo10194D() {
        return ((C8026X5) this.f29064Z).f25333q0;
    }

    @Override // io.sentry.InterfaceC15143M0
    /* JADX INFO: renamed from: E */
    public C0031P0 mo10195E(C15109B c15109b, C15524y1 c15524y1) {
        AbstractC8483G3.m9133c(c15109b, "Hub is required");
        AbstractC8483G3.m9133c(c15524y1, "SentryOptions is required");
        String cacheDirPath = ((C15243l) this.f29064Z).f47568Y.getCacheDirPath();
        if (cacheDirPath == null || !AbstractC14376f.m15836b(cacheDirPath, c15524y1.getLogger())) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return new C0031P0(c15524y1.getLogger(), cacheDirPath, new C15457r(c15109b, c15524y1.getSerializer(), c15524y1.getLogger(), c15524y1.getFlushTimeoutMillis(), c15524y1.getMaxQueueSize()), new File(cacheDirPath), 5);
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: F */
    public float mo4029F(float f10, float f11) {
        C3183a c3183a = (C3183a) this.f29064Z;
        double dM4031b = c3183a.m4031b(f11);
        double d10 = AbstractC13471I.f42631a;
        return (Math.signum(f11) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dM4031b) * ((double) (c3183a.f9593Y * c3183a.f9594Z))))) + f10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: G */
    public float mo10196G(int i10) {
        Object obj;
        C18272l c18272lM19824g = ((C18280t) this.f29064Z).m19824g();
        if (c18272lM19824g.f58296j.isEmpty()) {
            return 0.0f;
        }
        ?? r6 = c18272lM19824g.f58296j;
        int size = r6.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i11);
            if (((C18273m) obj).f58304a == i10) {
                break;
            }
            i11++;
        }
        C18273m c18273m = (C18273m) obj;
        if (c18273m != null) {
            return c18273m.f58319p;
        }
        int size2 = r6.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            i12 += ((C18273m) r6.get(i13)).f58320q;
        }
        return ((i10 - mo10197H()) * ((i12 / r6.size()) + c18272lM19824g.f58302p)) - mo10223x();
    }

    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: H */
    public int mo10197H() {
        return ((C5996c0) ((C18280t) this.f29064Z).f58348d.f1140b).m6412g();
    }

    @Override // io.sentry.InterfaceC15143M0
    /* JADX INFO: renamed from: I */
    public /* synthetic */ boolean mo10198I(String str, InterfaceC15127H interfaceC15127H) {
        return AbstractC14376f.m15836b(str, interfaceC15127H);
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: J */
    public int mo363J(int i10) {
        return ((Layout) this.f29064Z).getEllipsisCount(i10);
    }

    @Override // p999s.InterfaceC19287C0
    /* JADX INFO: renamed from: K */
    public void mo10199K(MenuC18814l menuC18814l, C18816n c18816n) {
        ViewOnKeyListenerC18808f viewOnKeyListenerC18808f = (ViewOnKeyListenerC18808f) this.f29064Z;
        viewOnKeyListenerC18808f.f59821r0.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC18808f.f59823t0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (menuC18814l == ((C18807e) arrayList.get(i10)).f59803b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        viewOnKeyListenerC18808f.f59821r0.postAtTime(new RunnableC0758g0(this, i11 < arrayList.size() ? (C18807e) arrayList.get(i11) : null, c18816n, menuC18814l), menuC18814l, SystemClock.uptimeMillis() + 200);
    }

    /* JADX INFO: renamed from: L */
    public void m10200L(Object obj) {
        ((ArrayList) this.f29064Z).add(obj);
    }

    /* JADX INFO: renamed from: M */
    public void m10201M(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z6 = obj instanceof Object[];
        ArrayList arrayList = (ArrayList) this.f29064Z;
        if (z6) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    @Override // p1007s7.InterfaceC19466e
    /* JADX INFO: renamed from: N */
    public Object mo3913N(Object obj) {
        byte[] model = (byte[]) obj;
        AbstractC16544l.m18094g(model, "model");
        if (model.length == 0) {
            return null;
        }
        try {
            return AbstractC7941M4.m8230b(new String(model, C21307a.f67720a), (InterfaceC11256c) this.f29064Z);
        } catch (C3677t e10) {
            AbstractC7889G0.m8184b((InterfaceC11256c) this.f29064Z, 5, EnumC11255b.f34098Y, C13042c.f41444o0, e10, false, 48);
            return null;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m10202O(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f29064Z);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX INFO: renamed from: P */
    public void m10203P(int i10, int i11, C6330l c6330l) throws C19755E {
        C14407c c14407c;
        C14407c c14407c2;
        C14407c c14407c3;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        C14408d c14408d = (C14408d) this.f29064Z;
        SparseArray sparseArray = c14408d.f45249c;
        int i16 = 4;
        int i17 = 0;
        int i18 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (c14408d.f45227I != 2) {
                    return;
                }
                C14407c c14407c4 = (C14407c) sparseArray.get(c14408d.f45233O);
                if (c14408d.f45236R != 4 || !"V_VP9".equals(c14407c4.f45188b)) {
                    c6330l.mo3052j(i11);
                    return;
                }
                C20811m c20811m = c14408d.f45264p;
                c20811m.m21341C(i11);
                c6330l.mo3046b(c20811m.f66092a, 0, i11, false);
                return;
            }
            if (i10 == 16877) {
                c14408d.m15902d(i10);
                C14407c c14407c5 = c14408d.f45271w;
                int i19 = c14407c5.f45193g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    c6330l.mo3052j(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                c14407c5.f45175O = bArr;
                c6330l.mo3046b(bArr, 0, i11, false);
                return;
            }
            if (i10 == 16981) {
                c14408d.m15902d(i10);
                C14407c c14407c6 = c14408d.f45271w;
                byte[] bArr2 = new byte[i11];
                c14407c6.f45195i = bArr2;
                c6330l.mo3046b(bArr2, 0, i11, false);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                c6330l.mo3046b(bArr3, 0, i11, false);
                c14408d.m15902d(i10);
                c14408d.f45271w.f45196j = new C6315G(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                C20811m c20811m2 = c14408d.f45259k;
                Arrays.fill(c20811m2.f66092a, (byte) 0);
                c6330l.mo3046b(c20811m2.f66092a, 4 - i11, i11, false);
                c20811m2.m21344F(0);
                c14408d.f45273y = (int) c20811m2.m21367v();
                return;
            }
            if (i10 == 25506) {
                c14408d.m15902d(i10);
                C14407c c14407c7 = c14408d.f45271w;
                byte[] bArr4 = new byte[i11];
                c14407c7.f45197k = bArr4;
                c6330l.mo3046b(bArr4, 0, i11, false);
                return;
            }
            if (i10 != 30322) {
                throw C19755E.m20712a(null, "Unexpected id: " + i10);
            }
            c14408d.m15902d(i10);
            C14407c c14407c8 = c14408d.f45271w;
            byte[] bArr5 = new byte[i11];
            c14407c8.f45209w = bArr5;
            c6330l.mo3046b(bArr5, 0, i11, false);
            return;
        }
        int i20 = c14408d.f45227I;
        C20811m c20811m3 = c14408d.f45257i;
        if (i20 == 0) {
            C14409e c14409e = c14408d.f45247b;
            c14408d.f45233O = (int) c14409e.m15911c(c6330l, false, true, 8);
            c14408d.f45234P = c14409e.f45278c;
            c14408d.f45229K = -9223372036854775807L;
            c14408d.f45227I = 1;
            c20811m3.m21341C(0);
        }
        C14407c c14407c9 = (C14407c) sparseArray.get(c14408d.f45233O);
        if (c14407c9 == null) {
            c6330l.mo3052j(i11 - c14408d.f45234P);
            c14408d.f45227I = 0;
            return;
        }
        c14407c9.f45185Y.getClass();
        if (c14408d.f45227I == 1) {
            c14408d.m15904k(c6330l, 3);
            int i21 = (c20811m3.f66092a[2] & 6) >> 1;
            byte b = 255;
            if (i21 == 0) {
                c14408d.f45231M = 1;
                int[] iArr = c14408d.f45232N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c14408d.f45232N = iArr;
                iArr[0] = (i11 - c14408d.f45234P) - 3;
            } else {
                c14408d.m15904k(c6330l, 4);
                int i22 = (c20811m3.f66092a[3] & 255) + 1;
                c14408d.f45231M = i22;
                int[] iArr2 = c14408d.f45232N;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                c14408d.f45232N = iArr2;
                if (i21 == 2) {
                    int i23 = (i11 - c14408d.f45234P) - 4;
                    int i24 = c14408d.f45231M;
                    Arrays.fill(iArr2, 0, i24, i23 / i24);
                } else {
                    if (i21 == 1) {
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            i12 = c14408d.f45231M - 1;
                            if (i25 >= i12) {
                                break;
                            }
                            c14408d.f45232N[i25] = 0;
                            while (true) {
                                i13 = i16 + 1;
                                c14408d.m15904k(c6330l, i13);
                                int i27 = c20811m3.f66092a[i16] & 255;
                                int[] iArr3 = c14408d.f45232N;
                                i14 = iArr3[i25] + i27;
                                iArr3[i25] = i14;
                                if (i27 != 255) {
                                    break;
                                } else {
                                    i16 = i13;
                                }
                            }
                            i26 += i14;
                            i25++;
                            i16 = i13;
                        }
                        c14408d.f45232N[i12] = ((i11 - c14408d.f45234P) - i16) - i26;
                    } else {
                        if (i21 != 3) {
                            throw C19755E.m20712a(null, "Unexpected lacing value: " + i21);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        while (true) {
                            int i30 = c14408d.f45231M - i18;
                            if (i28 >= i30) {
                                c14407c2 = c14407c9;
                                c14408d.f45232N[i30] = ((i11 - c14408d.f45234P) - i16) - i29;
                                break;
                            }
                            c14408d.f45232N[i28] = i17;
                            int i31 = i16 + 1;
                            c14408d.m15904k(c6330l, i31);
                            if (c20811m3.f66092a[i16] == 0) {
                                throw C19755E.m20712a(null, "No valid varint length mask found");
                            }
                            int i32 = i17;
                            while (true) {
                                if (i32 >= 8) {
                                    c14407c3 = c14407c9;
                                    j10 = 0;
                                    i16 = i31;
                                    break;
                                }
                                int i33 = i18 << (7 - i32);
                                if ((c20811m3.f66092a[i16] & i33) != 0) {
                                    int i34 = i31 + i32;
                                    c14408d.m15904k(c6330l, i34);
                                    C14407c c14407c10 = c14407c9;
                                    j10 = c20811m3.f66092a[i16] & b & (~i33);
                                    while (i31 < i34) {
                                        j10 = (j10 << 8) | ((long) (c20811m3.f66092a[i31] & 255));
                                        i31++;
                                        c14407c10 = c14407c10;
                                    }
                                    c14407c3 = c14407c10;
                                    if (i28 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                    i16 = i34;
                                    break;
                                }
                                i32++;
                                b = 255;
                                i18 = 1;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw C19755E.m20712a(null, "EBML lacing sample size out of range.");
                            }
                            int i35 = (int) j10;
                            int[] iArr4 = c14408d.f45232N;
                            if (i28 != 0) {
                                i35 += iArr4[i28 - 1];
                            }
                            iArr4[i28] = i35;
                            i29 += i35;
                            i28++;
                            c14407c9 = c14407c3;
                            b = 255;
                            i17 = 0;
                            i18 = 1;
                        }
                    }
                    byte[] bArr6 = c20811m3.f66092a;
                    c14408d.f45228J = c14408d.m15906m((bArr6[1] & 255) | (bArr6[0] << 8)) + c14408d.f45222D;
                    c14407c = c14407c2;
                    if (c14407c.f45190d != 2 || (i10 == 163 && (c20811m3.f66092a[2] & 128) == 128)) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    c14408d.f45235Q = i15;
                    c14408d.f45227I = 2;
                    c14408d.f45230L = 0;
                }
            }
            c14407c2 = c14407c9;
            byte[] bArr7 = c20811m3.f66092a;
            c14408d.f45228J = c14408d.m15906m((bArr7[1] & 255) | (bArr7[0] << 8)) + c14408d.f45222D;
            c14407c = c14407c2;
            if (c14407c.f45190d != 2) {
                i15 = 1;
            } else {
                i15 = 1;
            }
            c14408d.f45235Q = i15;
            c14408d.f45227I = 2;
            c14408d.f45230L = 0;
        } else {
            c14407c = c14407c9;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = c14408d.f45230L;
                if (i36 >= c14408d.f45231M) {
                    c14408d.f45227I = 0;
                    return;
                }
                c14408d.m15903e(c14407c, ((long) ((c14408d.f45230L * c14407c.f45191e) / 1000)) + c14408d.f45228J, c14408d.f45235Q, c14408d.m15907n(c6330l, c14407c, c14408d.f45232N[i36], false), 0);
                c14408d.f45230L++;
                c14407c = c14407c;
            }
        } else {
            C14407c c14407c11 = c14407c;
            while (true) {
                int i37 = c14408d.f45230L;
                if (i37 >= c14408d.f45231M) {
                    return;
                }
                int[] iArr5 = c14408d.f45232N;
                iArr5[i37] = c14408d.m15907n(c6330l, c14407c11, iArr5[i37], true);
                c14408d.f45230L++;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public C11290O m10204Q() {
        Map mapMo12708d = ((AbstractC11320m) this.f29064Z).mo12708d();
        C11289N c11289n = new C11289N();
        C11290O c11290o = new C11290O();
        if (!mapMo12708d.isEmpty()) {
            throw new IllegalArgumentException();
        }
        c11290o.f34181p0 = mapMo12708d;
        c11290o.f34183r0 = c11289n;
        return c11290o;
    }

    /* JADX INFO: renamed from: R */
    public C2350i m10205R() {
        C17827e c17827eM19585k;
        C2307e c2307e = (C2307e) this.f29064Z;
        C17830h c17830h = (C17830h) c2307e.f7161q0;
        synchronized (c17830h) {
            c2307e.m3396f(true);
            c17827eM19585k = c17830h.m19585k(((C17826d) c2307e.f7159o0).f56864a);
        }
        if (c17827eM19585k != null) {
            return new C2350i(c17827eM19585k, 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public void m10206S(int i10, long j10) throws C19755E {
        C14408d c14408d = (C14408d) this.f29064Z;
        c14408d.getClass();
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C19755E.m20712a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C19755E.m20712a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case 131:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45190d = (int) j10;
                return;
            case 136:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45183W = j10 == 1;
                return;
            case 155:
                c14408d.f45229K = c14408d.m15906m(j10);
                return;
            case 159:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45176P = (int) j10;
                return;
            case 176:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45199m = (int) j10;
                return;
            case 179:
                c14408d.m15901b(i10);
                c14408d.f45223E.m20921a(c14408d.m15906m(j10));
                return;
            case 186:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45200n = (int) j10;
                return;
            case 215:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45189c = (int) j10;
                return;
            case 231:
                c14408d.f45222D = c14408d.m15906m(j10);
                return;
            case 238:
                c14408d.f45236R = (int) j10;
                return;
            case 241:
                if (c14408d.f45225G) {
                    return;
                }
                c14408d.m15901b(i10);
                c14408d.f45224F.m20921a(j10);
                c14408d.f45225G = true;
                return;
            case 251:
                c14408d.f45237S = true;
                return;
            case 16871:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45193g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C19755E.m20712a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C19755E.m20712a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C19755E.m20712a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C19755E.m20712a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C19755E.m20712a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                c14408d.f45274z = j10 + c14408d.f45267s;
                return;
            case 21432:
                int i11 = (int) j10;
                c14408d.m15902d(i10);
                if (i11 == 0) {
                    c14408d.f45271w.f45210x = 0;
                    return;
                }
                if (i11 == 1) {
                    c14408d.f45271w.f45210x = 2;
                    return;
                } else if (i11 == 3) {
                    c14408d.f45271w.f45210x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    c14408d.f45271w.f45210x = 3;
                    return;
                }
            case 21680:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45202p = (int) j10;
                return;
            case 21682:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45204r = (int) j10;
                return;
            case 21690:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45203q = (int) j10;
                return;
            case 21930:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45182V = j10 == 1;
                return;
            case 21938:
                c14408d.m15902d(i10);
                C14407c c14407c = c14408d.f45271w;
                c14407c.f45211y = true;
                c14407c.f45201o = (int) j10;
                return;
            case 21998:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45192f = (int) j10;
                return;
            case 22186:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45179S = j10;
                return;
            case 22203:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45180T = j10;
                return;
            case 25188:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45177Q = (int) j10;
                return;
            case 30114:
                c14408d.f45238T = j10;
                return;
            case 30321:
                c14408d.m15902d(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    c14408d.f45271w.f45205s = 0;
                    return;
                }
                if (i12 == 1) {
                    c14408d.f45271w.f45205s = 1;
                    return;
                } else if (i12 == 2) {
                    c14408d.f45271w.f45205s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    c14408d.f45271w.f45205s = 3;
                    return;
                }
            case 2352003:
                c14408d.m15902d(i10);
                c14408d.f45271w.f45191e = (int) j10;
                return;
            case 2807729:
                c14408d.f45268t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        c14408d.m15902d(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            c14408d.f45271w.f45162B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            c14408d.f45271w.f45162B = 1;
                            return;
                        }
                    case 21946:
                        c14408d.m15902d(i10);
                        int iM20742g = C19781h.m20742g((int) j10);
                        if (iM20742g != -1) {
                            c14408d.f45271w.f45161A = iM20742g;
                            return;
                        }
                        return;
                    case 21947:
                        c14408d.m15902d(i10);
                        c14408d.f45271w.f45211y = true;
                        int iM20741f = C19781h.m20741f((int) j10);
                        if (iM20741f != -1) {
                            c14408d.f45271w.f45212z = iM20741f;
                            return;
                        }
                        return;
                    case 21948:
                        c14408d.m15902d(i10);
                        c14408d.f45271w.f45163C = (int) j10;
                        return;
                    case 21949:
                        c14408d.m15902d(i10);
                        c14408d.f45271w.f45164D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: T */
    public C0093v0 m10207T(C19662a c19662a, AndroidComposeView androidComposeView) {
        boolean z6;
        long j10;
        long j11;
        ArrayList arrayList = (ArrayList) c19662a.f62320Y;
        C12977p c12977p = new C12977p(arrayList.size());
        int i10 = 0;
        for (int size = arrayList.size(); i10 < size; size = size) {
            C19740q c19740q = (C19740q) arrayList.get(i10);
            long j12 = c19740q.f62494a;
            C12977p c12977p2 = (C12977p) this.f29064Z;
            C19739p c19739p = (C19739p) c12977p2.m14664d(j12);
            if (c19739p == null) {
                j11 = c19740q.f62495b;
                j10 = c19740q.f62497d;
                z6 = false;
            } else {
                long jM11334F = androidComposeView.m11334F(c19739p.f62492b);
                long j13 = c19739p.f62491a;
                z6 = c19739p.f62493c;
                j10 = jM11334F;
                j11 = j13;
            }
            ArrayList arrayList2 = c19740q.f62502i;
            long j14 = c19740q.f62503j;
            long j15 = c19740q.f62504k;
            long j16 = c19740q.f62494a;
            c12977p.m14668h(j16, new C19738o(j16, c19740q.f62495b, c19740q.f62497d, c19740q.f62498e, c19740q.f62499f, j11, j10, z6, c19740q.f62500g, arrayList2, j14, j15));
            long j17 = c19740q.f62494a;
            boolean z10 = c19740q.f62498e;
            if (z10) {
                c12977p2.m14668h(j17, new C19739p(c19740q.f62495b, c19740q.f62496c, z10));
            } else {
                c12977p2.m14669i(j17);
            }
            i10++;
            arrayList = arrayList;
        }
        return new C0093v0(c12977p, 10, c19662a);
    }

    /* JADX INFO: renamed from: U */
    public void m10208U(long j10, int i10, long j11) throws C19755E {
        C14408d c14408d = (C14408d) this.f29064Z;
        AbstractC20800b.m21321i(c14408d.f45252d0);
        if (i10 == 160) {
            c14408d.f45237S = false;
            c14408d.f45238T = 0L;
            return;
        }
        if (i10 != 174) {
            if (i10 == 187) {
                c14408d.f45225G = false;
                return;
            }
            if (i10 == 19899) {
                c14408d.f45273y = -1;
                c14408d.f45274z = -1L;
                return;
            }
            if (i10 == 20533) {
                c14408d.m15902d(i10);
                c14408d.f45271w.f45194h = true;
                return;
            }
            if (i10 == 21968) {
                c14408d.m15902d(i10);
                c14408d.f45271w.f45211y = true;
                return;
            }
            if (i10 == 408125543) {
                long j12 = c14408d.f45267s;
                if (j12 != -1 && j12 != j10) {
                    throw C19755E.m20712a(null, "Multiple Segment elements not supported");
                }
                c14408d.f45267s = j10;
                c14408d.f45266r = j11;
                return;
            }
            if (i10 == 475249515) {
                c14408d.f45223E = new C20095b();
                c14408d.f45224F = new C20095b();
                return;
            } else {
                if (i10 == 524531317 && !c14408d.f45272x) {
                    if (c14408d.f45251d && c14408d.f45220B != -1) {
                        c14408d.f45219A = true;
                        return;
                    } else {
                        c14408d.f45252d0.mo3045F(new C6338t(c14408d.f45270v));
                        c14408d.f45272x = true;
                        return;
                    }
                }
                return;
            }
        }
        C14407c c14407c = new C14407c();
        c14407c.f45199m = -1;
        c14407c.f45200n = -1;
        c14407c.f45201o = -1;
        c14407c.f45202p = -1;
        c14407c.f45203q = -1;
        c14407c.f45204r = 0;
        c14407c.f45205s = -1;
        c14407c.f45206t = 0.0f;
        c14407c.f45207u = 0.0f;
        c14407c.f45208v = 0.0f;
        c14407c.f45209w = null;
        c14407c.f45210x = -1;
        c14407c.f45211y = false;
        c14407c.f45212z = -1;
        c14407c.f45161A = -1;
        c14407c.f45162B = -1;
        c14407c.f45163C = 1000;
        c14407c.f45164D = RCHTTPStatusCodes.SUCCESS;
        c14407c.f45165E = -1.0f;
        c14407c.f45166F = -1.0f;
        c14407c.f45167G = -1.0f;
        c14407c.f45168H = -1.0f;
        c14407c.f45169I = -1.0f;
        c14407c.f45170J = -1.0f;
        c14407c.f45171K = -1.0f;
        c14407c.f45172L = -1.0f;
        c14407c.f45173M = -1.0f;
        c14407c.f45174N = -1.0f;
        c14407c.f45176P = 1;
        c14407c.f45177Q = -1;
        c14407c.f45178R = 8000;
        c14407c.f45179S = 0L;
        c14407c.f45180T = 0L;
        c14407c.f45183W = true;
        c14407c.f45184X = "eng";
        c14408d.f45271w = c14407c;
    }

    /* JADX INFO: renamed from: V */
    public void m10209V(PropertyAccessorDescriptor descriptor, StringBuilder builder, String str) {
        DescriptorRendererImpl descriptorRendererImpl = (DescriptorRendererImpl) this.f29064Z;
        int i10 = C16617xf95ade76.$EnumSwitchMapping$0[descriptorRendererImpl.getPropertyAccessorRenderingPolicy().ordinal()];
        if (i10 == 1) {
            descriptorRendererImpl.m18324l(descriptor, builder);
            builder.append(str.concat(" for "));
            PropertyDescriptor correspondingProperty = descriptor.getCorrespondingProperty();
            AbstractC16544l.m18093f(correspondingProperty, "getCorrespondingProperty(...)");
            DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl, correspondingProperty, builder);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new C0644w();
            }
        } else {
            AbstractC16544l.m18094g(descriptor, "descriptor");
            AbstractC16544l.m18094g(builder, "builder");
            DescriptorRendererImpl.access$renderFunction(descriptorRendererImpl, descriptor, builder);
        }
    }

    @Override // p1098x5.InterfaceC21130i
    /* JADX INFO: renamed from: a */
    public Object mo10210a(C16823j c16823j) {
        return AbstractC2124C.m3221t(new C2484W0(((AsyncImagePainter) this.f29064Z).f35879s0, 3), c16823j);
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        C13599h c13599h = (C13599h) obj2;
        C21157a c21157a = (C21157a) ((C21159c) obj).m13209q();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c21157a.f18446c);
        AbstractC6375a.m6989c(parcelObtain, (C20493k) this.f29064Z);
        try {
            c21157a.f18445b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            c13599h.m15114b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: b */
    public int mo10211b() {
        return ((C18280t) this.f29064Z).m19824g().f58299m;
    }

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: c */
    public void mo10212c(MenuC18814l menuC18814l, boolean z6) {
        C17389u c17389u;
        MenuC18814l menuC18814lMo20102k = menuC18814l.mo20102k();
        int i10 = 0;
        boolean z10 = menuC18814lMo20102k != menuC18814l;
        if (z10) {
            menuC18814l = menuC18814lMo20102k;
        }
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) this.f29064Z;
        C17389u[] c17389uArr = layoutInflaterFactory2C17390v.f55549X0;
        int length = c17389uArr != null ? c17389uArr.length : 0;
        while (true) {
            if (i10 < length) {
                c17389u = c17389uArr[i10];
                if (c17389u != null && c17389u.f55514h == menuC18814l) {
                    break;
                } else {
                    i10++;
                }
            } else {
                c17389u = null;
                break;
            }
        }
        if (c17389u != null) {
            if (!z10) {
                layoutInflaterFactory2C17390v.m19102u(c17389u, z6);
            } else {
                layoutInflaterFactory2C17390v.m19100s(c17389u.f55507a, c17389u, menuC18814lMo20102k);
                layoutInflaterFactory2C17390v.m19102u(c17389u, true);
            }
        }
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        switch (this.f29063Y) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                C9606J c9606j = (C9606J) this.f29064Z;
                C9602F c9602f = (C9602F) c9606j.f33173D.pollFirst();
                if (c9602f == null) {
                    AbstractC15256t.m16482t("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = c9602f.f28898Y;
                    if (c9606j.f33186c.m11836c(str) == null) {
                        AbstractC15256t.m16482t("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C16281a c16281a = (C16281a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f29064Z;
                proxyBillingActivityV2.getClass();
                Intent intent = c16281a.f50449Z;
                int i11 = AbstractC11988o0.m13509d(intent, "ProxyBillingActivityV2").f50151a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f35948I0;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = c16281a.f50448Y;
                if (i12 != -1 || i11 != 0) {
                    AbstractC11988o0.m13512g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // p596Yb.InterfaceC10011a
    /* JADX INFO: renamed from: f */
    public Rect mo10213f() {
        C8026X5 c8026x5 = (C8026X5) this.f29064Z;
        if (c8026x5.f25333q0 == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c8026x5.f25333q0;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // p976r.InterfaceC18825w
    /* JADX INFO: renamed from: g */
    public boolean mo10214g(MenuC18814l menuC18814l) {
        Window.Callback callback;
        if (menuC18814l != menuC18814l.mo20102k()) {
            return true;
        }
        LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) this.f29064Z;
        if (!layoutInflaterFactory2C17390v.f55543R0 || (callback = layoutInflaterFactory2C17390v.f55573x0.getCallback()) == null || layoutInflaterFactory2C17390v.f55554c1) {
            return true;
        }
        callback.onMenuOpened(108, menuC18814l);
        return true;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    public int getLineCount() {
        return ((Layout) this.f29064Z).getLineCount();
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: h */
    public float mo4032h() {
        return 0.0f;
    }

    @Override // p596Yb.InterfaceC10011a
    /* JADX INFO: renamed from: i */
    public String mo10215i() {
        return ((C8026X5) this.f29064Z).f25330Z;
    }

    @Override // p596Yb.InterfaceC10011a
    /* JADX INFO: renamed from: j */
    public int mo10216j() {
        return ((C8026X5) this.f29064Z).f25332p0;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: k */
    public int mo374k(int i10) {
        return ((Layout) this.f29064Z).getLineTop(i10);
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: l */
    public float mo375l(int i10, int i11) {
        return ((Layout) this.f29064Z).getPrimaryHorizontal(i11);
    }

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: m */
    public Type mo10217m() {
        return (Type) this.f29064Z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: n */
    public int mo10218n() {
        C18273m c18273m = (C18273m) AbstractC17680n.m19353c0(((C18280t) this.f29064Z).m19824g().f58296j);
        if (c18273m != null) {
            return c18273m.f58304a;
        }
        return 0;
    }

    @Override // p774h1.InterfaceC14339Q
    /* JADX INFO: renamed from: o */
    public AbstractC14332J mo4178o(long j10, EnumC7546k enumC7546k, InterfaceC7537b interfaceC7537b) {
        return new C14329G((C14353i) this.f29064Z);
    }

    @Override // com.revenuecat.purchases.interfaces.Callback
    public void onReceived(Object obj) {
        ((C18778k) this.f29064Z).resumeWith((Boolean) obj);
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: p */
    public boolean mo10219p(MenuC18814l menuC18814l, MenuItem menuItem) {
        boolean z6;
        InterfaceC19362l interfaceC19362l = ((ActionMenuView) this.f29064Z).f32244N0;
        if (interfaceC19362l == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((C15333a) interfaceC19362l).f47885Y;
        Iterator it = ((CopyOnWriteArrayList) toolbar.f32280U0.f43260o0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            if (((C9598B) it.next()).f28890a.m11805o()) {
                z6 = true;
                break;
            }
        }
        if (!z6) {
            InterfaceC19324V0 interfaceC19324V0 = toolbar.f32282W0;
            if (interfaceC19324V0 == null) {
                return false;
            }
            C0099y0 c0099y0 = (C0099y0) interfaceC19324V0;
            C2307e this$0 = (C2307e) c0099y0.f427o0;
            AbstractC16544l.m18094g(this$0, "this$0");
            if (menuItem.getItemId() != R.id.expand_search_bar) {
                return false;
            }
            this$0.m3406r(true, c0099y0.f426Z);
        }
        return true;
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: q */
    public float mo4033q(float f10, long j10) {
        long j11 = j10 / 1000000;
        C13470H c13470hM4030a = ((C3183a) this.f29064Z).m4030a(f10);
        long j12 = c13470hM4030a.f42630c;
        return (((Math.signum(c13470hM4030a.f42628a) * AbstractC13484b.m15001a(j12 > 0 ? j11 / j12 : 1.0f).f42667b) * c13470hM4030a.f42629b) / j12) * 1000.0f;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: r */
    public int mo381r(int i10) {
        return ((Layout) this.f29064Z).getLineBottom(i10);
    }

    @Override // p758g0.InterfaceC13728D
    /* JADX INFO: renamed from: s */
    public float mo4034s(float f10, float f11, long j10) {
        long j11 = j10 / 1000000;
        C13470H c13470hM4030a = ((C3183a) this.f29064Z).m4030a(f11);
        long j12 = c13470hM4030a.f42630c;
        return (Math.signum(c13470hM4030a.f42628a) * c13470hM4030a.f42629b * AbstractC13484b.m15001a(j12 > 0 ? j11 / j12 : 1.0f).f42666a) + f10;
    }

    @Override // p596Yb.InterfaceC10011a
    /* JADX INFO: renamed from: t */
    public int mo10220t() {
        return ((C8026X5) this.f29064Z).f25329Y;
    }

    @Override // p999s.InterfaceC19287C0
    /* JADX INFO: renamed from: u */
    public void mo10221u(MenuC18814l menuC18814l, C18816n c18816n) {
        ((ViewOnKeyListenerC18808f) this.f29064Z).f59821r0.removeCallbacksAndMessages(menuC18814l);
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: v */
    public int mo384v(int i10) {
        return ((Layout) this.f29064Z).getLineStart(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitClassDescriptor(ClassDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderClass((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(constructorDescriptor, "constructorDescriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderConstructor((DescriptorRendererImpl) this.f29064Z, constructorDescriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitFunctionDescriptor(FunctionDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderFunction((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitModuleDeclaration(ModuleDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        ((DescriptorRendererImpl) this.f29064Z).m18327o(descriptor, builder, true);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageFragmentDescriptor(PackageFragmentDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderPackageFragment((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageViewDescriptor(PackageViewDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderPackageView((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyDescriptor(PropertyDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderProperty((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyGetterDescriptor(PropertyGetterDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        m10209V(descriptor, builder, "getter");
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitReceiverParameterDescriptor(ReceiverParameterDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        builder.append(descriptor.getName());
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeAliasDescriptor(TypeAliasDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        DescriptorRendererImpl.access$renderTypeAlias((DescriptorRendererImpl) this.f29064Z, descriptor, builder);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeParameterDescriptor(TypeParameterDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        ((DescriptorRendererImpl) this.f29064Z).m18334w(descriptor, builder, true);
        return C17296C.f55119a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitValueParameterDescriptor(ValueParameterDescriptor descriptor, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(builder, "builder");
        ((DescriptorRendererImpl) this.f29064Z).m18310A(descriptor, true, builder, true);
        return C17296C.f55119a;
    }

    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: w */
    public void mo10222w(int i10, int i11) {
        ((C18280t) this.f29064Z).m19826j(i10, i11);
    }

    @Override // p953q0.InterfaceC18590l
    /* JADX INFO: renamed from: x */
    public int mo10223x() {
        return ((C5996c0) ((C18280t) this.f29064Z).f58348d.f1141c).m6412g();
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: y */
    public void mo10224y(MenuC18814l menuC18814l) {
        C14438g c14438g = ((ActionMenuView) this.f29064Z).f32239I0;
        if (c14438g != null) {
            c14438g.mo10224y(menuC18814l);
        }
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: z */
    public Integer mo388z() {
        int i10;
        Layout layout = (Layout) this.f29064Z;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        AbstractC16544l.m18092e(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] spans = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        AbstractC16544l.m18093f(spans, "spans");
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : spans) {
            CharSequence text2 = layout.getText();
            AbstractC16544l.m18092e(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            AbstractC16544l.m18092e(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() | (-16777216));
        }
        return null;
    }

    public C9642z(int i10, byte b) {
        this.f29063Y = i10;
        switch (i10) {
            case 21:
                this.f29064Z = new C12977p((Object) null);
                break;
            default:
                this.f29064Z = new HashMap();
                break;
        }
    }

    @Override // p082D2.InterfaceC1860g
    /* JADX INFO: renamed from: e */
    public boolean mo257e(C13287b c13287b, int i10, Bundle bundle) {
        int i11 = Build.VERSION.SDK_INT;
        InputConnectionC21601Y inputConnectionC21601Y = (InputConnectionC21601Y) this.f29064Z;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((InterfaceC1862i) c13287b.f42000Z).mo2742f();
                Object objMo2744j = ((InterfaceC1862i) c13287b.f42000Z).mo2744j();
                AbstractC16544l.m18092e(objMo2744j, CsqksqyPE.ukswtNlq);
                Parcelable parcelable = (Parcelable) objMo2744j;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                e10.toString();
                inputConnectionC21601Y.getClass();
                return false;
            }
        }
        C19341c1 c19341c1 = inputConnectionC21601Y.f68413a;
        ClipDescription description = ((InterfaceC1862i) c13287b.f42000Z).getDescription();
        InterfaceC1862i interfaceC1862i = (InterfaceC1862i) c13287b.f42000Z;
        C0166F0 c0166f0 = new C0166F0(new ClipData(description, new ClipData.Item(interfaceC1862i.mo2741c())));
        C0169G0 c0169g0 = new C0169G0(interfaceC1862i.getDescription());
        Uri uriMo2743g = interfaceC1862i.mo2743g();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        C14898e c14898e = new C14898e(c0166f0, c0169g0, 0, new C14895b(uriMo2743g, bundle));
        C16031b c16031b = (C16031b) c19341c1.f61257p0;
        if (c16031b != null) {
            return !AbstractC16544l.m18089b(c16031b.f49468b.mo9531a(c14898e), c14898e);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertySetterDescriptor(PropertySetterDescriptor descriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(sb2, HhJS.DkFJMjp);
        m10209V(descriptor, sb2, "setter");
        return C17296C.f55119a;
    }

    public C9642z(InterfaceC11256c internalLogger) {
        this.f29063Y = 6;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f29064Z = internalLogger;
    }

    public C9642z(int i10) {
        this.f29063Y = 14;
        this.f29064Z = new ArrayList(i10);
    }

    public C9642z(InterfaceC7537b interfaceC7537b) {
        this.f29063Y = 7;
        float f10 = AbstractC13481T.f42659a;
        C3183a c3183a = new C3183a();
        c3183a.f9593Y = f10;
        float density = interfaceC7537b.getDensity();
        float f11 = AbstractC13471I.f42631a;
        c3183a.f9594Z = density * 386.0878f * 160.0f * 0.84f;
        this.f29064Z = c3183a;
    }

    public C9642z(InterfaceC20971B service) {
        this.f29063Y = 25;
        AbstractC16544l.m18094g(service, "service");
        this.f29064Z = service;
    }

    public C9642z(String str) {
        this.f29063Y = 3;
        str.getClass();
        this.f29064Z = str;
    }

    public C9642z(UUID uuid, int i10, byte[] bArr) {
        this.f29063Y = 12;
        this.f29064Z = uuid;
    }
}
