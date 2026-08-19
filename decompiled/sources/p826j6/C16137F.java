package p826j6;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import co.AbstractC11814d;
import co.C11816f;
import com.google.android.gms.internal.play_billing.AbstractC11947e;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11951f;
import com.google.android.gms.internal.play_billing.C12022w2;
import com.google.android.gms.internal.play_billing.C12026x2;
import com.google.android.gms.internal.play_billing.C12030y2;
import com.google.android.gms.internal.play_billing.C12034z2;
import com.google.android.gms.internal.play_billing.InterfaceC11959h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.util.AbstractC15496a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p001A.AbstractC0010F;
import p030B2.C0781s;
import p056C2.InterfaceC1522p;
import p086D6.InterfaceC1957a;
import p103Dn.InterfaceC2184i;
import p1073w3.C20811m;
import p182H3.InterfaceC3224y;
import p308M6.AbstractC5302d;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.C5304f;
import p308M6.C5305g;
import p308M6.InterfaceC5300b;
import p372P3.C6330l;
import p571X9.AbstractC9141H2;
import p893n.C17369a;
import p893n.C17370b;
import p893n.C17371c;
import p893n.C17372d;
import p893n.DialogInterfaceC17373e;
import p909nm.C17677k;
import p917o6.C17852e;
import p976r.DialogInterfaceOnKeyListenerC18815m;

