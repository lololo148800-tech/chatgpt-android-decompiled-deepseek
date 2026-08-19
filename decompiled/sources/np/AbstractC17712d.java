package np;

import android.gov.nist.core.Separators;
import androidx.work.impl.utils.p651oZ.HhJS;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import p001A.AbstractC0010F;
import p934op.C18253b;
import p951pp.AbstractC18535e;
import p951pp.C18532b;
import p951pp.C18534d;
import p951pp.C18536f;
import p951pp.C18537g;

/* JADX INFO: renamed from: np.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17712d {

    /* JADX INFO: renamed from: a */
    public static volatile int f56544a;

    /* JADX INFO: renamed from: b */
    public static final C18534d f56545b = new C18534d(1);

    /* JADX INFO: renamed from: c */
    public static final C18534d f56546c = new C18534d(0);

    /* JADX INFO: renamed from: d */
    public static final boolean f56547d;

    /* JADX INFO: renamed from: e */
    public static volatile C18534d f56548e;

    /* JADX INFO: renamed from: f */
    public static final String[] f56549f;

    /* JADX INFO: renamed from: a */
    public static ArrayList m19444a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC17712d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C18534d c18534d = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i10 = AbstractC18535e.f59052a;
                if (AbstractC0010F.m24h(2) >= AbstractC0010F.m24h(AbstractC18535e.f59053b)) {
                    AbstractC18535e.m19901c().println("SLF4J(I): " + str);
                }
                c18534d = (C18534d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e10) {
                AbstractC18535e.m19900b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e10);
            } catch (ClassNotFoundException e11) {
                e = e11;
                AbstractC18535e.m19900b("Failed to instantiate the specified SLF4JServiceProvider (" + property + Separators.RPAREN, e);
            } catch (IllegalAccessException e12) {
                e = e12;
                AbstractC18535e.m19900b("Failed to instantiate the specified SLF4JServiceProvider (" + property + Separators.RPAREN, e);
            } catch (InstantiationException e13) {
                e = e13;
                AbstractC18535e.m19900b("Failed to instantiate the specified SLF4JServiceProvider (" + property + Separators.RPAREN, e);
            } catch (NoSuchMethodException e14) {
                e = e14;
                AbstractC18535e.m19900b("Failed to instantiate the specified SLF4JServiceProvider (" + property + Separators.RPAREN, e);
            } catch (InvocationTargetException e15) {
                e = e15;
                AbstractC18535e.m19900b("Failed to instantiate the specified SLF4JServiceProvider (" + property + Separators.RPAREN, e);
            }
        }
        if (c18534d != null) {
            arrayList.add(c18534d);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C18534d.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: np.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C18534d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C18534d) it.next());
            } catch (ServiceConfigurationError e16) {
                AbstractC18535e.m19899a("A service provider failed to instantiate:\n" + e16.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C18534d m19445b() {
        if (f56544a == 0) {
            synchronized (AbstractC17712d.class) {
                try {
                    if (f56544a == 0) {
                        f56544a = 1;
                        m19446c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i10 = f56544a;
        if (i10 == 1) {
            return f56545b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f56548e;
        }
        if (i10 == 4) {
            return f56546c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: c */
    public static final void m19446c() {
        try {
            ArrayList arrayListM19444a = m19444a();
            m19450g(arrayListM19444a);
            if (arrayListM19444a.isEmpty()) {
                f56544a = 4;
                AbstractC18535e.m19902d("No SLF4J providers were found.");
                AbstractC18535e.m19902d("Defaulting to no-operation (NOP) logger implementation");
                AbstractC18535e.m19902d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC17712d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e10) {
                    AbstractC18535e.m19900b("Error getting resources from path", e10);
                }
                m19449f(linkedHashSet);
            } else {
                f56548e = (C18534d) arrayListM19444a.get(0);
                f56548e.getClass();
                f56544a = 3;
                m19448e(arrayListM19444a);
            }
            m19447d();
            if (f56544a == 3) {
                try {
                    switch (f56548e.f59049a) {
                        case 0:
                            boolean z6 = false;
                            for (String str : f56549f) {
                                if ("2.0.99".startsWith(str)) {
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                return;
                            }
                            AbstractC18535e.m19902d("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f56549f).toString());
                            AbstractC18535e.m19902d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th2) {
                    AbstractC18535e.m19900b("Unexpected problem occurred during version sanity check", th2);
                }
            }
        } catch (Exception e11) {
            f56544a = 2;
            AbstractC18535e.m19900b("Failed to instantiate SLF4J LoggerFactory", e11);
            throw new IllegalStateException("Unexpected initialization failure", e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19447d() {
        C18534d c18534d = f56545b;
        synchronized (c18534d) {
            try {
                ((C18537g) c18534d.f59050b).f59061a = true;
                C18537g c18537g = (C18537g) c18534d.f59050b;
                c18537g.getClass();
                for (C18536f c18536f : new ArrayList(c18537g.f59062b.values())) {
                    c18536f.f59055Z = m19445b().m19898a().mo19435a(c18536f.f59054Y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C18537g) f56545b.f59050b).f59063c;
        int size = linkedBlockingQueue.size();
        ArrayList<C18253b> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C18253b c18253b : arrayList) {
                if (c18253b != null) {
                    C18536f c18536f2 = c18253b.f58142b;
                    String str = c18536f2.f59054Y;
                    if (c18536f2.f59055Z == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c18536f2.f59055Z instanceof C18532b)) {
                        if (!c18536f2.m19904j()) {
                            AbstractC18535e.m19902d(str);
                        } else if (c18536f2.mo19443h(c18253b.f58141a) && c18536f2.m19904j()) {
                            try {
                                c18536f2.f59057p0.invoke(c18536f2.f59055Z, c18253b);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (c18253b.f58142b.m19904j()) {
                        AbstractC18535e.m19902d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC18535e.m19902d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC18535e.m19902d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c18253b.f58142b.f59055Z instanceof C18532b)) {
                        AbstractC18535e.m19902d("The following set of substitute loggers may have been accessed");
                        AbstractC18535e.m19902d("during the initialization phase. Logging calls during this");
                        AbstractC18535e.m19902d("phase were not honored. However, subsequent logging calls to these");
                        AbstractC18535e.m19902d(HhJS.MTl);
                        AbstractC18535e.m19902d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
        C18537g c18537g2 = (C18537g) f56545b.f59050b;
        c18537g2.f59062b.clear();
        c18537g2.f59063c.clear();
    }

    /* JADX INFO: renamed from: e */
    public static void m19448e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i10 = AbstractC18535e.f59052a;
            if (AbstractC0010F.m24h(2) >= AbstractC0010F.m24h(AbstractC18535e.f59053b)) {
                AbstractC18535e.m19901c().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C18534d) arrayList.get(0)).getClass().getName() + "]";
        int i11 = AbstractC18535e.f59052a;
        if (AbstractC0010F.m24h(1) >= AbstractC0010F.m24h(AbstractC18535e.f59053b)) {
            AbstractC18535e.m19901c().println("SLF4J(D): " + str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m19449f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC18535e.m19902d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC18535e.m19902d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC18535e.m19902d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    /* JADX INFO: renamed from: g */
    public static void m19450g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC18535e.m19902d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC18535e.m19902d("Found provider [" + ((C18534d) it.next()) + "]");
            }
            AbstractC18535e.m19902d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f56547d = property == null ? false : property.equalsIgnoreCase(YladLSetV.ZkUZQzcmVYOc);
        f56549f = new String[]{"2.0"};
    }
}
