package p841k;

import android.javax.sip.C10808o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p247Jj.C4399O;
import p588Y2.C9629m;
import p588Y2.C9632p;
import p772h.C14227i;
import p859l.AbstractC16651b;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16288h extends AbstractC16283c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50459a;

    /* JADX INFO: renamed from: b */
    public final Object f50460b;

    /* JADX INFO: renamed from: c */
    public Object f50461c;

    /* JADX INFO: renamed from: d */
    public final AbstractC16651b f50462d;

    public /* synthetic */ C16288h(C14227i c14227i, String str, AbstractC16651b abstractC16651b, int i10) {
        this.f50459a = i10;
        this.f50460b = c14227i;
        this.f50461c = str;
        this.f50462d = abstractC16651b;
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: a */
    public final AbstractC16651b mo10187a() {
        switch (this.f50459a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f50462d;
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: b */
    public final void mo10188b(Object obj) {
        switch (this.f50459a) {
            case 0:
                C14227i c14227i = (C14227i) this.f50460b;
                LinkedHashMap linkedHashMap = c14227i.f44671b;
                String str = (String) this.f50461c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC16651b abstractC16651b = this.f50462d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC16651b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = c14227i.f44673d;
                arrayList.add(str);
                try {
                    c14227i.m15529b(iIntValue, abstractC16651b, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            case 1:
                C14227i c14227i2 = (C14227i) this.f50460b;
                LinkedHashMap linkedHashMap2 = c14227i2.f44671b;
                String str2 = (String) this.f50461c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC16651b abstractC16651b2 = this.f50462d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC16651b2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = c14227i2.f44673d;
                arrayList2.add(str2);
                try {
                    c14227i2.m15529b(iIntValue2, abstractC16651b2, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
            default:
                AbstractC16283c abstractC16283c = (AbstractC16283c) this.f50461c;
                if (abstractC16283c != null) {
                    abstractC16283c.mo10188b(obj);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17823c(C4399O c4399o) {
        AbstractC16651b abstractC16651b = this.f50462d;
        InterfaceC16282b interfaceC16282b = (InterfaceC16282b) this.f50460b;
        C10808o c10808o = new C10808o(c4399o, 24);
        if (c4399o.f33143Y > 1) {
            throw new IllegalStateException("Fragment " + c4399o + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        C9632p c9632p = new C9632p(c4399o, c10808o, atomicReference, abstractC16651b, interfaceC16282b);
        if (c4399o.f33143Y >= 0) {
            c9632p.mo10189a();
        } else {
            c4399o.f33151e1.add(c9632p);
        }
        this.f50461c = new C9629m(atomicReference, abstractC16651b);
    }

    /* JADX INFO: renamed from: d */
    public void m17824d() {
        ((C14227i) this.f50460b).m15533f((String) this.f50461c);
    }

    public C16288h(InterfaceC16282b interfaceC16282b, AbstractC16651b abstractC16651b) {
        this.f50459a = 2;
        this.f50462d = abstractC16651b;
        this.f50460b = interfaceC16282b;
    }
}
