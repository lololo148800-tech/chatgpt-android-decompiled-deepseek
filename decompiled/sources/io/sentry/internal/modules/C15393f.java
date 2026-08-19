package io.sentry.internal.modules;

import android.content.Context;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15393f extends AbstractC15391d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f47983d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f47984e;

    public C15393f(List list, InterfaceC15127H interfaceC15127H) {
        super(interfaceC15127H);
        this.f47984e = list;
    }

    @Override // io.sentry.internal.modules.AbstractC15391d
    /* JADX INFO: renamed from: b */
    public final Map mo16644b() {
        InterfaceC15127H interfaceC15127H = this.f47980a;
        Object obj = this.f47984e;
        switch (this.f47983d) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            interfaceC15127H.mo16298o(EnumC15375i1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapM16645c = m16645c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapM16645c;
                        }
                    } catch (Throwable th2) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            break;
                        }
                        throw th2;
                    }
                    break;
                } catch (IOException e10) {
                    interfaceC15127H.mo16297h(EnumC15375i1.INFO, "Access to resources failed.", e10);
                } catch (SecurityException e11) {
                    interfaceC15127H.mo16297h(EnumC15375i1.INFO, "Access to resources denied.", e11);
                }
                return treeMap;
            case 1:
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapM16645c2 = m16645c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapM16645c2;
                    } catch (Throwable th4) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            break;
                        }
                        throw th4;
                    }
                } catch (FileNotFoundException unused) {
                    interfaceC15127H.mo16298o(EnumC15375i1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e12) {
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error extracting modules.", e12);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Map mapMo16643a = ((InterfaceC15388a) it.next()).mo16643a();
                    if (mapMo16643a != null) {
                        treeMap3.putAll(mapMo16643a);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15393f(InterfaceC15127H interfaceC15127H) {
        super(interfaceC15127H);
        ClassLoader classLoader = C15393f.class.getClassLoader();
        this.f47984e = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public C15393f(MainApplication mainApplication, InterfaceC15127H interfaceC15127H) {
        super(interfaceC15127H);
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47984e = applicationContext != null ? applicationContext : mainApplication;
    }
}
