package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.AbstractActivityC10817a;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.loader.app.C11119a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p003A1.C0199Q0;
import p004A2.InterfaceC0310a;
import p183H4.C3231f;
import p588Y2.C9606J;
import p588Y2.C9611O;
import p588Y2.C9636t;
import p588Y2.C9637u;
import p720e6.C13287b;
import p896n2.InterfaceC17448a;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC11001b extends AbstractActivityC10817a implements InterfaceC17448a {

    /* JADX INFO: renamed from: I0 */
    public boolean f33167I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f33168J0;

    /* JADX INFO: renamed from: G0 */
    public final C13287b f33165G0 = new C13287b(new C9637u(this), 29);

    /* JADX INFO: renamed from: H0 */
    public final C11114w f33166H0 = new C11114w(this, true);

    /* JADX INFO: renamed from: K0 */
    public boolean f33169K0 = true;

    public AbstractActivityC11001b() {
        ((C3231f) this.f32064p0.f405p0).m4125f("android:support:lifecycle", new C0199Q0(this, 1));
        final int i10 = 0;
        m11093j(new InterfaceC0310a(this) { // from class: Y2.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC11001b f29047b;

            {
                this.f29047b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f29047b.f33165G0.m14905m();
                        break;
                    default:
                        this.f29047b.f33165G0.m14905m();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f32072x0.add(new InterfaceC0310a(this) { // from class: Y2.s

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC11001b f29047b;

            {
                this.f29047b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f29047b.f33165G0.m14905m();
                        break;
                    default:
                        this.f29047b.f33165G0.m14905m();
                        break;
                }
            }
        });
        m11094k(new C9636t(this, 0));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m11761o(AbstractC11002c abstractC11002c) {
        EnumC11104m enumC11104m = EnumC11104m.f33476o0;
        boolean zM11761o = false;
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : abstractC11002c.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                C9637u c9637u = abstractComponentCallbacksC11000a.f33123E0;
                if ((c9637u == null ? null : c9637u.f29054q0) != null) {
                    zM11761o |= m11761o(abstractComponentCallbacksC11000a.m11751n());
                }
                C9611O c9611o = abstractComponentCallbacksC11000a.f33146Z0;
                EnumC11104m enumC11104m2 = EnumC11104m.f33477p0;
                if (c9611o != null) {
                    c9611o.m10153f();
                    if (c9611o.f28941q0.f33504d.compareTo(enumC11104m2) >= 0) {
                        abstractComponentCallbacksC11000a.f33146Z0.f28941q0.m12172h(enumC11104m);
                        zM11761o = true;
                    }
                }
                if (abstractComponentCallbacksC11000a.f33144Y0.f33504d.compareTo(enumC11104m2) >= 0) {
                    abstractComponentCallbacksC11000a.f33144Y0.m12172h(enumC11104m);
                    zM11761o = true;
                }
            }
        }
        return zM11761o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f33167I0);
        printWriter.print(" mResumed=");
        printWriter.print(this.f33168J0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f33169K0);
        if (getApplication() != null) {
            new C11119a(this, mo10152e()).m12176a(str3, printWriter);
        }
        ((C9637u) this.f33165G0.f42000Z).f29053p0.m11812v(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: n */
    public final C9606J m11762n() {
        return ((C9637u) this.f33165G0.f42000Z).f29053p0;
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f33165G0.m14905m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.AbstractActivityC10817a, p896n2.AbstractActivityC17454g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33166H0.m12170f(EnumC11103l.ON_CREATE);
        C9606J c9606j = ((C9637u) this.f33165G0.f42000Z).f29053p0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C9637u) this.f33165G0.f42000Z).f29053p0.f33189f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C9637u) this.f33165G0.f42000Z).f29053p0.m11801k();
        this.f33166H0.m12170f(EnumC11103l.ON_DESTROY);
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((C9637u) this.f33165G0.f42000Z).f29053p0.m11799i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f33168J0 = false;
        ((C9637u) this.f33165G0.f42000Z).f29053p0.m11810t(5);
        this.f33166H0.m12170f(EnumC11103l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f33166H0.m12170f(EnumC11103l.ON_RESUME);
        C9606J c9606j = ((C9637u) this.f33165G0.f42000Z).f29053p0;
        c9606j.f33175F = false;
        c9606j.f33176G = false;
        c9606j.f33182M.f33117g = false;
        c9606j.m11810t(7);
    }

    @Override // androidx.activity.AbstractActivityC10817a, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f33165G0.m14905m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C13287b c13287b = this.f33165G0;
        c13287b.m14905m();
        super.onResume();
        this.f33168J0 = true;
        ((C9637u) c13287b.f42000Z).f29053p0.m11815y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C13287b c13287b = this.f33165G0;
        c13287b.m14905m();
        super.onStart();
        this.f33169K0 = false;
        boolean z6 = this.f33167I0;
        C9637u c9637u = (C9637u) c13287b.f42000Z;
        if (!z6) {
            this.f33167I0 = true;
            C9606J c9606j = c9637u.f29053p0;
            c9606j.f33175F = false;
            c9606j.f33176G = false;
            c9606j.f33182M.f33117g = false;
            c9606j.m11810t(4);
        }
        c9637u.f29053p0.m11815y(true);
        this.f33166H0.m12170f(EnumC11103l.ON_START);
        C9606J c9606j2 = c9637u.f29053p0;
        c9606j2.f33175F = false;
        c9606j2.f33176G = false;
        c9606j2.f33182M.f33117g = false;
        c9606j2.m11810t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f33165G0.m14905m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f33169K0 = true;
        while (m11761o(m11762n())) {
        }
        C9606J c9606j = ((C9637u) this.f33165G0.f42000Z).f29053p0;
        c9606j.f33176G = true;
        c9606j.f33182M.f33117g = true;
        c9606j.m11810t(4);
        this.f33166H0.m12170f(EnumC11103l.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C9637u) this.f33165G0.f42000Z).f29053p0.f33189f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
