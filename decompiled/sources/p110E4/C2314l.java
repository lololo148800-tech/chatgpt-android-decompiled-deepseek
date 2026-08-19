package p110E4;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p003A1.AbstractC0168G;
import p031B3.AbstractC0797a;
import p1113xn.AbstractC21329w;
import p134F4.AbstractC2664a;
import p167Gb.C3032c;
import p207I4.C3614a;
import p233J4.C4256b;
import p470T4.AbstractC7249n;
import p470T4.C7237b;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p586Y0.C9572x;
import p593Y8.C9683j;
import p801i5.AbstractC14929a;
import p801i5.InterfaceC14934f;
import p909nm.C17689w;

/* JADX INFO: renamed from: E4.l */
/* JADX INFO: loaded from: classes.dex */
public class C2314l extends AbstractC0797a {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f7196o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public Object f7197p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f7198q0;

    public C2314l(C2304b c2304b, C3032c c3032c) {
        super(20, 1);
        this.f7197p0 = c2304b;
        this.f7198q0 = c3032c;
    }

    /* JADX INFO: renamed from: n */
    private final void m3417n(C4256b c4256b) {
    }

    @Override // p031B3.AbstractC0797a
    /* JADX INFO: renamed from: f */
    public void mo1825f(C4256b c4256b) {
        int i10 = this.f7196o0;
    }

