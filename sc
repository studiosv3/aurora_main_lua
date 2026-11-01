-- ==========================================
-- AURORA HUB UNIVERSAL LOADER
-- ==========================================
local loaderUrl = "https://pastefy.app/Vqubue7Z/raw"

local success, response = pcall(function()
    return game:HttpGet(loaderUrl)
end)

if success and response and response ~= "" then
    local loadFunc, err = loadstring(response)
    if loadFunc then
        loadFunc()
    else
        warn("Aurora Hub Syntax Error: " .. tostring(err))
    end
else
    warn("Failed to load Aurora Hub. Please check your internet connection or ensure the link is valid!!")
end
