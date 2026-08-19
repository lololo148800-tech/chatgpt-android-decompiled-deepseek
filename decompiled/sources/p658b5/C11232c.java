package p658b5;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.Xml;
import androidx.lifecycle.C11069E;
import androidx.work.impl.WorkDatabase_Impl;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import org.xmlpull.v1.XmlPullParserException;
import p002A0.C0136m;
import p011A9.C0415f;
import p057C3.C1556e;
import p061C7.InterfaceC1612a;
import p1016t3.C19773X;
import p103Dn.C2153Q0;
import p1055v4.C20451v;
import p1071w0.C20728Q;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20799a;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p110E4.C2315m;
import p221Ii.RunnableC3724c;
import p239Ja.C4312o;
import p255K1.InterfaceC4531e;
import p310M9.C5311e;
import p372P3.C6325g;
import p372P3.C6330l;
import p372P3.InterfaceC6326h;
import p392Q0.C6546d;
import p444S4.C7014t;
import p444S4.C7016v;
import p444S4.InterfaceC7017w;
import p494U3.C7553a;
import p523V9.AbstractC7918J5;
import p544W9.AbstractC8746y3;
import p571X9.AbstractC9381v3;
import p676c7.C11688g;
import p697d5.C13027j;
import p817j$.util.Objects;
import p822j2.C16044a;
import p822j2.C16051h;
import p822j2.C16056m;
import p885m4.C17155e;
import p909nm.AbstractC17659D;
import p985r9.C18897g;

