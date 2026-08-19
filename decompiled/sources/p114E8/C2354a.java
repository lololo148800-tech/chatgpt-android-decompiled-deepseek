package p114E8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p164G8.C3007a;
import p444S4.C7001g;
import p629Zl.InterfaceC10420a;

/* JADX INFO: renamed from: E8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2354a implements InterfaceC2358e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7307a;

    /* JADX INFO: renamed from: b */
    public HashMap f7308b;

    public C2354a(int i10) {
        this.f7307a = i10;
        switch (i10) {
            case 1:
                this.f7308b = new HashMap();
                break;
            case 2:
                this.f7308b = new HashMap();
                break;
        }
    }

    @Override // p114E8.InterfaceC2358e
    /* JADX INFO: renamed from: a */
    public boolean mo3438a(C3007a c3007a) {
        for (Map.Entry entry : this.f7308b.entrySet()) {
            Object obj = c3007a.m3837g().get(entry.getKey());
            if (obj != null) {
                if (((Pattern) entry.getValue()).matcher(String.valueOf(obj)).matches()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m3439b(Class cls, InterfaceC10420a interfaceC10420a) {
        this.f7308b.put(cls, interfaceC10420a);
    }

    /* JADX INFO: renamed from: c */
    public void m3440c(Object obj, String str) {
        HashMap map = this.f7308b;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            map.put(str, obj);
            return;
        }
        int i10 = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            String str2 = C7001g.f22406b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i10 < zArr.length) {
                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                i10++;
            }
            map.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            String str3 = C7001g.f22406b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i10 < bArr.length) {
                bArr2[i10] = Byte.valueOf(bArr[i10]);
                i10++;
            }
            map.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            String str4 = C7001g.f22406b;
            Integer[] numArr = new Integer[iArr.length];
            while (i10 < iArr.length) {
                numArr[i10] = Integer.valueOf(iArr[i10]);
                i10++;
            }
            map.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            String str5 = C7001g.f22406b;
            Long[] lArr = new Long[jArr.length];
            while (i10 < jArr.length) {
                lArr[i10] = Long.valueOf(jArr[i10]);
                i10++;
            }
            map.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            String str6 = C7001g.f22406b;
            Float[] fArr2 = new Float[fArr.length];
            while (i10 < fArr.length) {
                fArr2[i10] = Float.valueOf(fArr[i10]);
                i10++;
            }
            map.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        String str7 = C7001g.f22406b;
        Double[] dArr2 = new Double[dArr.length];
        while (i10 < dArr.length) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
            i10++;
        }
        map.put(str, dArr2);
    }

    /* JADX INFO: renamed from: d */
    public void m3441d(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            m3440c(entry.getValue(), (String) entry.getKey());
        }
    }

    public String toString() {
        switch (this.f7307a) {
            case 0:
                return "AllSampler { sample=true }";
            default:
                return super.toString();
        }
    }
}
