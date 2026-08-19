package p1143z4;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Bundle;
import androidx.work.impl.utils.p651oZ.HhJS;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: z4.C */
/* JADX INFO: loaded from: classes.dex */
public final class C21761C extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f69034l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21761C(boolean z6, int i10) {
        super(z6);
        this.f69034l = i10;
    }

    /* JADX INFO: renamed from: g */
    public static float[] m22251g(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    /* JADX INFO: renamed from: h */
    public static int[] m22252h(String str) {
        return new int[]{((Number) AbstractC21767I.f69040b.mo5895c(str)).intValue()};
    }

    /* JADX INFO: renamed from: i */
    public static long[] m22253i(String str) {
        return new long[]{((Number) AbstractC21767I.f69042d.mo5895c(str)).longValue()};
    }

    /* JADX INFO: renamed from: j */
    public static boolean[] m22254j(String str) {
        return new boolean[]{((Boolean) AbstractC21767I.f69046h.mo5895c(str)).booleanValue()};
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        switch (this.f69034l) {
            case 0:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                Object obj = bundle.get(key);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                Object obj2 = bundle.get(key);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            case 6:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                Object obj3 = bundle.get(key);
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj3;
            case 8:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (String[]) bundle.get(key);
            default:
                AbstractC16544l.m18094g(bundle, "bundle");
                AbstractC16544l.m18094g(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        switch (this.f69034l) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: c */
    public final Object mo5895c(String str) {
        boolean z6;
        int i10;
        String strSubstring;
        long j10;
        switch (this.f69034l) {
            case 0:
                return m22254j(str);
            case 1:
                if (str.equals("true")) {
                    z6 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 2:
                return m22251g(str);
            case 3:
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                return m22252h(str);
            case 5:
                if (AbstractC21329w.m21734u(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    AbstractC7966P5.m8254b(16);
                    i10 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i10 = Integer.parseInt(str);
                }
                return Integer.valueOf(i10);
            case 6:
                return m22253i(str);
            case 7:
                if (AbstractC21329w.m21725l(str, TokenNames.f32014L, false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = str;
                }
                if (AbstractC21329w.m21734u(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    AbstractC7966P5.m8254b(16);
                    j10 = Long.parseLong(strSubstring3, 16);
                } else {
                    j10 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j10);
            case 8:
                return new String[]{str};
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: d */
    public Object mo22255d(String str, Object obj) {
        switch (this.f69034l) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m22254j(str);
                }
                boolean[] zArrM22254j = m22254j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrM22254j, 0, zArrCopyOf, length, 1);
                AbstractC16544l.m18091d(zArrCopyOf);
                return zArrCopyOf;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
                return super.mo22255d(str, obj);
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return m22251g(str);
                }
                float[] fArrM22251g = m22251g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrM22251g, 0, fArrCopyOf, length2, 1);
                AbstractC16544l.m18091d(fArrCopyOf);
                return fArrCopyOf;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return m22252h(str);
                }
                int[] iArrM22252h = m22252h(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrM22252h, 0, iArrCopyOf, length3, 1);
                AbstractC16544l.m18091d(iArrCopyOf);
                return iArrCopyOf;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return m22253i(str);
                }
                long[] jArrM22253i = m22253i(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrM22253i, 0, jArrCopyOf, length4, 1);
                AbstractC16544l.m18091d(jArrCopyOf);
                return jArrCopyOf;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                AbstractC16544l.m18091d(objArrCopyOf);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: f */
    public String mo5897f(Object obj) {
        switch (this.f69034l) {
            case 9:
                String str = (String) obj;
                String strEncode = str != null ? Uri.encode(str) : null;
                return strEncode == null ? "null" : strEncode;
            default:
                return super.mo5897f(obj);
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        switch (this.f69034l) {
            case 0:
                AbstractC16544l.m18094g(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC16544l.m18094g(key, "key");
                bundle.putBoolean(key, zBooleanValue);
                break;
            case 2:
                AbstractC16544l.m18094g(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC16544l.m18094g(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            case 4:
                AbstractC16544l.m18094g(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                break;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                AbstractC16544l.m18094g(key, "key");
                bundle.putInt(key, iIntValue);
                break;
            case 6:
                AbstractC16544l.m18094g(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                break;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                AbstractC16544l.m18094g(key, "key");
                bundle.putLong(key, jLongValue);
                break;
            case 8:
                AbstractC16544l.m18094g(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                break;
            default:
                AbstractC16544l.m18094g(key, HhJS.FNfwaXwMX);
                bundle.putString(key, (String) obj);
                break;
        }
    }
}
