package p1061vb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p817j$.time.ZoneOffset;
import p817j$.time.format.DateTimeFormatter;
import p817j$.util.DateRetargetClass;

/* JADX INFO: renamed from: vb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20516g {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f65131a;

    public C20516g(Context context, String str) {
        this.f65131a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m21172a() {
        try {
            long j10 = this.f65131a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f65131a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f65131a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f65131a.edit().putStringSet(key, hashSet).putLong("fire-count", j10 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m21173b() {
        try {
            SharedPreferences.Editor editorEdit = this.f65131a.edit();
            int i10 = 0;
            for (Map.Entry<String, ?> entry : this.f65131a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM21175d = m21175d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM21175d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM21175d);
                        i10++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i10 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i10);
            }
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ArrayList m21174c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f65131a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m21175d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C20510a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            m21183l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m21175d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m21176e(String str) {
        for (Map.Entry<String, ?> entry : this.f65131a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m21177f(long j10, long j11) {
        return m21175d(j10).equals(m21175d(j11));
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m21178g() {
        String strM21175d = m21175d(System.currentTimeMillis());
        this.f65131a.edit().putString("last-used-date", strM21175d).commit();
        m21179h(strM21175d);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m21179h(String str) {
        try {
            String strM21176e = m21176e(str);
            if (strM21176e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f65131a.getStringSet(strM21176e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f65131a.edit().remove(strM21176e).commit();
            } else {
                this.f65131a.edit().putStringSet(strM21176e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m21180i(long j10) {
        return m21181j(j10);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m21181j(long j10) {
        if (!this.f65131a.contains("fire-global")) {
            this.f65131a.edit().putLong("fire-global", j10).commit();
            return true;
        }
        if (m21177f(this.f65131a.getLong("fire-global", -1L), j10)) {
            return false;
        }
        this.f65131a.edit().putLong("fire-global", j10).commit();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m21182k(long j10, String str) {
        String strM21175d = m21175d(j10);
        if (this.f65131a.getString("last-used-date", "").equals(strM21175d)) {
            String strM21176e = m21176e(strM21175d);
            if (strM21176e == null) {
                return;
            }
            if (strM21176e.equals(str)) {
                return;
            }
            m21184m(str, strM21175d);
            return;
        }
        long j11 = this.f65131a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            m21172a();
            j11 = this.f65131a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f65131a.getStringSet(str, new HashSet()));
        hashSet.add(strM21175d);
        this.f65131a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", strM21175d).commit();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m21183l(long j10) {
        this.f65131a.edit().putLong("fire-global", j10).commit();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m21184m(String str, String str2) {
        m21179h(str2);
        HashSet hashSet = new HashSet(this.f65131a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f65131a.edit().putStringSet(str, hashSet).commit();
    }
}
