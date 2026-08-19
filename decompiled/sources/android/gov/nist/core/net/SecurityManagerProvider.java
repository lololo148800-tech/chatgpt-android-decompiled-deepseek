package android.gov.nist.core.net;

import java.util.Properties;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes.dex */
public interface SecurityManagerProvider {
    KeyManager[] getKeyManagers(boolean z6);

    TrustManager[] getTrustManagers(boolean z6);

    void init(Properties properties);
}
