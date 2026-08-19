package p005A3;

import android.database.SQLException;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import bb.AbstractC11281F;
import bb.AbstractC11314g0;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import p001A.C0017I0;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20800b;
import p1119y3.C21372a;
import p232J3.C4206F;
import p658b5.C11232c;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: A3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0334u implements InterfaceC0315b {

    /* JADX INFO: renamed from: l */
    public static final HashSet f1152l = new HashSet();

    /* JADX INFO: renamed from: a */
    public final File f1153a;

    /* JADX INFO: renamed from: b */
    public final C0331r f1154b;

    /* JADX INFO: renamed from: c */
    public final C0017I0 f1155c;

    /* JADX INFO: renamed from: d */
    public final C0320g f1156d;

    /* JADX INFO: renamed from: e */
    public final HashMap f1157e;

    /* JADX INFO: renamed from: f */
    public final Random f1158f;

    /* JADX INFO: renamed from: g */
    public final boolean f1159g;

    /* JADX INFO: renamed from: h */
    public long f1160h;

    /* JADX INFO: renamed from: i */
    public long f1161i;

    /* JADX INFO: renamed from: j */
    public boolean f1162j;

    /* JADX INFO: renamed from: k */
    public C0314a f1163k;

    public C0334u(File file, C0331r c0331r, C21372a c21372a) {
        boolean zAdd;
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f64Y = new HashMap();
        c0017i0.f65Z = new SparseArray();
        c0017i0.f66o0 = new SparseBooleanArray();
        c0017i0.f67p0 = new SparseBooleanArray();
        C0325l c0325l = new C0325l(c21372a);
        File file2 = new File(file, "cached_content_index.exi");
        C0326m c0326m = new C0326m();
        c0326m.f1140b = null;
        c0326m.f1141c = null;
        C11232c c11232c = new C11232c();
        c11232c.f33996Y = file2;
        c11232c.f33997Z = new File(file2.getPath() + ".bak");
        c0326m.f1142d = c11232c;
        c0017i0.f68q0 = c0325l;
        c0017i0.f69r0 = c0326m;
        C0320g c0320g = new C0320g(c21372a);
        synchronized (C0334u.class) {
            zAdd = f1152l.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f1153a = file;
        this.f1154b = c0331r;
        this.f1155c = c0017i0;
        this.f1156d = c0320g;
        this.f1157e = new HashMap();
        this.f1158f = new Random();
        this.f1159g = true;
        this.f1160h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C0333t(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX INFO: renamed from: j */
    public static void m970j(C0334u c0334u) {
        long j10;
        C0017I0 c0017i0 = c0334u.f1155c;
        File file = c0334u.f1153a;
        if (!file.exists()) {
            try {
                m971m(file);
            } catch (C0314a e10) {
                c0334u.f1163k = e10;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC20800b.m21324l("SimpleCache", str);
            c0334u.f1163k = new C0314a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file2 = fileArrListFiles[i10];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    AbstractC20800b.m21324l("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i10++;
        }
        c0334u.f1160h = j10;
        if (j10 == -1) {
            try {
                c0334u.f1160h = m972n(file);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC20800b.m21325m("SimpleCache", str2, e11);
                c0334u.f1163k = new C0314a(str2, e11);
                return;
            }
        }
        try {
            c0017i0.m84v(c0334u.f1160h);
            C0320g c0320g = c0334u.f1156d;
            if (c0320g != null) {
                c0320g.m933c(c0334u.f1160h);
                HashMap mapM932b = c0320g.m932b();
                c0334u.m978q(file, true, fileArrListFiles, mapM932b);
                c0320g.m934d(mapM932b.keySet());
            } else {
                c0334u.m978q(file, true, fileArrListFiles, null);
            }
            AbstractC11314g0 it = AbstractC11281F.m12705t(((HashMap) c0017i0.f64Y).keySet()).iterator();
            while (it.hasNext()) {
                c0017i0.m85x((String) it.next());
            }
            try {
                c0017i0.m66E();
            } catch (IOException e12) {
                AbstractC20800b.m21325m("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC20800b.m21325m("SimpleCache", str3, e13);
            c0334u.f1163k = new C0314a(str3, e13);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m971m(File file) throws C0314a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC20800b.m21324l("SimpleCache", str);
        throw new C0314a(str);
    }

    /* JADX INFO: renamed from: n */
    public static long m972n(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, AbstractC10763a.m11052j(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* JADX INFO: renamed from: v */
    public static synchronized void m973v(File file) {
        f1152l.remove(file.getAbsoluteFile());
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: a */
    public final synchronized long mo915a() {
        return this.f1160h;
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo916b(String str, C0320g c0320g) {
        AbstractC20800b.m21320h(!this.f1162j);
        m975l();
        C0017I0 c0017i0 = this.f1155c;
        C0324k c0324kM81r = c0017i0.m81r(str);
        C0329p c0329p = c0324kM81r.f1133e;
        C0329p c0329pM967a = c0329p.m967a(c0320g);
        c0324kM81r.f1133e = c0329pM967a;
        if (!c0329pM967a.equals(c0329p)) {
            ((InterfaceC0327n) c0017i0.f68q0).mo941f(c0324kM81r);
        }
        try {
            this.f1155c.m66E();
        } catch (IOException e10) {
            throw new C0314a(e10);
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: c */
    public final synchronized AbstractC0322i mo917c(long j10, long j11, String str) {
        AbstractC20800b.m21320h(!this.f1162j);
        m975l();
        C0335v c0335vM977p = m977p(j10, j11, str);
        if (c0335vM977p.f1124p0) {
            return m982u(str, c0335vM977p);
        }
        C0324k c0324kM81r = this.f1155c.m81r(str);
        long j12 = c0335vM977p.f1123o0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = c0324kM81r.f1132d;
            if (i10 >= arrayList.size()) {
                arrayList.add(new C0323j(j10, j12));
                return c0335vM977p;
            }
            C0323j c0323j = (C0323j) arrayList.get(i10);
            long j13 = c0323j.f1127a;
            if (j13 <= j10) {
                long j14 = c0323j.f1128b;
                if (j14 == -1 || j13 + j14 > j10) {
                    return null;
                }
                i10++;
            } else {
                if (j12 == -1 || j10 + j12 > j13) {
                    return null;
                }
                i10++;
            }
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: d */
    public final synchronized void mo918d(AbstractC0322i abstractC0322i) {
        AbstractC20800b.m21320h(!this.f1162j);
        C0324k c0324kM78o = this.f1155c.m78o(abstractC0322i.f1121Y);
        c0324kM78o.getClass();
        long j10 = abstractC0322i.f1122Z;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = c0324kM78o.f1132d;
            if (i10 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((C0323j) arrayList.get(i10)).f1127a == j10) {
                arrayList.remove(i10);
                this.f1155c.m85x(c0324kM78o.f1130b);
                notifyAll();
            } else {
                i10++;
            }
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: e */
    public final synchronized InterfaceC0328o mo919e(String str) {
        C0324k c0324kM78o;
        AbstractC20800b.m21320h(!this.f1162j);
        c0324kM78o = this.f1155c.m78o(str);
        return c0324kM78o != null ? c0324kM78o.f1133e : C0329p.f1144c;
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: f */
    public final synchronized File mo920f(long j10, long j11, String str) {
        C0324k c0324kM78o;
        File file;
        try {
            AbstractC20800b.m21320h(!this.f1162j);
            m975l();
            c0324kM78o = this.f1155c.m78o(str);
            c0324kM78o.getClass();
            AbstractC20800b.m21320h(c0324kM78o.m937a(j10, j11));
            if (!this.f1153a.exists()) {
                m971m(this.f1153a);
                m981t();
            }
            C0331r c0331r = this.f1154b;
            if (j11 != -1) {
                while (c0331r.f1148b + j11 > 314572800) {
                    TreeSet treeSet = c0331r.f1147a;
                    if (treeSet.isEmpty()) {
                        break;
                    }
                    m979r((AbstractC0322i) treeSet.first());
                }
            } else {
                c0331r.getClass();
            }
            file = new File(this.f1153a, Integer.toString(this.f1158f.nextInt(10)));
            if (!file.exists()) {
                m971m(file);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C0335v.m984c(file, c0324kM78o.f1129a, j10, System.currentTimeMillis());
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: g */
    public final synchronized void mo921g(File file, long j10) {
        boolean z6 = true;
        AbstractC20800b.m21320h(!this.f1162j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            C0335v c0335vM983b = C0335v.m983b(file, j10, -9223372036854775807L, this.f1155c);
            c0335vM983b.getClass();
            C0324k c0324kM78o = this.f1155c.m78o(c0335vM983b.f1121Y);
            c0324kM78o.getClass();
            AbstractC20800b.m21320h(c0324kM78o.m937a(c0335vM983b.f1122Z, c0335vM983b.f1123o0));
            long jM523l = AbstractC0168G.m523l(c0324kM78o.f1133e);
            if (jM523l != -1) {
                if (c0335vM983b.f1122Z + c0335vM983b.f1123o0 > jM523l) {
                    z6 = false;
                }
                AbstractC20800b.m21320h(z6);
            }
            if (this.f1156d == null) {
                m974k(c0335vM983b);
                this.f1155c.m66E();
                notifyAll();
                return;
            }
            try {
                this.f1156d.m935e(c0335vM983b.f1123o0, c0335vM983b.f1126r0, file.getName());
                m974k(c0335vM983b);
                try {
                    this.f1155c.m66E();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new C0314a(e10);
                }
            } catch (IOException e11) {
                throw new C0314a(e11);
            }
            throw th;
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: h */
    public final synchronized void mo922h(String str) {
        AbstractC20800b.m21320h(!this.f1162j);
        Iterator it = m976o(str).iterator();
        while (it.hasNext()) {
            m980s((AbstractC0322i) it.next());
        }
    }

    @Override // p005A3.InterfaceC0315b
    /* JADX INFO: renamed from: i */
    public final synchronized AbstractC0322i mo923i(long j10, long j11, String str) {
        AbstractC0322i abstractC0322iMo917c;
        AbstractC20800b.m21320h(!this.f1162j);
        m975l();
        while (true) {
            abstractC0322iMo917c = mo917c(j10, j11, str);
            if (abstractC0322iMo917c == null) {
                wait();
            }
        }
        return abstractC0322iMo917c;
    }

    /* JADX INFO: renamed from: k */
    public final void m974k(C0335v c0335v) {
        C0017I0 c0017i0 = this.f1155c;
        String str = c0335v.f1121Y;
        c0017i0.m81r(str).f1131c.add(c0335v);
        this.f1161i += c0335v.f1123o0;
        ArrayList arrayList = (ArrayList) this.f1157e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0331r) arrayList.get(size)).m968a(this, c0335v);
            }
        }
        this.f1154b.m968a(this, c0335v);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m975l() {
        C0314a c0314a = this.f1163k;
        if (c0314a != null) {
            throw c0314a;
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized TreeSet m976o(String str) {
        C0324k c0324kM78o;
        try {
            AbstractC20800b.m21320h(!this.f1162j);
            c0324kM78o = this.f1155c.m78o(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return (c0324kM78o == null || c0324kM78o.f1131c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) c0324kM78o.f1131c);
    }

    /* JADX INFO: renamed from: p */
    public final C0335v m977p(long j10, long j11, String str) {
        C0335v c0335v;
        long j12;
        C0324k c0324kM78o = this.f1155c.m78o(str);
        if (c0324kM78o == null) {
            return new C0335v(str, j10, j11, -9223372036854775807L, null);
        }
        while (true) {
            C0335v c0335v2 = new C0335v(c0324kM78o.f1130b, j10, -1L, -9223372036854775807L, null);
            TreeSet treeSet = c0324kM78o.f1131c;
            c0335v = (C0335v) treeSet.floor(c0335v2);
            if (c0335v == null || c0335v.f1122Z + c0335v.f1123o0 <= j10) {
                C0335v c0335v3 = (C0335v) treeSet.ceiling(c0335v2);
                if (c0335v3 != null) {
                    long jMin = c0335v3.f1122Z - j10;
                    if (j11 != -1) {
                        jMin = Math.min(jMin, j11);
                    }
                    j12 = jMin;
                } else {
                    j12 = j11;
                }
                c0335v = new C0335v(c0324kM78o.f1130b, j10, j12, -9223372036854775807L, null);
            }
            if (!c0335v.f1124p0) {
                break;
            }
            File file = c0335v.f1125q0;
            file.getClass();
            if (file.length() == c0335v.f1123o0) {
                break;
            }
            m981t();
        }
        return c0335v;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m979r(AbstractC0322i abstractC0322i) {
        AbstractC20800b.m21320h(!this.f1162j);
        m980s(abstractC0322i);
    }

    /* JADX INFO: renamed from: s */
    public final void m980s(AbstractC0322i abstractC0322i) {
        String str = abstractC0322i.f1121Y;
        C0017I0 c0017i0 = this.f1155c;
        C0324k c0324kM78o = c0017i0.m78o(str);
        if (c0324kM78o == null || !c0324kM78o.f1131c.remove(abstractC0322i)) {
            return;
        }
        File file = abstractC0322i.f1125q0;
        if (file != null) {
            file.delete();
        }
        long j10 = this.f1161i;
        long j11 = abstractC0322i.f1123o0;
        this.f1161i = j10 - j11;
        C0320g c0320g = this.f1156d;
        if (c0320g != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) c0320g.f1119b).getClass();
                try {
                    ((C21372a) c0320g.f1118a).getWritableDatabase().delete((String) c0320g.f1119b, "name = ?", new String[]{name});
                } catch (SQLException e10) {
                    throw new C4206F(e10);
                }
            } catch (IOException unused) {
                AbstractC0168G.m508C("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        c0017i0.m85x(c0324kM78o.f1130b);
        ArrayList arrayList = (ArrayList) this.f1157e.get(abstractC0322i.f1121Y);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0331r c0331r = (C0331r) arrayList.get(size);
                c0331r.f1147a.remove(abstractC0322i);
                c0331r.f1148b -= j11;
            }
        }
        C0331r c0331r2 = this.f1154b;
        c0331r2.f1147a.remove(abstractC0322i);
        c0331r2.f1148b -= j11;
    }

    /* JADX INFO: renamed from: t */
    public final void m981t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(((HashMap) this.f1155c.f64Y).values()).iterator();
        while (it.hasNext()) {
            for (AbstractC0322i abstractC0322i : ((C0324k) it.next()).f1131c) {
                File file = abstractC0322i.f1125q0;
                file.getClass();
                if (file.length() != abstractC0322i.f1123o0) {
                    arrayList.add(abstractC0322i);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m980s((AbstractC0322i) arrayList.get(i10));
        }
    }

    /* JADX INFO: renamed from: u */
    public final C0335v m982u(String str, C0335v c0335v) {
        boolean z6;
        File file;
        if (!this.f1159g) {
            return c0335v;
        }
        File file2 = c0335v.f1125q0;
        file2.getClass();
        String name = file2.getName();
        long j10 = c0335v.f1123o0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0320g c0320g = this.f1156d;
        if (c0320g != null) {
            try {
                c0320g.m935e(j10, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                AbstractC20800b.m21332t("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z6 = false;
        } else {
            z6 = true;
        }
        C0324k c0324kM78o = this.f1155c.m78o(str);
        c0324kM78o.getClass();
        TreeSet treeSet = c0324kM78o.f1131c;
        AbstractC20800b.m21320h(treeSet.remove(c0335v));
        file2.getClass();
        if (z6) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileM984c = C0335v.m984c(parentFile, c0324kM78o.f1129a, c0335v.f1122Z, jCurrentTimeMillis);
            if (file2.renameTo(fileM984c)) {
                file = fileM984c;
            } else {
                AbstractC20800b.m21332t("CachedContent", "Failed to rename " + file2 + " to " + fileM984c);
                file = file2;
            }
        } else {
            file = file2;
        }
        AbstractC20800b.m21320h(c0335v.f1124p0);
        C0335v c0335v2 = new C0335v(c0335v.f1121Y, c0335v.f1122Z, c0335v.f1123o0, jCurrentTimeMillis, file);
        treeSet.add(c0335v2);
        ArrayList arrayList = (ArrayList) this.f1157e.get(c0335v.f1121Y);
        long j11 = c0335v.f1123o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0331r c0331r = (C0331r) arrayList.get(size);
                c0331r.f1147a.remove(c0335v);
                c0331r.f1148b -= j11;
                c0331r.m968a(this, c0335v2);
            }
        }
        C0331r c0331r2 = this.f1154b;
        c0331r2.f1147a.remove(c0335v);
        c0331r2.f1148b -= j11;
        c0331r2.m968a(this, c0335v2);
        return c0335v2;
    }

    /* JADX INFO: renamed from: q */
    public final void m978q(File file, boolean z6, File[] fileArr, HashMap map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z6) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z6 && name.indexOf(46) == -1) {
                m978q(file2, false, file2.listFiles(), map);
            } else if (!z6 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(wNrQXvwLiB.sMaxHqPaIYXq))) {
                C0319f c0319f = map != null ? (C0319f) map.remove(name) : null;
                if (c0319f != null) {
                    j11 = c0319f.f1115a;
                    j10 = c0319f.f1116b;
                } else {
                    j10 = -9223372036854775807L;
                    j11 = -1;
                }
                C0335v c0335vM983b = C0335v.m983b(file2, j11, j10, this.f1155c);
                if (c0335vM983b != null) {
                    m974k(c0335vM983b);
                } else {
                    file2.delete();
                }
            }
        }
    }
}
