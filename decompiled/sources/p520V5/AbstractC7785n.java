package p520V5;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p023Al.C0556b;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p138F8.vJO.vRJidSveZHcTw;
import p329N3.RunnableC5611a;
import p544W9.AbstractC8752z3;
import p640a6.C10508c;
import p640a6.C10512g;
import p742f6.AbstractC13566r;
import p764g6.AbstractC13821a;
import p764g6.C13822b;
import p775h2.AbstractC14376f;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: V5.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7785n {

    /* JADX INFO: renamed from: a */
    public static final HashMap f24607a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashSet f24608b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f24609c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d */
    public static final byte[] f24610d = {31, -117, 8};

    /* JADX INFO: renamed from: a */
    public static C7766D m8043a(final String str, Callable callable, RunnableC5611a runnableC5611a) {
        C7781j c7781jM10970a = str == null ? null : C10512g.f31153b.m10970a(str);
        C7766D c7766d = c7781jM10970a != null ? new C7766D(c7781jM10970a) : null;
        HashMap map = f24607a;
        if (str != null && map.containsKey(str)) {
            c7766d = (C7766D) map.get(str);
        }
        if (c7766d != null) {
            if (runnableC5611a != null) {
                runnableC5611a.run();
            }
            return c7766d;
        }
        C7766D c7766d2 = new C7766D(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i10 = 0;
            c7766d2.m8033b(new InterfaceC7797z() { // from class: V5.l
                @Override // p520V5.InterfaceC7797z
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = AbstractC7785n.f24607a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC7785n.m8051i();
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC7785n.f24607a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC7785n.m8051i();
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            c7766d2.m8032a(new InterfaceC7797z() { // from class: V5.l
                @Override // p520V5.InterfaceC7797z
                public final void onResult(Object obj) {
                    switch (i11) {
                        case 0:
                            HashMap map2 = AbstractC7785n.f24607a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC7785n.m8051i();
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC7785n.f24607a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC7785n.m8051i();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c7766d2);
                if (map.size() == 1) {
                    m8051i();
                }
            }
        }
        return c7766d2;
    }

    /* JADX INFO: renamed from: b */
    public static C7764B m8044b(Context context, String str, String str2) {
        int i10 = 2;
        C7781j c7781jM10970a = str2 == null ? null : C10512g.f31153b.m10970a(str2);
        if (c7781jM10970a != null) {
            return new C7764B(c7781jM10970a);
        }
        try {
            C0657F c0657fM1403c = AbstractC0668b.m1403c(AbstractC0668b.m1410j(context.getAssets().open(str)));
            if (m8050h(c0657fM1403c, f24609c).booleanValue()) {
                return m8048f(context, new ZipInputStream(new C0556b(c0657fM1403c, i10)), str2);
            }
            if (m8050h(c0657fM1403c, f24610d).booleanValue()) {
                return m8045c(new GZIPInputStream(new C0556b(c0657fM1403c, i10)), str2);
            }
            String[] strArr = AbstractC13821a.f43825q0;
            return m8046d(new C13822b(c0657fM1403c), str2, true);
        } catch (IOException e10) {
            return new C7764B(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C7764B m8045c(InputStream inputStream, String str) {
        C0657F c0657fM1403c = AbstractC0668b.m1403c(AbstractC0668b.m1410j(inputStream));
        String[] strArr = AbstractC13821a.f43825q0;
        return m8046d(new C13822b(c0657fM1403c), str, true);
    }

    /* JADX INFO: renamed from: d */
    public static C7764B m8046d(C13822b c13822b, String str, boolean z6) {
        try {
            C7781j c7781jM10970a = str == null ? null : C10512g.f31153b.m10970a(str);
            if (c7781jM10970a != null) {
                return new C7764B(c7781jM10970a);
            }
            C7781j c7781jM15100a = AbstractC13566r.m15100a(c13822b);
            if (str != null) {
                C10512g.f31153b.f31154a.m3126k(str, c7781jM15100a);
            }
            return new C7764B(c7781jM15100a);
        } catch (Exception e10) {
            return new C7764B(e10);
        } finally {
            if (z6) {
                AbstractC14418g.m15931b(c13822b);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C7764B m8047e(int i10, Context context, String str) {
        int i11 = 2;
        C7781j c7781jM10970a = str == null ? null : C10512g.f31153b.m10970a(str);
        if (c7781jM10970a != null) {
            return new C7764B(c7781jM10970a);
        }
        try {
            C0657F c0657fM1403c = AbstractC0668b.m1403c(AbstractC0668b.m1410j(context.getResources().openRawResource(i10)));
            if (m8050h(c0657fM1403c, f24609c).booleanValue()) {
                return m8048f(context, new ZipInputStream(new C0556b(c0657fM1403c, i11)), str);
            }
            if (!m8050h(c0657fM1403c, f24610d).booleanValue()) {
                String[] strArr = AbstractC13821a.f43825q0;
                return m8046d(new C13822b(c0657fM1403c), str, true);
            }
            try {
                return m8045c(new GZIPInputStream(new C0556b(c0657fM1403c, i11)), str);
            } catch (IOException e10) {
                return new C7764B(e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new C7764B(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C7764B m8048f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m8049g(context, zipInputStream, str);
        } finally {
            AbstractC14418g.m15931b(zipInputStream);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m8050h(C0657F c0657f, byte[] bArr) {
        try {
            C0657F c0657fPeek = c0657f.peek();
            for (byte b : bArr) {
                if (c0657fPeek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            c0657fPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC14413b.f45287a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8051i() {
        ArrayList arrayList = new ArrayList(f24608b);
        if (arrayList.size() > 0) {
            throw AbstractC14376f.m15860z(0, arrayList);
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m8052j(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public static C7764B m8049g(Context context, ZipInputStream zipInputStream, String str) {
        C7781j c7781jM10970a;
        C7796y c7796y;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c7781jM10970a = null;
        } else {
            try {
                c7781jM10970a = C10512g.f31153b.m10970a(str);
            } catch (IOException e10) {
                return new C7764B(e10);
            }
        }
        if (c7781jM10970a != null) {
            return new C7764B(c7781jM10970a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C7781j c7781j = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C0657F c0657fM1403c = AbstractC0668b.m1403c(AbstractC0668b.m1410j(zipInputStream));
                String[] strArr = AbstractC13821a.f43825q0;
                c7781j = m8046d(new C13822b(c0657fM1403c), null, false).f24539a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(vRJidSveZHcTw.gZkqmKWBRR)) {
                String[] strArrSplit = name.split(Separators.SLASH);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(Separators.SLASH);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C7764B(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                    try {
                        C15379d c15379dM9509d2 = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                c15379dM9509d2.write(bArr, 0, i10);
                            }
                            c15379dM9509d2.flush();
                            c15379dM9509d2.close();
                            c15379dM9509d.close();
                        } catch (Throwable th2) {
                            try {
                                c15379dM9509d2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            c15379dM9509d.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    AbstractC14413b.m15914c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    AbstractC14413b.m15913b("Failed to delete temp font file " + file.getAbsolutePath() + Separators.DOT);
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c7781j == null) {
            return new C7764B(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c7781j.m8041c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    c7796y = null;
                    break;
                }
                c7796y = (C7796y) it.next();
            } while (!c7796y.f24682d.equals(str4));
            if (c7796y != null) {
                c7796y.f24684f = AbstractC14418g.m15933d((Bitmap) entry.getValue(), c7796y.f24679a, c7796y.f24680b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z6 = false;
            for (C10508c c10508c : c7781j.f24585f.values()) {
                if (c10508c.f31141a.equals(entry2.getKey())) {
                    c10508c.f31144d = (Typeface) entry2.getValue();
                    z6 = true;
                }
            }
            if (!z6) {
                AbstractC14413b.m15913b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c7781j.m8041c()).entrySet().iterator();
            while (it2.hasNext()) {
                C7796y c7796y2 = (C7796y) ((Map.Entry) it2.next()).getValue();
                if (c7796y2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = c7796y2.f24682d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        c7796y2.f24684f = AbstractC14418g.m15933d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c7796y2.f24679a, c7796y2.f24680b);
                    } catch (IllegalArgumentException e11) {
                        AbstractC14413b.m15914c("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C10512g.f31153b.f31154a.m3126k(str, c7781j);
        }
        return new C7764B(c7781j);
    }
}
