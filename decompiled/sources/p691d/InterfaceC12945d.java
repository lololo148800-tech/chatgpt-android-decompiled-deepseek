package p691d;

import java.util.Iterator;
import p713e.InterfaceC13200H;

/* JADX INFO: renamed from: d.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC12945d extends InterfaceC12947f, InterfaceC13200H {
    String getHeader(String str);

    Iterator getHeaderNames();

    String getHost();

    String getMAddrParam();

    String getMethodParam();

    int getPort();

    int getTTLParam();

    String getTransportParam();

    String getUser();

    String getUserParam();

    String getUserPassword();

    boolean hasLrParam();

    boolean isSecure();

    void setHost(String str);

    void setMAddrParam(String str);

    void setPort(int i10);

    void setSecure(boolean z6);

    void setTransportParam(String str);

    void setUser(String str);
}
