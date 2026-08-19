package io.sentry.internal.modules;

import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15391d implements InterfaceC15388a {

    /* JADX INFO: renamed from: c */
    public static final Charset f47979c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InterfaceC15127H f47980a;

    /* JADX INFO: renamed from: b */
    public Map f47981b = null;

    public AbstractC15391d(InterfaceC15127H interfaceC15127H) {
        this.f47980a = interfaceC15127H;
    }

    @Override // io.sentry.internal.modules.InterfaceC15388a
    /* JADX INFO: renamed from: a */
    public final Map mo16643a() {
        Map map = this.f47981b;
        if (map != null) {
            return map;
        }
        Map mapMo16644b = mo16644b();
        this.f47981b = mapMo16644b;
        return mapMo16644b;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map mo16644b();

    /* JADX INFO: renamed from: c */
    public final TreeMap m16645c(InputStream inputStream) {
        InterfaceC15127H interfaceC15127H = this.f47980a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f47979c));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error extracting modules.", e10);
        } catch (RuntimeException e11) {
            interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e11, "%s file is malformed.", "sentry-external-modules.txt");
        }
        return treeMap;
    }
}
