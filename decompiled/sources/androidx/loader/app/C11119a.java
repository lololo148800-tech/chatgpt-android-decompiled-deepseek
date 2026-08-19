package androidx.loader.app;

import android.os.Looper;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;
import p001A.C0095w0;
import p1022t9.AbstractC19824i;
import p523V9.AbstractC8138m0;
import p692d0.C12960M;
import p729ej.C13414e;
import p960q9.C18650d;
import p980r3.C18871a;

/* JADX INFO: renamed from: androidx.loader.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11119a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11112u f33517a;

    /* JADX INFO: renamed from: b */
    public final LoaderManagerImpl$LoaderViewModel f33518b;

    public C11119a(InterfaceC11112u interfaceC11112u, ViewModelStore viewModelStore) {
        this.f33517a = interfaceC11112u;
        ViewModelProvider.Factory factory = LoaderManagerImpl$LoaderViewModel.f33514d;
        this.f33518b = (LoaderManagerImpl$LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderManagerImpl$LoaderViewModel.f33514d).m12144a(AbstractC8138m0.m8670e(LoaderManagerImpl$LoaderViewModel.class));
    }

    /* JADX INFO: renamed from: a */
    public final void m12176a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.f33518b;
        if (loaderManagerImpl$LoaderViewModel.f33515b.m14655f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < loaderManagerImpl$LoaderViewModel.f33515b.m14655f(); i10++) {
                C18871a c18871a = (C18871a) loaderManagerImpl$LoaderViewModel.f33515b.m14656g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderManagerImpl$LoaderViewModel.f33515b.m14653d(i10));
                printWriter.print(": ");
                printWriter.println(c18871a.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c18871a.f60111l);
                C18650d c18650d = c18871a.f60111l;
                String str3 = str2 + "  ";
                c18650d.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(c18650d.f59397a);
                if (c18650d.f59398b || c18650d.f59401e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(c18650d.f59398b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(c18650d.f59401e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (c18650d.f59399c || c18650d.f59400d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(c18650d.f59399c);
                    printWriter.print(" mReset=");
                    printWriter.println(c18650d.f59400d);
                }
                if (c18650d.f59403g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(c18650d.f59403g);
                    printWriter.print(" waiting=");
                    c18650d.f59403g.getClass();
                    printWriter.println(false);
                }
                if (c18650d.f59404h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(c18650d.f59404h);
                    printWriter.print(" waiting=");
                    c18650d.f59404h.getClass();
                    printWriter.println(false);
                }
                if (c18871a.f60113n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c18871a.f60113n);
                    C0095w0 c0095w0 = c18871a.f60113n;
                    c0095w0.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0095w0.f410Z);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                C18650d c18650d2 = c18871a.f60111l;
                Object objMo129d = c18871a.mo129d();
                c18650d2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (objMo129d == null) {
                    sb2.append("null");
                } else {
                    Class<?> cls = objMo129d.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c18871a.f33361c > 0);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final C18650d m12177b(C13414e c13414e) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.f33518b;
        if (loaderManagerImpl$LoaderViewModel.f33516c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C18871a c18871a = (C18871a) loaderManagerImpl$LoaderViewModel.f33515b.m14652c(0);
        InterfaceC11112u interfaceC11112u = this.f33517a;
        if (c18871a != null) {
            C18650d c18650d = c18871a.f60111l;
            C0095w0 c0095w0 = new C0095w0(c18650d, c13414e);
            c18871a.m12119e(interfaceC11112u, c0095w0);
            C0095w0 c0095w1 = c18871a.f60113n;
            if (c0095w1 != null) {
                c18871a.mo12121i(c0095w1);
            }
            c18871a.f60112m = interfaceC11112u;
            c18871a.f60113n = c0095w0;
            return c18650d;
        }
        try {
            loaderManagerImpl$LoaderViewModel.f33516c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) c13414e.f42490Y;
            Set set = AbstractC19824i.f62884a;
            synchronized (set) {
            }
            C18650d c18650d2 = new C18650d(signInHubActivity, set);
            if (C18650d.class.isMemberClass() && !Modifier.isStatic(C18650d.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c18650d2);
            }
            C18871a c18871a2 = new C18871a(c18650d2);
            loaderManagerImpl$LoaderViewModel.f33515b.m14654e(0, c18871a2);
            loaderManagerImpl$LoaderViewModel.f33516c = false;
            C18650d c18650d3 = c18871a2.f60111l;
            C0095w0 c0095w2 = new C0095w0(c18650d3, c13414e);
            c18871a2.m12119e(interfaceC11112u, c0095w2);
            C0095w0 c0095w3 = c18871a2.f60113n;
            if (c0095w3 != null) {
                c18871a2.mo12121i(c0095w3);
            }
            c18871a2.f60112m = interfaceC11112u;
            c18871a2.f60113n = c0095w2;
            return c18650d3;
        } catch (Throwable th2) {
            loaderManagerImpl$LoaderViewModel.f33516c = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12178c() {
        C12960M c12960m = this.f33518b.f33515b;
        int iM14655f = c12960m.m14655f();
        for (int i10 = 0; i10 < iM14655f; i10++) {
            ((C18871a) c12960m.m14656g(i10)).m20193l();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f33517a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
