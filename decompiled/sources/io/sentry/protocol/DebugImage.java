package io.sentry.protocol;

import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.InterfaceC15523y0;
import java.io.IOException;
import java.util.Map;
import p658b5.C11248s;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugImage implements InterfaceC15374i0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) throws IOException {
        C11248s c11248s = (C11248s) interfaceC15523y0;
        c11248s.m12663d();
        if (this.uuid != null) {
            c11248s.m12668o("uuid");
            c11248s.m12660D(this.uuid);
        }
        if (this.type != null) {
            c11248s.m12668o("type");
            c11248s.m12660D(this.type);
        }
        if (this.debugId != null) {
            c11248s.m12668o("debug_id");
            c11248s.m12660D(this.debugId);
        }
        if (this.debugFile != null) {
            c11248s.m12668o("debug_file");
            c11248s.m12660D(this.debugFile);
        }
        if (this.codeId != null) {
            c11248s.m12668o("code_id");
            c11248s.m12660D(this.codeId);
        }
        if (this.codeFile != null) {
            c11248s.m12668o("code_file");
            c11248s.m12660D(this.codeFile);
        }
        if (this.imageAddr != null) {
            c11248s.m12668o("image_addr");
            c11248s.m12660D(this.imageAddr);
        }
        if (this.imageSize != null) {
            c11248s.m12668o("image_size");
            c11248s.m12659B(this.imageSize);
        }
        if (this.arch != null) {
            c11248s.m12668o("arch");
            c11248s.m12660D(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                c11248s.m12668o(str);
                c11248s.m12677z(interfaceC15127H, obj);
            }
        }
        c11248s.m12665h();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l4) {
        this.imageSize = l4;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
