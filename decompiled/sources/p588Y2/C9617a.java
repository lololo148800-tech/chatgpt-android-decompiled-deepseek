package p588Y2;

import android.gov.nist.core.Separators;
import android.util.Log;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p582Xk.HXHG.bQBnquXS;
import p611Z2.AbstractC10151d;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: Y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9617a implements InterfaceC9604H {

    /* JADX INFO: renamed from: a */
    public final ArrayList f28957a;

    /* JADX INFO: renamed from: b */
    public int f28958b;

    /* JADX INFO: renamed from: c */
    public int f28959c;

    /* JADX INFO: renamed from: d */
    public int f28960d;

    /* JADX INFO: renamed from: e */
    public int f28961e;

    /* JADX INFO: renamed from: f */
    public int f28962f;

    /* JADX INFO: renamed from: g */
    public boolean f28963g;

    /* JADX INFO: renamed from: h */
    public String f28964h;

    /* JADX INFO: renamed from: i */
    public int f28965i;

    /* JADX INFO: renamed from: j */
    public CharSequence f28966j;

    /* JADX INFO: renamed from: k */
    public int f28967k;

    /* JADX INFO: renamed from: l */
    public CharSequence f28968l;

    /* JADX INFO: renamed from: m */
    public ArrayList f28969m;

    /* JADX INFO: renamed from: n */
    public ArrayList f28970n;

    /* JADX INFO: renamed from: o */
    public boolean f28971o;

    /* JADX INFO: renamed from: p */
    public final AbstractC11002c f28972p;

    /* JADX INFO: renamed from: q */
    public boolean f28973q;

    /* JADX INFO: renamed from: r */
    public int f28974r;

    public C9617a(AbstractC11002c abstractC11002c) {
        abstractC11002c.m11770D();
        C9637u c9637u = abstractC11002c.f33204u;
        if (c9637u != null) {
            c9637u.f29051Z.getClassLoader();
        }
        this.f28957a = new ArrayList();
        this.f28971o = false;
        this.f28974r = -1;
        this.f28972p = abstractC11002c;
    }

    @Override // p588Y2.InterfaceC9604H
    /* JADX INFO: renamed from: a */
    public final boolean mo10148a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f28963g) {
            return true;
        }
        AbstractC11002c abstractC11002c = this.f28972p;
        if (abstractC11002c.f33187d == null) {
            abstractC11002c.f33187d = new ArrayList();
        }
        abstractC11002c.f33187d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m10159b(C9610N c9610n) {
        this.f28957a.add(c9610n);
        c9610n.f28931d = this.f28958b;
        c9610n.f28932e = this.f28959c;
        c9610n.f28933f = this.f28960d;
        c9610n.f28934g = this.f28961e;
    }

    /* JADX INFO: renamed from: e */
    public final void m10162e(int i10, AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, String str, int i11) {
        String str2 = abstractComponentCallbacksC11000a.f33141W0;
        if (str2 != null) {
            AbstractC10151d.m10751c(abstractComponentCallbacksC11000a, str2);
        }
        Class<?> cls = abstractComponentCallbacksC11000a.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC11000a.f33128J0;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC11000a + ": was " + abstractComponentCallbacksC11000a.f33128J0 + " now " + str);
            }
            abstractComponentCallbacksC11000a.f33128J0 = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC11000a + " with tag " + str + " to container view with no id");
            }
            int i12 = abstractComponentCallbacksC11000a.f33126H0;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC11000a + ": was " + abstractComponentCallbacksC11000a.f33126H0 + " now " + i10);
            }
            abstractComponentCallbacksC11000a.f33126H0 = i10;
            abstractComponentCallbacksC11000a.f33127I0 = i10;
        }
        m10159b(new C9610N(i11, abstractComponentCallbacksC11000a));
        abstractComponentCallbacksC11000a.f33122D0 = this.f28972p;
    }

    /* JADX INFO: renamed from: f */
    public final void m10163f(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f28964h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f28974r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f28973q);
            if (this.f28962f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f28962f));
            }
            if (this.f28958b != 0 || this.f28959c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f28958b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f28959c));
            }
            if (this.f28960d != 0 || this.f28961e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f28960d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f28961e));
            }
            if (this.f28965i != 0 || this.f28966j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f28965i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f28966j);
            }
            if (this.f28967k != 0 || this.f28968l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f28967k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f28968l);
            }
        }
        ArrayList arrayList = this.f28957a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9610N c9610n = (C9610N) arrayList.get(i10);
            switch (c9610n.f28928a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c9610n.f28928a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(Separators.f31991SP);
            printWriter.println(c9610n.f28929b);
            if (z6) {
                if (c9610n.f28931d != 0 || c9610n.f28932e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c9610n.f28931d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c9610n.f28932e));
                }
                if (c9610n.f28933f != 0 || c9610n.f28934g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c9610n.f28933f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c9610n.f28934g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f28974r >= 0) {
            sb2.append(" #");
            sb2.append(this.f28974r);
        }
        if (this.f28964h != null) {
            sb2.append(Separators.f31991SP);
            sb2.append(this.f28964h);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m10160c(int i10) {
        if (this.f28963g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.f28957a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C9610N c9610n = (C9610N) arrayList.get(i11);
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c9610n.f28929b;
                if (abstractComponentCallbacksC11000a != null) {
                    abstractComponentCallbacksC11000a.f33121C0 += i10;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", bQBnquXS.ulbFtqgsa + c9610n.f28929b + " to " + c9610n.f28929b.f33121C0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m10161d(boolean z6) {
        if (this.f28973q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C9612P());
            m10163f(FpwNpGDhomXHZ.bPSoVul, printWriter, true);
            printWriter.close();
        }
        this.f28973q = true;
        boolean z10 = this.f28963g;
        AbstractC11002c abstractC11002c = this.f28972p;
        if (z10) {
            this.f28974r = abstractC11002c.f33192i.getAndIncrement();
        } else {
            this.f28974r = -1;
        }
        abstractC11002c.m11813w(this, z6);
        return this.f28974r;
    }
}
