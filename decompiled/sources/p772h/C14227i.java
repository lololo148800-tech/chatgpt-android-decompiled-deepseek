package p772h;

import android.content.Intent;
import android.content.IntentSender;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.AbstractActivityC10817a;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0078o;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p523V9.AbstractC8119j5;
import p571X9.AbstractC9306j0;
import p772h.C14227i;
import p841k.C16281a;
import p841k.C16285e;
import p841k.C16286f;
import p841k.C16287g;
import p841k.C16288h;
import p841k.C16290j;
import p841k.InterfaceC16282b;
import p859l.AbstractC16651b;
import p859l.C16650a;
import p896n2.InterfaceC17448a;

/* JADX INFO: renamed from: h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C14227i {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f44670a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f44671b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f44672c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f44673d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f44674e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f44675f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f44676g = new Bundle();

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractActivityC10817a f44677h;

    public C14227i(AbstractActivityC10817a abstractActivityC10817a) {
        this.f44677h = abstractActivityC10817a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15528a(int i10, int i11, Intent intent) {
        String str = (String) this.f44670a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        C16285e c16285e = (C16285e) this.f44674e.get(str);
        if ((c16285e != null ? c16285e.f50454a : null) != null) {
            ArrayList arrayList = this.f44673d;
            if (arrayList.contains(str)) {
                c16285e.f50454a.mo3484d(c16285e.f50455b.parseResult(i11, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f44675f.remove(str);
        this.f44676g.putParcelable(str, new C16281a(i11, intent));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m15529b(int i10, AbstractC16651b abstractC16651b, Object obj) {
        Bundle bundle;
        AbstractActivityC10817a abstractActivityC10817a = this.f44677h;
        C16650a synchronousResult = abstractC16651b.getSynchronousResult(abstractActivityC10817a, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0078o(this, i10, synchronousResult, 6));
            return;
        }
        Intent intentCreateIntent = abstractC16651b.createIntent(abstractActivityC10817a, obj);
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            AbstractC16544l.m18091d(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(abstractActivityC10817a.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                abstractActivityC10817a.startActivityForResult(intentCreateIntent, i10, bundle);
                return;
            }
            C16290j c16290j = (C16290j) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC16544l.m18091d(c16290j);
                abstractActivityC10817a.startIntentSenderForResult(c16290j.f50463Y, i10, c16290j.f50464Z, c16290j.f50465o0, c16290j.f50466p0, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0078o(this, i10, e10, 7));
                return;
            }
        }
        String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
            if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                throw new IllegalArgumentException(AbstractC9306j0.m9891j(Arrays.toString(stringArrayExtra), " must not contain null or empty values", new StringBuilder("Permission request for permissions ")));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr[i12] = stringArrayExtra[i13];
                    i12++;
                }
            }
        }
        if (abstractActivityC10817a instanceof InterfaceC17448a) {
        }
        abstractActivityC10817a.requestPermissions(stringArrayExtra, i10);
    }

    /* JADX INFO: renamed from: c */
    public final C16288h m15530c(final String key, InterfaceC11112u lifecycleOwner, final AbstractC16651b abstractC16651b, final InterfaceC16282b interfaceC16282b) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC11105n abstractC11105nMo7809i = lifecycleOwner.mo7809i();
        if (abstractC11105nMo7809i.mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + abstractC11105nMo7809i.mo7807b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m15532e(key);
        LinkedHashMap linkedHashMap = this.f44672c;
        C16286f c16286f = (C16286f) linkedHashMap.get(key);
        if (c16286f == null) {
            c16286f = new C16286f(abstractC11105nMo7809i);
        }
        InterfaceC11110s interfaceC11110s = new InterfaceC11110s() { // from class: k.d
            @Override // androidx.lifecycle.InterfaceC11110s
            /* JADX INFO: renamed from: E */
            public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
                C14227i this$0 = this.f50450Y;
                AbstractC16544l.m18094g(this$0, "this$0");
                String key2 = key;
                AbstractC16544l.m18094g(key2, "$key");
                InterfaceC16282b interfaceC16282b2 = interfaceC16282b;
                AbstractC16651b abstractC16651b2 = abstractC16651b;
                EnumC11103l enumC11103l2 = EnumC11103l.ON_START;
                LinkedHashMap linkedHashMap2 = this$0.f44674e;
                if (enumC11103l2 != enumC11103l) {
                    if (EnumC11103l.ON_STOP == enumC11103l) {
                        linkedHashMap2.remove(key2);
                        return;
                    } else {
                        if (EnumC11103l.ON_DESTROY == enumC11103l) {
                            this$0.m15533f(key2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(key2, new C16285e(interfaceC16282b2, abstractC16651b2));
                LinkedHashMap linkedHashMap3 = this$0.f44675f;
                if (linkedHashMap3.containsKey(key2)) {
                    Object obj = linkedHashMap3.get(key2);
                    linkedHashMap3.remove(key2);
                    interfaceC16282b2.mo3484d(obj);
                }
                Bundle bundle = this$0.f44676g;
                C16281a c16281a = (C16281a) AbstractC8119j5.m8621b(bundle, key2, C16281a.class);
                if (c16281a != null) {
                    bundle.remove(key2);
                    interfaceC16282b2.mo3484d(abstractC16651b2.parseResult(c16281a.f50448Y, c16281a.f50449Z));
                }
            }
        };
        c16286f.f50456a.mo7806a(interfaceC11110s);
        c16286f.f50457b.add(interfaceC11110s);
        linkedHashMap.put(key, c16286f);
        return new C16288h(this, key, abstractC16651b, 0);
    }

    /* JADX INFO: renamed from: d */
    public final C16288h m15531d(String key, AbstractC16651b abstractC16651b, InterfaceC16282b interfaceC16282b) {
        AbstractC16544l.m18094g(key, "key");
        m15532e(key);
        this.f44674e.put(key, new C16285e(interfaceC16282b, abstractC16651b));
        LinkedHashMap linkedHashMap = this.f44675f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC16282b.mo3484d(obj);
        }
        Bundle bundle = this.f44676g;
        C16281a c16281a = (C16281a) AbstractC8119j5.m8621b(bundle, key, C16281a.class);
        if (c16281a != null) {
            bundle.remove(key);
            interfaceC16282b.mo3484d(abstractC16651b.parseResult(c16281a.f50448Y, c16281a.f50449Z));
        }
        return new C16288h(this, key, abstractC16651b, 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m15532e(String str) {
        LinkedHashMap linkedHashMap = this.f44671b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C21020a) AbstractC21031l.m21491o(C16287g.f50458Y)) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f44670a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: f */
    public final void m15533f(String key) {
        Integer num;
        AbstractC16544l.m18094g(key, "key");
        if (!this.f44673d.contains(key) && (num = (Integer) this.f44671b.remove(key)) != null) {
            this.f44670a.remove(num);
        }
        this.f44674e.remove(key);
        LinkedHashMap linkedHashMap = this.f44675f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Dropping pending result for request ", key, ": ");
            sbM11058p.append(linkedHashMap.get(key));
            AbstractC15256t.m16482t("ActivityResultRegistry", sbM11058p.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f44676g;
        if (bundle.containsKey(key)) {
            AbstractC15256t.m16482t("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C16281a) AbstractC8119j5.m8621b(bundle, key, C16281a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f44672c;
        C16286f c16286f = (C16286f) linkedHashMap2.get(key);
        if (c16286f != null) {
            ArrayList arrayList = c16286f.f50457b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c16286f.f50456a.mo7808c((InterfaceC11110s) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