    @Override // p031B3.AbstractC0797a
    /* JADX INFO: renamed from: g */
    public final void mo1826g(C4256b c4256b) {
        switch (this.f7196o0) {
            case 0:
                Cursor cursorM5025j0 = c4256b.m5025j0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                try {
                    boolean z6 = cursorM5025j0.moveToFirst() && cursorM5025j0.getInt(0) == 0;
                    AbstractC7942M5.m8232a(cursorM5025j0, null);
                    C3032c c3032c = (C3032c) this.f7198q0;
                    C3032c.m3909h(c4256b);
                    if (!z6) {
                        C2313k c2313kM3911l = C3032c.m3911l(c4256b);
                        if (!c2313kM3911l.f7194b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c2313kM3911l.f7195c);
                        }
                    }
                    c4256b.m5018E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c4256b.m5018E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c3032c.f9127Z;
                    ArrayList arrayList = workDatabase_Impl.f33707f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((C7237b) workDatabase_Impl.f33707f.get(i10)).getClass();
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(cursorM5025j0, th2);
                        throw th3;
                    }
                }
            default:
                ((InterfaceC14934f) this.f7197p0).mo1905b(new C9683j(c4256b));
                return;
        }
    }

    @Override // p031B3.AbstractC0797a
    /* JADX INFO: renamed from: i */
    public void mo1827i(C4256b c4256b, int i10, int i11) {
        switch (this.f7196o0) {
            case 0:
                mo1829l(c4256b, i10, i11);
                break;
            default:
                super.mo1827i(c4256b, i10, i11);
                break;
        }
    }

    @Override // p031B3.AbstractC0797a
    /* JADX INFO: renamed from: j */
    public void mo1828j(C4256b c4256b) {
        switch (this.f7196o0) {
            case 0:
                Cursor cursorM5025j0 = c4256b.m5025j0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    boolean z6 = cursorM5025j0.moveToFirst() && cursorM5025j0.getInt(0) != 0;
                    AbstractC7942M5.m8232a(cursorM5025j0, null);
                    if (z6) {
                        Cursor cursorM5022W = c4256b.m5022W(new C3614a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = cursorM5022W.moveToFirst() ? cursorM5022W.getString(0) : null;
                            AbstractC7942M5.m8232a(cursorM5022W, null);
                            if (!"7d73d21f1bd82c9e5268b6dcf9fde2cb".equals(string) && !"3071c8717539de5d5353f4c8cd59a032".equals(string)) {
                                throw new IllegalStateException(AbstractC9306j0.m9889h("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: ", string));
                            }
                            break;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC7942M5.m8232a(cursorM5022W, th2);
                                throw th3;
                            }
                        }
                    } else {
                        C2313k c2313kM3911l = C3032c.m3911l(c4256b);
                        if (!c2313kM3911l.f7194b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c2313kM3911l.f7195c);
                        }
                        c4256b.m5018E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        c4256b.m5018E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                    }
                    C3032c c3032c = (C3032c) this.f7198q0;
                    ((WorkDatabase_Impl) c3032c.f9127Z).f33702a = c4256b;
                    c4256b.m5018E("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c3032c.f9127Z;
                    workDatabase_Impl.getClass();
                    C2309g c2309g = workDatabase_Impl.f33705d;
                    c2309g.getClass();
                    synchronized (c2309g.f7173k) {
                        if (c2309g.f7168f) {
                            AbstractC15256t.m16465c("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c4256b.m5018E("PRAGMA temp_store = MEMORY;");
                            c4256b.m5018E("PRAGMA recursive_triggers='ON';");
                            c4256b.m5018E("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            c2309g.m3414c(c4256b);
                            c2309g.f7169g = c4256b.m5026k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            c2309g.f7168f = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) c3032c.f9127Z).f33707f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C7237b c7237b = (C7237b) ((WorkDatabase_Impl) c3032c.f9127Z).f33707f.get(i10);
                            c7237b.getClass();
                            c4256b.m5023a();
                            try {
                                StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                c7237b.f22944a.getClass();
                                sb2.append(System.currentTimeMillis() - AbstractC7249n.f22990a);
                                sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c4256b.m5018E(sb2.toString());
                                c4256b.m5028r0();
                                c4256b.m5027m();
                            } catch (Throwable th4) {
                                c4256b.m5027m();
                                throw th4;
                            }
                        }
                    }
                    this.f7197p0 = null;
                    return;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC7942M5.m8232a(cursorM5025j0, th5);
                        throw th6;
                    }
                }
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[LOOP:3: B:15:0x004b->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    @Override // p031B3.AbstractC0797a
    /* JADX INFO: renamed from: l */
    public final void mo1829l(C4256b c4256b, int i10, int i11) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z6;
        Integer targetVersion;
        int i12;
        int iIntValue;
        int iIntValue2;
        switch (this.f7196o0) {
            case 0:
                C2304b c2304b = (C2304b) this.f7197p0;
                C3032c c3032c = (C3032c) this.f7198q0;
                if (c2304b != null) {
                    C2312j c2312j = c2304b.f7145d;
                    c2312j.getClass();
                    if (i10 == i11) {
                        iterable = C17689w.f56480Y;
                    } else {
                        boolean z10 = i11 > i10;
                        ArrayList arrayList = new ArrayList();
                        int iIntValue3 = i10;
                        while (true) {
                            if (z10) {
                                if (iIntValue3 < i11) {
                                    treeMap = (TreeMap) c2312j.f7192a.get(Integer.valueOf(iIntValue3));
                                    if (treeMap != null) {
                                        if (z10) {
                                            setKeySet = treeMap.descendingKeySet();
                                        } else {
                                            setKeySet = treeMap.keySet();
                                        }
                                        it = setKeySet.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                targetVersion = (Integer) it.next();
                                                if (z10) {
                                                    i12 = iIntValue3 + 1;
                                                    AbstractC16544l.m18093f(targetVersion, "targetVersion");
                                                    iIntValue = targetVersion.intValue();
                                                    if (i12 <= iIntValue && iIntValue <= i11) {
                                                        Object obj = treeMap.get(targetVersion);
                                                        AbstractC16544l.m18091d(obj);
                                                        arrayList.add(obj);
                                                        iIntValue3 = targetVersion.intValue();
                                                        z6 = true;
                                                    }
                                                } else {
                                                    AbstractC16544l.m18093f(targetVersion, "targetVersion");
                                                    iIntValue2 = targetVersion.intValue();
                                                    if (i11 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                                        Object obj2 = treeMap.get(targetVersion);
                                                        AbstractC16544l.m18091d(obj2);
                                                        arrayList.add(obj2);
                                                        iIntValue3 = targetVersion.intValue();
                                                        z6 = true;
                                                    }
                                                }
                                            } else {
                                                z6 = false;
                                            }
                                        }
                                        if (!z6) {
                                        }
                                    }
                                    iterable = null;
                                } else {
                                    iterable = arrayList;
                                }
                            } else if (iIntValue3 > i11) {
                                treeMap = (TreeMap) c2312j.f7192a.get(Integer.valueOf(iIntValue3));
                                if (treeMap != null) {
                                    if (z10) {
                                        setKeySet = treeMap.descendingKeySet();
                                    } else {
                                        setKeySet = treeMap.keySet();
                                    }
                                    it = setKeySet.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            targetVersion = (Integer) it.next();
                                            if (z10) {
                                                i12 = iIntValue3 + 1;
                                                AbstractC16544l.m18093f(targetVersion, "targetVersion");
                                                iIntValue = targetVersion.intValue();
                                                if (i12 <= iIntValue) {
                                                    continue;
                                                }
                                            } else {
                                                AbstractC16544l.m18093f(targetVersion, "targetVersion");
                                                iIntValue2 = targetVersion.intValue();
                                                if (i11 <= iIntValue2) {
                                                    continue;
                                                }
                                            }
                                        } else {
                                            z6 = false;
                                        }
                                    }
                                    if (!z6) {
                                    }
                                }
                                iterable = null;
                            } else {
                                iterable = arrayList;
                            }
                        }
                    }
                    if (iterable != null) {
                        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                        Cursor cursorM5025j0 = c4256b.m5025j0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                        while (cursorM5025j0.moveToNext()) {
                            try {
                                c18235bM9972b.add(cursorM5025j0.getString(0));
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC7942M5.m8232a(cursorM5025j0, th2);
                                    throw th3;
                                }
                            }
                        }
                        AbstractC7942M5.m8232a(cursorM5025j0, null);
                        ListIterator listIterator = AbstractC9393x3.m9971a(c18235bM9972b).listIterator(0);
                        while (true) {
                            C9572x c9572x = (C9572x) listIterator;
                            if (!c9572x.hasNext()) {
                                Iterator it2 = iterable.iterator();
                                while (it2.hasNext()) {
                                    ((AbstractC2664a) it2.next()).mo3639a(c4256b);
                                }
                                C2313k c2313kM3911l = C3032c.m3911l(c4256b);
                                if (!c2313kM3911l.f7194b) {
                                    throw new IllegalStateException("Migration didn't properly handle: " + c2313kM3911l.f7195c);
                                }
                                c4256b.m5018E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                                c4256b.m5018E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                                return;
                            }
                            String triggerName = (String) c9572x.next();
                            AbstractC16544l.m18093f(triggerName, "triggerName");
                            if (AbstractC21329w.m21734u(triggerName, "room_fts_content_sync_", false)) {
                                c4256b.m5018E("DROP TRIGGER IF EXISTS ".concat(triggerName));
                            }
                        }
                    }
                }
                C2304b c2304b2 = (C2304b) this.f7197p0;
                if (c2304b2 != null) {
                    boolean z11 = false;
                    if ((i10 <= i11 || !c2304b2.f7152k) && c2304b2.f7151j && ((linkedHashSet = c2304b2.f7153l) == null || !linkedHashSet.contains(Integer.valueOf(i10)))) {
                        z11 = true;
                    }
                    if (!z11) {
                        c4256b.m5018E("DROP TABLE IF EXISTS `Dependency`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `WorkSpec`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `WorkTag`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `SystemIdInfo`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `WorkName`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `WorkProgress`");
                        c4256b.m5018E("DROP TABLE IF EXISTS `Preference`");
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c3032c.f9127Z;
                        ArrayList arrayList2 = workDatabase_Impl.f33707f;
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                ((C7237b) workDatabase_Impl.f33707f.get(i13)).getClass();
                            }
                        }
                        C3032c.m3909h(c4256b);
                        return;
                    }
                }
                throw new IllegalStateException(AbstractC0168G.m532u("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            default:
                AbstractC14929a[] abstractC14929aArr = (AbstractC14929a[]) this.f7198q0;
                ((InterfaceC14934f) this.f7197p0).mo1904a(new C9683j(c4256b), i10, i11, (AbstractC14929a[]) Arrays.copyOf(abstractC14929aArr, abstractC14929aArr.length));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314l(InterfaceC14934f interfaceC14934f, AbstractC14929a[] abstractC14929aArr) {
        super((int) interfaceC14934f.getVersion(), 1);
        if (interfaceC14934f.getVersion() <= 2147483647L) {
            this.f7197p0 = interfaceC14934f;
            this.f7198q0 = abstractC14929aArr;
        } else {
            throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + interfaceC14934f.getVersion() + '.').toString());
        }
    }
}
