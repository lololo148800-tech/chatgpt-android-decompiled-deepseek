package p520V5;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p640a6.C10513h;
import p692d0.C12960M;
import p692d0.C12977p;
import p698d6.C13032e;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: V5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7781j {

    /* JADX INFO: renamed from: c */
    public HashMap f24582c;

    /* JADX INFO: renamed from: d */
    public HashMap f24583d;

    /* JADX INFO: renamed from: e */
    public float f24584e;

    /* JADX INFO: renamed from: f */
    public HashMap f24585f;

    /* JADX INFO: renamed from: g */
    public ArrayList f24586g;

    /* JADX INFO: renamed from: h */
    public C12960M f24587h;

    /* JADX INFO: renamed from: i */
    public C12977p f24588i;

    /* JADX INFO: renamed from: j */
    public ArrayList f24589j;

    /* JADX INFO: renamed from: k */
    public Rect f24590k;

    /* JADX INFO: renamed from: l */
    public float f24591l;

    /* JADX INFO: renamed from: m */
    public float f24592m;

    /* JADX INFO: renamed from: n */
    public float f24593n;

    /* JADX INFO: renamed from: o */
    public boolean f24594o;

    /* JADX INFO: renamed from: a */
    public final C7767E f24580a = new C7767E();

    /* JADX INFO: renamed from: b */
    public final HashSet f24581b = new HashSet();

    /* JADX INFO: renamed from: p */
    public int f24595p = 0;

    /* JADX INFO: renamed from: a */
    public final void m8039a(String str) {
        AbstractC14413b.m15913b(str);
        this.f24581b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final float m8040b() {
        return (long) (((this.f24592m - this.f24591l) / this.f24593n) * 1000.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Map m8041c() {
        float fM15932c = AbstractC14418g.m15932c();
        if (fM15932c != this.f24584e) {
            for (Map.Entry entry : this.f24583d.entrySet()) {
                HashMap map = this.f24583d;
                String str = (String) entry.getKey();
                C7796y c7796y = (C7796y) entry.getValue();
                float f10 = this.f24584e / fM15932c;
                int i10 = (int) (c7796y.f24679a * f10);
                int i11 = (int) (c7796y.f24680b * f10);
                C7796y c7796y2 = new C7796y(c7796y.f24681c, i10, c7796y.f24682d, i11, c7796y.f24683e);
                Bitmap bitmap = c7796y.f24684f;
                if (bitmap != null) {
                    c7796y2.f24684f = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                }
                map.put(str, c7796y2);
            }
        }
        this.f24584e = fM15932c;
        return this.f24583d;
    }

    /* JADX INFO: renamed from: d */
    public final C10513h m8042d(String str) {
        int size = this.f24586g.size();
        for (int i10 = 0; i10 < size; i10++) {
            C10513h c10513h = (C10513h) this.f24586g.get(i10);
            String str2 = c10513h.f31155a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return c10513h;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f24589j.iterator();
        while (it.hasNext()) {
            sb2.append(((C13032e) it.next()).m14784a(Separators.f31990HT));
        }
        return sb2.toString();
    }
}
