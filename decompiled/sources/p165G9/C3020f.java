package p165G9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.hints.C15370i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p003A1.C0284r0;
import p1009s9.C19503f;
import p1060v9.AbstractC20502t;
import p1061vb.C20513d;
import p139F9.BinderC2679b;
import p139F9.InterfaceC2678a;
import p211I8.lPE.sRXLFOsOgS;
import p424R9.AbstractC6827a;
import p882m1.clb.WGTYqNchEpHca;
import p959q8.C18639a;

/* JADX INFO: renamed from: G9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3020f {

    /* JADX INFO: renamed from: d */
    public static Boolean f9097d = null;

    /* JADX INFO: renamed from: e */
    public static String f9098e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f9099f = false;

    /* JADX INFO: renamed from: g */
    public static int f9100g = -1;

    /* JADX INFO: renamed from: h */
    public static Boolean f9101h;

    /* JADX INFO: renamed from: l */
    public static C3025k f9105l;

    /* JADX INFO: renamed from: m */
    public static C3026l f9106m;

    /* JADX INFO: renamed from: a */
    public final Context f9107a;

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal f9102i = new ThreadLocal();

    /* JADX INFO: renamed from: j */
    public static final C0284r0 f9103j = new C0284r0(2);

    /* JADX INFO: renamed from: k */
    public static final C15370i f9104k = new C15370i(5);

    /* JADX INFO: renamed from: b */
    public static final C18639a f9095b = new C18639a(5);

    /* JADX INFO: renamed from: c */
    public static final C20513d f9096c = new C20513d();

    public C3020f(Context context) {
        this.f9107a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m3865a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC20502t.m21161l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            AbstractC15256t.m16465c("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + Separators.QUOTE);
            return 0;
        } catch (ClassNotFoundException unused) {
            AbstractC15256t.m16482t("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            AbstractC15256t.m16465c("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #11 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:147:0x0027, inners: #0 }] */
    /* JADX INFO: renamed from: d */
    public static int m3867d(Context context, String str, boolean z6) {
        Throwable th2;
        RemoteException e10;
        int i10;
        Cursor cursor;
        try {
            synchronized (C3020f.class) {
                Boolean bool = f9097d;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m3869f(classLoader);
                                    } catch (C3016b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m3870g(context)) {
                                        return 0;
                                    }
                                    if (f9099f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM3868e = m3868e(context, str, z6, true);
                                                String str2 = f9098e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM3875c = AbstractC3021g.m3875c();
                                                    if (classLoaderM3875c == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC3015a.m3861b();
                                                            String str3 = f9098e;
                                                            AbstractC20502t.m21157h(str3);
                                                            classLoaderM3875c = AbstractC3015a.m3860a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f9098e;
                                                            AbstractC20502t.m21157h(str4);
                                                            classLoaderM3875c = new C3022h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    m3869f(classLoaderM3875c);
                                                    declaredField.set(null, classLoaderM3875c);
                                                    f9097d = bool2;
                                                    return iM3868e;
                                                }
                                                return iM3868e;
                                            } catch (C3016b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f9097d = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        AbstractC15256t.m16482t("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m3868e(context, str, z6, false);
                    } catch (C3016b e12) {
                        AbstractC15256t.m16482t("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                C3025k c3025kM3871h = m3871h(context);
                try {
                    if (c3025kM3871h == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM6115l = c3025kM3871h.m6115l(c3025kM3871h.m6116m(), 6);
                        int i11 = parcelM6115l.readInt();
                        parcelM6115l.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f9102i;
                            C3023i c3023i = (C3023i) threadLocal.get();
                            if (c3023i != null && (cursor = c3023i.f9110a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) BinderC2679b.m3656q(c3025kM3871h.m3888v(new BinderC2679b(context), str, z6, ((Long) f9103j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            C3023i c3023i2 = (C3023i) threadLocal.get();
                                            if (c3023i2 == null || c3023i2.f9110a != null) {
                                                z10 = false;
                                            } else {
                                                c3023i2.f9110a = cursor3;
                                            }
                                            cursor2 = z10 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    e10 = e13;
                                    cursor2 = cursor3;
                                    AbstractC15256t.m16482t("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th2;
                                }
                            }
                            AbstractC15256t.m16482t("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            AbstractC15256t.m16482t("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC2679b binderC2679b = new BinderC2679b(context);
                            Parcel parcelM6116m = c3025kM3871h.m6116m();
                            AbstractC6827a.m7270c(parcelM6116m, binderC2679b);
                            parcelM6116m.writeString(str);
                            parcelM6116m.writeInt(z6 ? 1 : 0);
                            Parcel parcelM6115l2 = c3025kM3871h.m6115l(parcelM6116m, 5);
                            i10 = parcelM6115l2.readInt();
                            parcelM6115l2.recycle();
                        } else {
                            AbstractC15256t.m16482t("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC2679b binderC2679b2 = new BinderC2679b(context);
                            Parcel parcelM6116m2 = c3025kM3871h.m6116m();
                            AbstractC6827a.m7270c(parcelM6116m2, binderC2679b2);
                            parcelM6116m2.writeString(str);
                            parcelM6116m2.writeInt(z6 ? 1 : 0);
                            Parcel parcelM6115l3 = c3025kM3871h.m6115l(parcelM6116m2, 3);
                            i10 = parcelM6115l3.readInt();
                            parcelM6115l3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        } catch (Throwable th6) {
            try {
                AbstractC20502t.m21157h(context);
            } catch (Exception e15) {
                AbstractC15256t.m16466d("CrashUtils", "Error adding exception to DropBox!", e15);
            }
            throw th6;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m3868e(Context context, String str, boolean z6, boolean z10) throws Throwable {
        boolean z11;
        Cursor cursor = null;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(WGTYqNchEpHca.YWJiTcJ).authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f9103j.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (C3020f.class) {
                                    try {
                                        f9098e = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f9100g = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z11 = cursorQuery.getInt(columnIndex2) != 0;
                                            f9099f = z11;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C3023i c3023i = (C3023i) f9102i.get();
                                if (c3023i == null || c3023i.f9110a != null) {
                                    z12 = false;
                                } else {
                                    c3023i.f9110a = cursorQuery;
                                }
                                cursor = z12 ? null : cursorQuery;
                                z13 = z11;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z10 && z13) {
                                throw new C3016b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                            if (e instanceof C3016b) {
                                throw e;
                            }
                            throw new C3016b("V2 version check failed: " + e.getMessage(), e);
                        }
                    } catch (Exception e10) {
                        e = e10;
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                AbstractC15256t.m16482t("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C3016b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3869f(ClassLoader classLoader) throws C3016b {
        try {
            C3026l c3026l = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c3026l = iInterfaceQueryLocalInterface instanceof C3026l ? (C3026l) iInterfaceQueryLocalInterface : new C3026l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            f9106m = c3026l;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new C3016b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new C3016b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new C3016b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new C3016b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new C3016b("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3870g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f9101h)) {
            return true;
        }
        boolean z6 = false;
        if (f9101h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C19503f.f61952b.m20602c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f9101h = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f9099f = true;
            }
        }
        if (!z6) {
            AbstractC15256t.m16465c("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* JADX INFO: renamed from: h */
    public static C3025k m3871h(Context context) {
        C3025k c3025k;
        synchronized (C3020f.class) {
            C3025k c3025k2 = f9105l;
            if (c3025k2 != null) {
                return c3025k2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c3025k = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c3025k = iInterfaceQueryLocalInterface instanceof C3025k ? (C3025k) iInterfaceQueryLocalInterface : new C3025k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (c3025k != null) {
                    f9105l = c3025k;
                    return c3025k;
                }
            } catch (Exception e10) {
                AbstractC15256t.m16465c("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m3872b(String str) {
        try {
            return (IBinder) this.f9107a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new C3016b("Failed to instantiate module class: ".concat(str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0217 A[Catch: all -> 0x0215, TRY_ENTER, TryCatch #4 {, blocks: (B:30:0x00bb, B:32:0x00c1, B:33:0x00c3, B:101:0x0217, B:102:0x021e), top: B:156:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x0280  */
    /* JADX WARN: Code duplicated, block: B:124:0x028a  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a3 A[Catch: all -> 0x02a1, TryCatch #0 {all -> 0x02a1, blocks: (B:132:0x02a3, B:133:0x02ba, B:128:0x0299, B:129:0x02a0, B:134:0x02bb, B:135:0x02e7, B:27:0x00b6, B:105:0x0221, B:106:0x0228, B:109:0x022b, B:110:0x022c, B:111:0x0233), top: B:151:0x007d, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #10 {all -> 0x008e, blocks: (B:9:0x0053, B:13:0x0082, B:21:0x0098, B:24:0x009e, B:27:0x00b6, B:105:0x0221, B:106:0x0228, B:109:0x022b, B:110:0x022c, B:111:0x0233, B:112:0x0234, B:114:0x0252, B:116:0x0260), top: B:162:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[Catch: all -> 0x0215, TryCatch #4 {, blocks: (B:30:0x00bb, B:32:0x00c1, B:33:0x00c3, B:101:0x0217, B:102:0x021e), top: B:156:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TRY_ENTER, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TRY_ENTER, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:73:0x016d A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0178 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0197 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c3 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01cd A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01de A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f4 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01fd A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0205 A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:97:0x020d A[Catch: all -> 0x012c, b -> 0x012f, RemoteException -> 0x0132, TryCatch #10 {b -> 0x012f, RemoteException -> 0x0132, all -> 0x012c, blocks: (B:29:0x00ba, B:35:0x00c6, B:37:0x00cd, B:38:0x00e8, B:42:0x00ee, B:44:0x00f6, B:46:0x00fa, B:47:0x0108, B:54:0x0116, B:62:0x014a, B:64:0x0152, B:66:0x015a, B:67:0x0161, B:61:0x0135, B:70:0x0164, B:71:0x0165, B:72:0x016c, B:73:0x016d, B:74:0x0174, B:77:0x0177, B:78:0x0178, B:80:0x0197, B:82:0x01aa, B:84:0x01b2, B:90:0x01ee, B:92:0x01f4, B:93:0x01fd, B:94:0x0204, B:85:0x01c3, B:86:0x01ca, B:88:0x01cd, B:89:0x01de, B:95:0x0205, B:96:0x020c, B:97:0x020d, B:98:0x0214, B:104:0x0220), top: B:163:0x00ba }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x02a3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00cd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0178, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [G9.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: c */
    public static C3020f m3866c(Context context, InterfaceC3019e interfaceC3019e, String str) throws Throwable {
        ?? r6;
        ?? r10;
        C3020f c3020f;
        int i10;
        Boolean bool;
        C3025k c3025kM3871h;
        int i11;
        InterfaceC2678a interfaceC2678aM3885s;
        Object objM3656q;
        C3020f c3020f2;
        C3023i c3023i;
        C3026l c3026l;
        C3023i c3023i2;
        boolean z6;
        InterfaceC2678a interfaceC2678aM3889s;
        Cursor cursor;
        int i12;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C3016b("null application Context");
        }
        ThreadLocal threadLocal = f9102i;
        C3023i c3023i3 = (C3023i) threadLocal.get();
        C3023i c3023i4 = new C3023i();
        threadLocal.set(c3023i4);
        C0284r0 c0284r0 = f9103j;
        Long l4 = (Long) c0284r0.get();
        long jLongValue = l4.longValue();
        try {
            c0284r0.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C3018d c3018dMo3864d = interfaceC3019e.mo3864d(context2, str, f9104k);
            int i13 = c3018dMo3864d.f9092a;
            try {
                int i14 = c3018dMo3864d.f9093b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i13 + sRXLFOsOgS.ChShd + str + ":" + i14);
                    int i15 = c3018dMo3864d.f9094c;
                    try {
                        if (i15 != 0) {
                            if (i15 != -1) {
                                i14 = i14;
                                if (i15 == 1 || (i12 = c3018dMo3864d.f9093b) != 0) {
                                    if (i15 == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                        c3020f = new C3020f(applicationContext);
                                    } else {
                                        if (i15 == 1) {
                                            throw new C3016b("VersionPolicy returned invalid code:" + i15);
                                        }
                                        try {
                                            i10 = c3018dMo3864d.f9093b;
                                            try {
                                                synchronized (C3020f.class) {
                                                    if (m3870g(context)) {
                                                        throw new C3016b("Remote loading disabled");
                                                    }
                                                    bool = f9097d;
                                                }
                                                if (bool != null) {
                                                    throw new C3016b("Failed to determine which loading route to use.");
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                                    synchronized (C3020f.class) {
                                                        c3026l = f9106m;
                                                    }
                                                    if (c3026l != null) {
                                                        throw new C3016b("DynamiteLoaderV2 was not cached.");
                                                    }
                                                    c3023i2 = (C3023i) threadLocal.get();
                                                    if (c3023i2 != null || c3023i2.f9110a == null) {
                                                        throw new C3016b("No result cursor");
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = c3023i2.f9110a;
                                                    new BinderC2679b(null);
                                                    synchronized (C3020f.class) {
                                                        z6 = f9100g >= 2;
                                                    }
                                                    if (z6) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        interfaceC2678aM3889s = c3026l.m3890t(new BinderC2679b(applicationContext2), str, i10, new BinderC2679b(cursor2));
                                                    } else {
                                                        AbstractC15256t.m16482t("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        interfaceC2678aM3889s = c3026l.m3889s(new BinderC2679b(applicationContext2), str, i10, new BinderC2679b(cursor2));
                                                    }
                                                    Context context3 = (Context) BinderC2679b.m3656q(interfaceC2678aM3889s);
                                                    if (context3 == null) {
                                                        throw new C3016b("Failed to get module context");
                                                    }
                                                    c3020f2 = new C3020f(context3);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                                    c3025kM3871h = m3871h(context);
                                                    if (c3025kM3871h != null) {
                                                        throw new C3016b("Failed to create IDynamiteLoader.");
                                                    }
                                                    Parcel parcelM6115l = c3025kM3871h.m6115l(c3025kM3871h.m6116m(), 6);
                                                    i11 = parcelM6115l.readInt();
                                                    parcelM6115l.recycle();
                                                    if (i11 >= 3) {
                                                        c3023i = (C3023i) threadLocal.get();
                                                        if (c3023i != null) {
                                                            throw new C3016b("No cached result cursor holder");
                                                        }
                                                        interfaceC2678aM3885s = c3025kM3871h.m3886t(new BinderC2679b(context2), str, i10, new BinderC2679b(c3023i.f9110a));
                                                    } else if (i11 == 2) {
                                                        AbstractC15256t.m16482t("DynamiteModule", "IDynamite loader version = 2");
                                                        interfaceC2678aM3885s = c3025kM3871h.m3887u(new BinderC2679b(context2), str, i10);
                                                    } else {
                                                        AbstractC15256t.m16482t("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        interfaceC2678aM3885s = c3025kM3871h.m3885s(new BinderC2679b(context2), str, i10);
                                                    }
                                                    objM3656q = BinderC2679b.m3656q(interfaceC2678aM3885s);
                                                    if (objM3656q != null) {
                                                        throw new C3016b("Failed to load remote module.");
                                                    }
                                                    c3020f2 = new C3020f((Context) objM3656q);
                                                }
                                                c3020f = c3020f2;
                                            } catch (C3016b e10) {
                                                throw e10;
                                            } catch (RemoteException e11) {
                                                throw new C3016b("Failed to load remote module.", e11);
                                            } catch (Throwable th2) {
                                                throw new C3016b("Failed to load remote module.", th2);
                                            }
                                        } catch (C3016b e12) {
                                            AbstractC15256t.m16482t("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                            int i16 = c3018dMo3864d.f9092a;
                                            if (i16 == 0 || interfaceC3019e.mo3864d(context2, str, new C3024j(i16, 0)).f9094c != -1) {
                                                throw new C3016b("Remote load failed. No local fallback found.", e12);
                                            }
                                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                            c3020f = new C3020f(applicationContext);
                                        }
                                    }
                                    if (jLongValue == 0) {
                                        f9103j.remove();
                                    } else {
                                        f9103j.set(l4);
                                    }
                                    cursor = c3023i4.f9110a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f9102i.set(c3023i3);
                                    return c3020f;
                                }
                            } else if (c3018dMo3864d.f9092a != 0) {
                                i15 = -1;
                                i14 = i14;
                                if (i15 == 1) {
                                }
                                if (i15 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                    c3020f = new C3020f(applicationContext);
                                } else {
                                    if (i15 == 1) {
                                        throw new C3016b("VersionPolicy returned invalid code:" + i15);
                                    }
                                    i10 = c3018dMo3864d.f9093b;
                                    synchronized (C3020f.class) {
                                        if (m3870g(context)) {
                                            throw new C3016b("Remote loading disabled");
                                        }
                                        bool = f9097d;
                                        if (bool != null) {
                                            throw new C3016b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (C3020f.class) {
                                                c3026l = f9106m;
                                                if (c3026l != null) {
                                                    throw new C3016b("DynamiteLoaderV2 was not cached.");
                                                }
                                                c3023i2 = (C3023i) threadLocal.get();
                                                if (c3023i2 != null) {
                                                }
                                                throw new C3016b("No result cursor");
                                            }
                                        }
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                        c3025kM3871h = m3871h(context);
                                        if (c3025kM3871h != null) {
                                            throw new C3016b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelM6115l2 = c3025kM3871h.m6115l(c3025kM3871h.m6116m(), 6);
                                        i11 = parcelM6115l2.readInt();
                                        parcelM6115l2.recycle();
                                        if (i11 >= 3) {
                                            c3023i = (C3023i) threadLocal.get();
                                            if (c3023i != null) {
                                                throw new C3016b("No cached result cursor holder");
                                            }
                                            interfaceC2678aM3885s = c3025kM3871h.m3886t(new BinderC2679b(context2), str, i10, new BinderC2679b(c3023i.f9110a));
                                        } else if (i11 == 2) {
                                            AbstractC15256t.m16482t("DynamiteModule", "IDynamite loader version = 2");
                                            interfaceC2678aM3885s = c3025kM3871h.m3887u(new BinderC2679b(context2), str, i10);
                                        } else {
                                            AbstractC15256t.m16482t("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            interfaceC2678aM3885s = c3025kM3871h.m3885s(new BinderC2679b(context2), str, i10);
                                        }
                                        objM3656q = BinderC2679b.m3656q(interfaceC2678aM3885s);
                                        if (objM3656q != null) {
                                            throw new C3016b("Failed to load remote module.");
                                        }
                                        c3020f2 = new C3020f((Context) objM3656q);
                                        c3020f = c3020f2;
                                    }
                                }
                                if (jLongValue == 0) {
                                    f9103j.remove();
                                } else {
                                    f9103j.set(l4);
                                }
                                cursor = c3023i4.f9110a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f9102i.set(c3023i3);
                                return c3020f;
                            }
                        }
                        i14 = i12;
                        throw new C3016b("No acceptable module " + str + " found. Local version is " + c3018dMo3864d.f9092a + " and remote version is " + c3018dMo3864d.f9093b + Separators.DOT);
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = context2;
                        r10 = i14;
                        if (jLongValue == 0) {
                            f9103j.remove();
                        } else {
                            f9103j.set(l4);
                        }
                        Cursor cursor3 = r6.f9110a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        f9102i.set(r10);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r10 = c3023i3;
                    r6 = c3023i4;
                }
            } catch (Throwable th5) {
                th = th5;
                r6 = c3023i4;
                r10 = c3023i3;
            }
        } catch (Throwable th6) {
            th = th6;
            r6 = c3023i4;
            r10 = c3023i3;
        }
    }
}