/* JADX INFO: renamed from: b5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11232c implements InterfaceC1612a, InterfaceC4531e, InterfaceC7017w, InterfaceC6326h {

    /* JADX INFO: renamed from: Y */
    public Object f33996Y;

    /* JADX INFO: renamed from: Z */
    public Object f33997Z;

    public /* synthetic */ C11232c(Object obj, Object obj2) {
        this.f33996Y = obj;
        this.f33997Z = obj2;
    }

    @Override // p255K1.InterfaceC4531e
    /* JADX INFO: renamed from: a */
    public int mo5271a(int i10) {
        CharSequence charSequence;
        do {
            C4312o c4312o = (C4312o) this.f33997Z;
            c4312o.m5090i(i10);
            i10 = ((BreakIterator) c4312o.f14019e).following(i10);
            if (i10 != -1) {
                charSequence = (CharSequence) this.f33996Y;
                if (i10 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: b */
    public void mo2451b(Map map) {
        C11688g c11688g = (C11688g) this.f33997Z;
        C11688g c11688g2 = new C11688g(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19248j(c11688g.f35455d, map));
        this.f33997Z = c11688g2;
        ((C5311e) this.f33996Y).m5846A(c11688g2);
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: c */
    public void mo2452c(String str, String str2, String str3, Map map) {
        C11688g c11688g = (C11688g) this.f33997Z;
        Map mapM19254p = AbstractC17659D.m19254p(map);
        c11688g.getClass();
        C11688g c11688g2 = new C11688g(str, str2, str3, mapM19254p);
        this.f33997Z = c11688g2;
        ((C5311e) this.f33996Y).m5846A(c11688g2);
    }

    @Override // p255K1.InterfaceC4531e
    /* JADX INFO: renamed from: d */
    public int mo5272d(int i10) {
        do {
            C4312o c4312o = (C4312o) this.f33997Z;
            c4312o.m5090i(i10);
            i10 = ((BreakIterator) c4312o.f14019e).preceding(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f33996Y).charAt(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    @Override // p372P3.InterfaceC6326h
    /* JADX INFO: renamed from: e */
    public C6325g mo1050e(C6330l c6330l, long j10) {
        int iM7908I;
        C6325g c6325g;
        long j11 = c6330l.f20548p0;
        int iMin = (int) Math.min(20000L, c6330l.f20547o0 - j11);
        C20811m c20811m = (C20811m) this.f33997Z;
        c20811m.m21341C(iMin);
        c6330l.mo3047d(c20811m.f66092a, 0, iMin, false);
        int i10 = -1;
        int i11 = -1;
        long j12 = -9223372036854775807L;
        while (c20811m.m21346a() >= 4) {
            if (C7553a.m7908I(c20811m.f66093b, c20811m.f66092a) != 442) {
                c20811m.m21345G(1);
            } else {
                c20811m.m21345G(4);
                long jM21106c = C20451v.m21106c(c20811m);
                if (jM21106c != -9223372036854775807L) {
                    long jM21381b = ((C20816r) this.f33996Y).m21381b(jM21106c);
                    if (jM21381b > j10) {
                        if (j12 == -9223372036854775807L) {
                            return new C6325g(jM21381b, -1, j11);
                        }
                        c6325g = new C6325g(-9223372036854775807L, 0, j11 + ((long) i11));
                    } else if (100000 + jM21381b > j10) {
                        c6325g = new C6325g(-9223372036854775807L, 0, j11 + ((long) c20811m.f66093b));
                    } else {
                        i11 = c20811m.f66093b;
                        j12 = jM21381b;
                    }
                    return c6325g;
                }
                int i12 = c20811m.f66094c;
                if (c20811m.m21346a() >= 10) {
                    c20811m.m21345G(9);
                    int iM21365t = c20811m.m21365t() & 7;
                    if (c20811m.m21346a() >= iM21365t) {
                        c20811m.m21345G(iM21365t);
                        if (c20811m.m21346a() >= 4) {
                            if (C7553a.m7908I(c20811m.f66093b, c20811m.f66092a) != 443) {
                                while (c20811m.m21346a() >= 4) {
                                    iM7908I = C7553a.m7908I(c20811m.f66093b, c20811m.f66092a);
                                    if (iM7908I == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c20811m.m21345G(4);
                            int iM21371z = c20811m.m21371z();
                            if (c20811m.m21346a() < iM21371z) {
                                c20811m.m21344F(i12);
                            } else {
                                c20811m.m21345G(iM21371z);
                                while (c20811m.m21346a() >= 4) {
                                    iM7908I = C7553a.m7908I(c20811m.f66093b, c20811m.f66092a);
                                    if (iM7908I == 442 || iM7908I == 441 || (iM7908I >>> 8) != 1) {
                                        break;
                                    }
                                    c20811m.m21345G(4);
                                    if (c20811m.m21346a() < 2) {
                                        c20811m.m21344F(i12);
                                        break;
                                    }
                                    c20811m.m21344F(Math.min(c20811m.f66094c, c20811m.f66093b + c20811m.m21371z()));
                                }
                            }
                        } else {
                            c20811m.m21344F(i12);
                        }
                    } else {
                        c20811m.m21344F(i12);
                    }
                } else {
                    c20811m.m21344F(i12);
                }
                i10 = c20811m.f66093b;
            }
        }
        return j12 != -9223372036854775807L ? new C6325g(j12, -2, j11 + ((long) i10)) : C6325g.f20523d;
    }

    @Override // p255K1.InterfaceC4531e
    /* JADX INFO: renamed from: f */
    public int mo5273f(int i10) {
        do {
            C4312o c4312o = (C4312o) this.f33997Z;
            c4312o.m5090i(i10);
            i10 = ((BreakIterator) c4312o.f14019e).preceding(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f33996Y).charAt(i10)));
        return i10;
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: g */
    public C11688g mo2453g() {
        return (C11688g) this.f33997Z;
    }

    @Override // p255K1.InterfaceC4531e
    /* JADX INFO: renamed from: h */
    public int mo5274h(int i10) {
        do {
            C4312o c4312o = (C4312o) this.f33997Z;
            c4312o.m5090i(i10);
            i10 = ((BreakIterator) c4312o.f14019e).following(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f33996Y).charAt(i10 - 1)));
        return i10;
    }

    @Override // p372P3.InterfaceC6326h
    /* JADX INFO: renamed from: i */
    public void mo1054i() {
        byte[] bArr = AbstractC20817s.f66111f;
        C20811m c20811m = (C20811m) this.f33997Z;
        c20811m.getClass();
        c20811m.m21342D(bArr.length, bArr);
    }

    /* JADX INFO: renamed from: j */
    public void m12486j(C1556e c1556e) {
        synchronized (c1556e) {
        }
        Handler handler = (Handler) this.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC3724c(this, 9, c1556e));
        }
    }

    /* JADX INFO: renamed from: k */
    public ArrayList m12487k(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f33996Y;
        workDatabase_Impl.m12339b();
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM8212b.getCount());
            while (cursorM8212b.moveToNext()) {
                arrayList.add(cursorM8212b.isNull(0) ? null : cursorM8212b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: l */
    public String m12488l() {
        return (String) ((C2153Q0) this.f33996Y).getValue();
    }

    /* JADX INFO: renamed from: m */
    public boolean m12489m(String str) {
        InterfaceC15154Q interfaceC15154QM16332f = AbstractC15152P0.m16332f();
        InterfaceC15154Q interfaceC15154QMo16291v = interfaceC15154QM16332f != null ? interfaceC15154QM16332f.mo16291v("db.sql.room", "androidx.work.impl.model.DependencyDao") : null;
        C2315m c2315mM3418a = C2315m.m3418a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            c2315mM3418a.mo3426s0(1);
        } else {
            c2315mM3418a.mo3422c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f33996Y;
        workDatabase_Impl.m12339b();
        boolean z6 = false;
        Cursor cursorM8212b = AbstractC7918J5.m8212b(workDatabase_Impl, c2315mM3418a, false);
        try {
            if (cursorM8212b.moveToFirst()) {
                z6 = cursorM8212b.getInt(0) != 0;
            }
            return z6;
        } finally {
            cursorM8212b.close();
            if (interfaceC15154QMo16291v != null) {
                interfaceC15154QMo16291v.mo16271b();
            }
            c2315mM3418a.m3425m();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m12490n(AbstractC9381v3 abstractC9381v3) {
        ((C11069E) this.f33996Y).m12124k(abstractC9381v3);
        boolean z6 = abstractC9381v3 instanceof C7016v;
        C13027j c13027j = (C13027j) this.f33997Z;
        if (z6) {
            c13027j.m14769k((C7016v) abstractC9381v3);
        } else if (abstractC9381v3 instanceof C7014t) {
            c13027j.m14770l(((C7014t) abstractC9381v3).f22427a);
        }
    }

    /* JADX INFO: renamed from: o */
    public C15378c m12491o() {
        File file = (File) this.f33997Z;
        boolean zExists = file.exists();
        File file2 = (File) this.f33996Y;
        if (zExists) {
            file2.delete();
            file.renameTo(file2);
        }
        return AbstractC8746y3.m9492c(file2, new FileInputStream(file2));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: p */
    public void m12492p(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        C16056m c16056m = new C16056m();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && ParameterNames.f31999ID.equals(attributeName)) {
                int identifier = attributeValue.contains(Separators.SLASH) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), ParameterNames.f31999ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        AbstractC15256t.m16465c("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C16051h c16051hM17629h = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    c16051hM17629h = C16056m.m17629h(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case "ConstraintOverride":
                                    c16051hM17629h = C16056m.m17629h(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case "Guideline":
                                    c16051hM17629h = C16056m.m17629h(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c16051hM17629h.f49599d.f49629a = true;
                                    break;
                                case "Barrier":
                                    c16051hM17629h = C16056m.m17629h(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c16051hM17629h.f49599d.f49644h0 = 1;
                                    break;
                                case "PropertySet":
                                    if (c16051hM17629h == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c16051hM17629h.f49597b.m17626a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Transform":
                                    if (c16051hM17629h == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c16051hM17629h.f49600e.m17627a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Layout":
                                    if (c16051hM17629h == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c16051hM17629h.f49599d.m17624a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Motion":
                                    if (c16051hM17629h == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c16051hM17629h.f49598c.m17625a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (c16051hM17629h == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C16044a.m17608a(context, xmlResourceParser, c16051hM17629h.f49601f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                ((SparseArray) this.f33997Z).put(identifier, c16056m);
                                return;
                            } else if (b == 1 || b == 2 || b == 3) {
                                c16056m.f49703c.put(Integer.valueOf(c16051hM17629h.f49596a), c16051hM17629h);
                                c16051hM17629h = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                } catch (XmlPullParserException e11) {
                    e11.printStackTrace();
                }
                ((SparseArray) this.f33997Z).put(identifier, c16056m);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12493q(String value) {
        AbstractC16544l.m18094g(value, "value");
        C2153Q0 c2153q0 = (C2153Q0) this.f33996Y;
        c2153q0.getClass();
        c2153q0.m3251l(null, value);
    }

    /* JADX INFO: renamed from: r */
    public C20799a m12494r() throws IOException {
        File file = (File) this.f33996Y;
        if (file.exists()) {
            File file2 = (File) this.f33997Z;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                AbstractC20800b.m21332t("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new C20799a(file);
        } catch (FileNotFoundException e10) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e10);
            }
            try {
                return new C20799a(file);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + file, e11);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12495s(C19773X c19773x) {
        Handler handler = (Handler) this.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC3724c(this, 8, c19773x));
        }
    }

    public C11232c(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f33996Y = new Messenger(iBinder);
            this.f33997Z = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                AbstractC15256t.m16482t("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f33997Z = new C18897g(iBinder);
            this.f33996Y = null;
        }
    }

    public C11232c(String str, C0415f c0415f, C17155e c17155e) {
        this.f33997Z = str;
        this.f33996Y = c0415f;
    }

    public C11232c(int i10) {
        switch (i10) {
            case 8:
                this.f33996Y = new C11069E();
                this.f33997Z = new C13027j();
                m12490n(InterfaceC7017w.f22429h0);
                break;
            case 14:
                this.f33996Y = new ArrayList();
                this.f33997Z = new ArrayList();
                break;
            case 19:
                C0136m c0136m = new C0136m(0);
                c0136m.f570b = Float.NaN;
                this.f33996Y = c0136m;
                this.f33997Z = new C20728Q();
                break;
            default:
                this.f33996Y = new C6546d(new Reference[16]);
                this.f33997Z = new ReferenceQueue();
                break;
        }
    }
}