/* JADX INFO: renamed from: j6.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16137F implements InterfaceC3224y, InterfaceC1522p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50062Y;

    /* JADX INFO: renamed from: Z */
    public int f50063Z;

    /* JADX INFO: renamed from: o0 */
    public Object f50064o0;

    public /* synthetic */ C16137F(Object obj, int i10, int i11) {
        this.f50062Y = i11;
        this.f50064o0 = obj;
        this.f50063Z = i10;
    }

    /* JADX INFO: renamed from: c */
    public static void m17686c(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String message = str + ": glError " + iGlGetError;
        AbstractC16544l.m18094g(message, "message");
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16465c("GLShader", message);
        }
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    /* JADX INFO: renamed from: j */
    public static int m17687j(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader == 0) {
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String message = "Could not compile shader " + i10 + ":";
        AbstractC16544l.m18094g(message, "message");
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16465c("GLShader", message);
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        AbstractC16544l.m18093f(strGlGetShaderInfoLog, "glGetShaderInfoLog(shader)");
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16465c("GLShader", strGlGetShaderInfoLog);
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX INFO: renamed from: a */
    public void m17688a(Resources resources) {
        C5299a c5299a;
        Integer numValueOf;
        int i10 = this.f50063Z;
        if (i10 == 0) {
            return;
        }
        HashMap map = ((C5303e) ((InterfaceC5300b) this.f50064o0)).f17469a;
        for (String key : map.keySet()) {
            AbstractC16544l.m18093f(key, "key");
            C5299a c5299a2 = (C5299a) map.get(key);
            if (c5299a2 != null) {
                c5299a2.f17465b = GLES20.glGetUniformLocation(i10, key);
            }
            if (resources != null && (c5299a = (C5299a) map.get(key)) != null) {
                int iM24h = AbstractC0010F.m24h(c5299a.f17464a);
                if (iM24h == 12) {
                    Object obj = c5299a.f17466c;
                    C5305g c5305g = obj instanceof C5305g ? (C5305g) obj : null;
                    if (c5305g != null) {
                        Bitmap bitmapDecodeResource = c5305g.f17475b;
                        if (bitmapDecodeResource == null) {
                            Integer num = c5305g.f17474a;
                            if (num == null) {
                                bitmapDecodeResource = null;
                            } else {
                                int iIntValue = num.intValue();
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = false;
                                bitmapDecodeResource = BitmapFactory.decodeResource(resources, iIntValue, options);
                                AbstractC16544l.m18093f(bitmapDecodeResource, "decodeResource(this, drawableRes, options)");
                            }
                        }
                        if (bitmapDecodeResource == null) {
                            numValueOf = null;
                        } else {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            if (iArr[0] == 0) {
                                throw new RuntimeException("It's not possible to generate ID for texture");
                            }
                            GLES20.glActiveTexture(c5305g.f17478e);
                            GLES20.glBindTexture(3553, iArr[0]);
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glTexParameteri(3553, 10240, 9729);
                            GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
                            if (c5305g.f17477d) {
                                bitmapDecodeResource.recycle();
                            }
                            GLES20.glBindTexture(3553, 0);
                            numValueOf = Integer.valueOf(iArr[0]);
                        }
                    } else {
                        numValueOf = null;
                    }
                    Object obj2 = c5299a.f17466c;
                    C5305g c5305g2 = obj2 instanceof C5305g ? (C5305g) obj2 : null;
                    C5305g c5305g3 = c5305g2 != null ? new C5305g(c5305g2.f17474a, c5305g2.f17475b, numValueOf, c5305g2.f17477d, c5305g2.f17478e) : null;
                    if (c5305g3 != null) {
                        obj2 = c5305g3;
                    }
                    c5299a.f17466c = obj2;
                } else if (iM24h == 13 && c5299a.f17466c == null) {
                    int[] iArr2 = new int[1];
                    GLES20.glGenTextures(1, IntBuffer.wrap(iArr2));
                    int i11 = iArr2[0];
                    if (i11 == 0) {
                        throw new RuntimeException("It's not possible to generate ID for texture");
                    }
                    GLES20.glBindTexture(36197, i11);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    c5299a.f17465b = iArr2[0];
                    SurfaceTexture surfaceTexture = new SurfaceTexture(c5299a.f17465b);
                    final C5304f c5304f = new C5304f(new Surface(surfaceTexture), surfaceTexture);
                    surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: M6.c
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                            C5304f this_apply = c5304f;
                            AbstractC16544l.m18094g(this_apply, "$this_apply");
                            ReentrantLock reentrantLock = this_apply.f17473d;
                            reentrantLock.lock();
                            try {
                                this_apply.f17472c.set(true);
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                    });
                    c5299a.f17466c = c5304f;
                }
            }
        }
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: b */
    public MediaCodecInfo mo4115b(int i10) {
        if (((MediaCodecInfo[]) this.f50064o0) == null) {
            this.f50064o0 = new MediaCodecList(this.f50063Z).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f50064o0)[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: d */
    public DialogInterfaceC17373e m17689d() {
        C17370b c17370b = (C17370b) this.f50064o0;
        DialogInterfaceC17373e dialogInterfaceC17373e = new DialogInterfaceC17373e(c17370b.f55439a, this.f50063Z);
        View view = c17370b.f55443e;
        C17372d c17372d = dialogInterfaceC17373e.f55481r0;
        if (view != null) {
            c17372d.f55473u = view;
        } else {
            CharSequence charSequence = c17370b.f55442d;
            if (charSequence != null) {
                c17372d.f55456d = charSequence;
                TextView textView = c17372d.f55471s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c17370b.f55441c;
            if (drawable != null) {
                c17372d.f55469q = drawable;
                ImageView imageView = c17372d.f55470r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c17372d.f55470r.setImageDrawable(drawable);
                }
            }
        }
        if (c17370b.f55445g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c17370b.f55440b.inflate(c17372d.f55477y, (ViewGroup) null);
            int i10 = c17370b.f55447i ? c17372d.f55478z : c17372d.f55449A;
            Object obj = c17370b.f55445g;
            ?? c17371c = obj;
            if (obj == null) {
                c17371c = new C17371c(c17370b.f55439a, i10, R.id.text1, null);
            }
            c17372d.f55474v = c17371c;
            c17372d.f55475w = c17370b.f55448j;
            if (c17370b.f55446h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C17369a(c17370b, c17372d));
            }
            if (c17370b.f55447i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c17372d.f55458f = alertController$RecycleListView;
        }
        dialogInterfaceC17373e.setCancelable(true);
        dialogInterfaceC17373e.setCanceledOnTouchOutside(true);
        dialogInterfaceC17373e.setOnCancelListener(null);
        dialogInterfaceC17373e.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC18815m dialogInterfaceOnKeyListenerC18815m = c17370b.f55444f;
        if (dialogInterfaceOnKeyListenerC18815m != null) {
            dialogInterfaceC17373e.setOnKeyListener(dialogInterfaceOnKeyListenerC18815m);
        }
        return dialogInterfaceC17373e;
    }

    /* JADX INFO: renamed from: e */
    public void m17690e(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.f50064o0;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            AbstractC16544l.m18093f(cArrCopyOf, "copyOf(...)");
            this.f50064o0 = cArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m17691f() {
        Intent intent;
        if (this.f50063Z == 0 && (intent = (Intent) this.f50064o0) != null) {
            if ((intent == null ? null : intent.getData()) == null) {
                return true;
            }
        }
        return false;
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: g */
    public boolean mo4116g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p056C2.InterfaceC1522p
    /* JADX INFO: renamed from: h */
    public boolean mo205h(View view) {
        ((BottomSheetBehavior) this.f50064o0).m13586A(this.f50063Z);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m17692i() {
        return this.f50063Z != 0;
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: k */
    public boolean mo4117k(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* JADX INFO: renamed from: l */
    public HashMap m17693l(Map map, InterfaceC15127H interfaceC15127H) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m17698s(interfaceC15127H, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: m */
    public void m17694m() {
        int i10 = this.f50063Z;
        if (i10 == 0 || i10 == 0) {
            return;
        }
        HashMap map = ((C5303e) ((InterfaceC5300b) this.f50064o0)).f17469a;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            C5299a c5299a = (C5299a) map.get((String) it.next());
            if (c5299a != null && c5299a.f17465b != -1 && c5299a.f17466c != null) {
                int i11 = 1;
                switch (AbstractC0010F.m24h(c5299a.f17464a)) {
                    case 0:
                        int i12 = c5299a.f17465b;
                        Object obj = c5299a.f17466c;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        GLES20.glUniform1f(i12, ((Float) obj).floatValue());
                        break;
                        break;
                    case 1:
                        int i13 = c5299a.f17465b;
                        Object obj2 = c5299a.f17466c;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        GLES20.glUniform1i(i13, ((Integer) obj2).intValue());
                        break;
                        break;
                    case 2:
                        int i14 = c5299a.f17465b;
                        Object obj3 = c5299a.f17466c;
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        GLES20.glUniform1i(i14, ((Boolean) obj3).booleanValue() ? 1 : 0);
                        break;
                        break;
                    case 3:
                        int i15 = c5299a.f17465b;
                        Object obj4 = c5299a.f17466c;
                        if (obj4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES20.glUniform2fv(i15, 1, (float[]) obj4, 0);
                        break;
                        break;
                    case 4:
                        int i16 = c5299a.f17465b;
                        Object obj5 = c5299a.f17466c;
                        if (obj5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES20.glUniform3fv(i16, 1, (float[]) obj5, 0);
                        break;
                        break;
                    case 5:
                        int i17 = c5299a.f17465b;
                        Object obj6 = c5299a.f17466c;
                        if (obj6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES20.glUniform4fv(i17, 1, (float[]) obj6, 0);
                        break;
                        break;
                    case 6:
                        int i18 = c5299a.f17465b;
                        Object obj7 = c5299a.f17466c;
                        if (obj7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                        GLES20.glUniform2iv(i18, 1, (int[]) obj7, 0);
                        break;
                        break;
                    case 7:
                        int i19 = c5299a.f17465b;
                        Object obj8 = c5299a.f17466c;
                        if (obj8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                        GLES20.glUniform3iv(i19, 1, (int[]) obj8, 0);
                        break;
                        break;
                    case 8:
                        int i20 = c5299a.f17465b;
                        Object obj9 = c5299a.f17466c;
                        if (obj9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                        GLES20.glUniform4iv(i20, 1, (int[]) obj9, 0);
                        break;
                        break;
                    case 9:
                        int i21 = c5299a.f17465b;
                        Object obj10 = c5299a.f17466c;
                        if (obj10 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES20.glUniformMatrix3fv(i21, 1, false, (float[]) obj10, 0);
                        break;
                        break;
                    case 10:
                        int i22 = c5299a.f17465b;
                        Object obj11 = c5299a.f17466c;
                        if (obj11 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES20.glUniformMatrix4fv(i22, 1, false, (float[]) obj11, 0);
                        break;
                        break;
                    case 11:
                        int i23 = c5299a.f17465b;
                        Object obj12 = c5299a.f17466c;
                        if (obj12 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                        GLES30.glUniformMatrix3x4fv(i23, 1, false, (float[]) obj12, 0);
                        break;
                        break;
                    case 12:
                        Object obj13 = c5299a.f17466c;
                        C5305g c5305g = obj13 instanceof C5305g ? (C5305g) obj13 : null;
                        if (c5305g != null) {
                            int i24 = c5299a.f17465b;
                            int i25 = c5305g.f17478e;
                            switch (i25) {
                                case 33985:
                                    break;
                                case 33986:
                                    i11 = 2;
                                    break;
                                case 33987:
                                    i11 = 3;
                                    break;
                                case 33988:
                                    i11 = 4;
                                    break;
                                case 33989:
                                    i11 = 5;
                                    break;
                                case 33990:
                                    i11 = 6;
                                    break;
                                case 33991:
                                    i11 = 7;
                                    break;
                                case 33992:
                                    i11 = 8;
                                    break;
                                case 33993:
                                    i11 = 9;
                                    break;
                                case 33994:
                                    i11 = 10;
                                    break;
                                case 33995:
                                    i11 = 11;
                                    break;
                                case 33996:
                                    i11 = 12;
                                    break;
                                case 33997:
                                    i11 = 13;
                                    break;
                                case 33998:
                                    i11 = 14;
                                    break;
                                case 33999:
                                    i11 = 15;
                                    break;
                                case 34000:
                                    i11 = 16;
                                    break;
                                case 34001:
                                    i11 = 17;
                                    break;
                                case 34002:
                                    i11 = 18;
                                    break;
                                case 34003:
                                    i11 = 19;
                                    break;
                                case 34004:
                                    i11 = 20;
                                    break;
                                case 34005:
                                    i11 = 21;
                                    break;
                                case 34006:
                                    i11 = 22;
                                    break;
                                case 34007:
                                    i11 = 23;
                                    break;
                                case 34008:
                                    i11 = 24;
                                    break;
                                case 34009:
                                    i11 = 25;
                                    break;
                                case 34010:
                                    i11 = 26;
                                    break;
                                case 34011:
                                    i11 = 27;
                                    break;
                                case 34012:
                                    i11 = 28;
                                    break;
                                case 34013:
                                    i11 = 29;
                                    break;
                                case 34014:
                                    i11 = 30;
                                    break;
                                case 34015:
                                    i11 = 31;
                                    break;
                                default:
                                    i11 = 0;
                                    break;
                            }
                            GLES20.glUniform1i(i24, i11);
                            GLES20.glActiveTexture(i25);
                            Integer num = c5305g.f17476c;
                            if (num != null) {
                                GLES20.glBindTexture(3553, num.intValue());
                            }
                        }
                        break;
                    case 13:
                        Object obj14 = c5299a.f17466c;
                        C5304f c5304f = obj14 instanceof C5304f ? (C5304f) obj14 : null;
                        if (c5304f == null) {
                            continue;
                        } else {
                            AtomicBoolean atomicBoolean = c5304f.f17472c;
                            ReentrantLock reentrantLock = c5304f.f17473d;
                            reentrantLock.lock();
                            try {
                                if (atomicBoolean.get()) {
                                    c5304f.f17471b.updateTexImage();
                                    atomicBoolean.set(false);
                                }
                                reentrantLock.unlock();
                            } catch (Throwable th2) {
                                reentrantLock.unlock();
                                throw th2;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC2184i m17695n(C17852e request) {
        AbstractC16544l.m18094g(request, "request");
        C18235b c18235b = (C18235b) this.f50064o0;
        int iMo7371f = c18235b.mo7371f();
        int i10 = this.f50063Z;
        if (i10 < iMo7371f) {
            return ((InterfaceC1957a) c18235b.get(i10)).mo3140a(request, new C16137F(c18235b, i10 + 1, 1));
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: o */
    public int mo4118o() {
        if (((MediaCodecInfo[]) this.f50064o0) == null) {
            this.f50064o0 = new MediaCodecList(this.f50063Z).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f50064o0).length;
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: p */
    public boolean mo4119p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public long m17696q(C6330l c6330l) {
        C20811m c20811m = (C20811m) this.f50064o0;
        int i10 = 0;
        c6330l.mo3047d(c20811m.f66092a, 0, 1, false);
        int i11 = c20811m.f66092a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        c6330l.mo3047d(c20811m.f66092a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (c20811m.f66092a[i10] & 255) + (i14 << 8);
        }
        this.f50063Z = i13 + 1 + this.f50063Z;
        return i14;
    }

    /* JADX INFO: renamed from: r */
    public void m17697r() {
        switch (this.f50062Y) {
            case 3:
                int i10 = this.f50063Z;
                if (i10 != 0) {
                    GLES20.glDeleteProgram(i10);
                    this.f50063Z = 0;
                }
                HashMap map = ((C5303e) ((InterfaceC5300b) this.f50064o0)).f17469a;
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    C5299a c5299a = (C5299a) map.get((String) it.next());
                    if (c5299a != null && AbstractC5302d.f17468a[AbstractC0010F.m24h(c5299a.f17464a)] == 1) {
                        Object obj = c5299a.f17466c;
                        C5304f c5304f = obj instanceof C5304f ? (C5304f) obj : null;
                        if (c5304f != null) {
                            ReentrantLock reentrantLock = c5304f.f17473d;
                            reentrantLock.lock();
                            try {
                                c5304f.f17471b.release();
                                c5304f.f17470a.release();
                                reentrantLock.unlock();
                            } catch (Throwable th2) {
                                reentrantLock.unlock();
                                throw th2;
                            }
                        }
                        c5299a.f17466c = null;
                    }
                }
                return;
            default:
                C11816f c11816f = C11816f.f35819o0;
                char[] array = (char[]) this.f50064o0;
                c11816f.getClass();
                AbstractC16544l.m18094g(array, "array");
                synchronized (c11816f) {
                    int i11 = c11816f.f2130Y;
                    if (array.length + i11 < AbstractC11814d.f35817a) {
                        c11816f.f2130Y = i11 + array.length;
                        ((C17677k) c11816f.f2131Z).addLast(array);
                    }
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: s */
    public Object m17698s(InterfaceC15127H interfaceC15127H, Object obj) {
        Object string;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i10 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC15496a.f48415a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i10 < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return AbstractC15496a.m16683a((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.f50064o0;
        if (hashSet.contains(obj)) {
            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f50063Z) {
                hashSet.remove(obj);
                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            if (obj.getClass().isArray()) {
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList2 = new ArrayList();
                int length2 = objArr.length;
                while (i10 < length2) {
                    arrayList2.add(m17698s(interfaceC15127H, objArr[i10]));
                    i10++;
                }
                obj2 = arrayList2;
            } else if (obj instanceof Collection) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    arrayList3.add(m17698s(interfaceC15127H, it.next()));
                }
                obj2 = arrayList3;
            } else {
                if (obj instanceof Map) {
                    string = m17693l((Map) obj, interfaceC15127H);
                } else {
                    HashMap mapM17699t = m17699t(interfaceC15127H, obj);
                    if (mapM17699t.isEmpty()) {
                        string = obj.toString();
                    } else {
                        obj2 = mapM17699t;
                    }
                }
                obj2 = string;
            }
            return obj2;
        } catch (Exception e10) {
            interfaceC15127H.mo16297h(EnumC15375i1.INFO, "Not serializing object due to throwing sub-path.", e10);
        } finally {
            hashSet.remove(obj);
        }
    }

    /* JADX INFO: renamed from: t */
    public HashMap m17699t(InterfaceC15127H interfaceC15127H, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m17698s(interfaceC15127H, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    interfaceC15127H.mo16298o(EnumC15375i1.INFO, AbstractC10763a.m11054l("Cannot access field ", name, Separators.DOT), new Object[0]);
                }
            }
        }
        return map;
    }

    public String toString() {
        switch (this.f50062Y) {
            case 8:
                return new String((char[]) this.f50064o0, 0, this.f50063Z);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m17700u(String text) {
        AbstractC16544l.m18094g(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m17690e(this.f50063Z, length);
        text.getChars(0, text.length(), (char[]) this.f50064o0, this.f50063Z);
        this.f50063Z += length;
    }

    /* JADX INFO: renamed from: v */
    public void m17701v(C12026x2 c12026x2) {
        String str;
        C16139H c16139h = (C16139H) this.f50064o0;
        int i10 = this.f50063Z;
        c16139h.getClass();
        try {
            if (c16139h.f50068H == null) {
                throw null;
            }
            InterfaceC11959h interfaceC11959h = c16139h.f50068H;
            String packageName = c16139h.f50066F.getPackageName();
            switch (i10) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            BinderC16138G binderC16138G = new BinderC16138G(c12026x2);
            C11951f c11951f = (C11951f) interfaceC11959h;
            Parcel parcelM6119p = c11951f.m6119p();
            parcelM6119p.writeString(packageName);
            parcelM6119p.writeString(str);
            int i11 = AbstractC11947e.f36252a;
            parcelM6119p.writeStrongBinder(binderC16138G);
            try {
                c11951f.f18445b.transact(1, parcelM6119p, null, 1);
            } finally {
                parcelM6119p.recycle();
            }
        } catch (Exception e10) {
            c16139h.m17707N(107, 28, AbstractC16144M.f50077E);
            AbstractC11988o0.m13513h("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            c12026x2.f36360d = true;
            C12034z2 c12034z2 = c12026x2.f36358b;
            if (c12034z2 != null) {
                C12030y2 c12030y2 = c12034z2.f36368Z;
                c12030y2.getClass();
                if (C12022w2.f36347r0.mo13462D(c12030y2, null, 0)) {
                    C12022w2.m13550d(c12030y2);
                    c12026x2.f36357a = null;
                    c12026x2.f36358b = null;
                    c12026x2.f36359c = null;
                }
            }
        }
    }

    public C16137F(C5303e c5303e) {
        this.f50062Y = 3;
        this.f50064o0 = c5303e;
    }

    public C16137F(int i10, byte b) {
        this.f50062Y = i10;
        switch (i10) {
            case 8:
                break;
            case 9:
                this.f50064o0 = new C20811m(8);
                break;
            case 16:
                this.f50063Z = 1;
                this.f50064o0 = Collections.singletonList(null);
                break;
            default:
                this.f50063Z = 0;
                this.f50064o0 = new StringBuilder();
                break;
        }
    }

    public C16137F(int i10) {
        this.f50062Y = 10;
        this.f50064o0 = new HashSet();
        this.f50063Z = i10;
    }

    public C16137F(Intent intent) {
        this.f50062Y = 5;
        this.f50064o0 = intent;
        this.f50063Z = (intent == null ? null : intent.getData()) != null ? -1 : 0;
    }

    public C16137F(int i10, C0781s[] c0781sArr) {
        this.f50062Y = 12;
        this.f50063Z = i10;
        this.f50064o0 = c0781sArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16137F(Context context) {
        this(context, DialogInterfaceC17373e.m19047j(context, 0));
        this.f50062Y = 14;
    }

    public C16137F(Context context, int i10) {
        this.f50062Y = 14;
        this.f50064o0 = new C17370b(new ContextThemeWrapper(context, DialogInterfaceC17373e.m19047j(context, i10)));
        this.f50063Z = i10;
    }

    public C16137F(ArrayList arrayList) {
        this.f50062Y = 16;
        this.f50063Z = 0;
        this.f50064o0 = arrayList;
    }

    public C16137F(boolean z6, boolean z10) {
        this.f50062Y = 2;
        this.f50063Z = (z6 || z10) ? 1 : 0;
    }
}
