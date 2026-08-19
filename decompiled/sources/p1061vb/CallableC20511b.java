package p1061vb;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p167Gb.C3031b;

/* JADX INFO: renamed from: vb.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC20511b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20512c f65123b;

    public /* synthetic */ CallableC20511b(C20512c c20512c, int i10) {
        this.f65122a = i10;
        this.f65123b = c20512c;
    }

    /* JADX INFO: renamed from: a */
    private final Object m21163a() {
        C20512c c20512c = this.f65123b;
        synchronized (c20512c) {
            ((C20516g) c20512c.f65124a.get()).m21182k(System.currentTimeMillis(), ((C3031b) c20512c.f65126c.get()).m3908a());
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f65122a) {
            case 0:
                return m21163a();
            default:
                C20512c c20512c = this.f65123b;
                synchronized (c20512c) {
                    try {
                        C20516g c20516g = (C20516g) c20512c.f65124a.get();
                        ArrayList arrayListM21174c = c20516g.m21174c();
                        c20516g.m21173b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListM21174c.size(); i10++) {
                            C20510a c20510a = (C20510a) arrayListM21174c.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c20510a.f65120a);
                            jSONObject.put("dates", new JSONArray((Collection) c20510a.f65121b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
        }
    }
}
